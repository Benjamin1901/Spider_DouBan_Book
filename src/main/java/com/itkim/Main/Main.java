package com.itkim.Main;

import com.itkim.mapper.BookMapper;
import com.itkim.mapper.CommentMapper;
import com.itkim.pojo.Book;
import com.itkim.pojo.Comment;
import com.itkim.tools.DBTools;
import com.itkim.tools.HttpClient;
import com.vdurmont.emoji.EmojiParser;
import org.apache.ibatis.session.SqlSession;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.jdom2.JDOMException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: 写了三个方法去爬豆瓣的图书信息
 * 为了效率必须先到豆瓣图书的主页爬取书的id
 * 拿到书的id后会存到数据库去重
 * 然后再去爬图书的详细信息
 * @author: KimJun
 * @date: 3/10/19 00:56
 */
public class Main {

    private static SqlSession session = DBTools.getSession();
    private static BookMapper mapper = session.getMapper(BookMapper.class);
    private static CommentMapper mapper2 = session.getMapper(CommentMapper.class);
    //创建任务队列，可以根据你JVM堆内存大小，修改这里的容量。
    private static ArrayBlockingQueue<String> bq = new ArrayBlockingQueue(5000);

    /**
     * 根据标签页去爬取书的id和名字
     *
     * @param url https://book.douban.com/tag/%E5%8E%86%E5%8F%B2?start=20&type=T
     * @throws IOException
     */
    public static void sclawByIndex(String url) throws IOException {
        Document document = Jsoup.parse(HttpClient.get(url));
        Elements elements = document.select("#subject_list > ul > li");
        for (int i = 1; i <= elements.size(); i++) {
            Book book = new Book();
            book.setId(Integer.parseInt(elements.select("li:nth-child(" + i + ") > div.info > h2 > a").attr("href").toString().replace("https://book.douban.com/subject/", "").replace("/", "")));
            book.setBookName(elements.select("li:nth-child(" + i + ") > div.info > h2 > a").attr("title"));
            System.out.println(book);
            mapper.insert(book);
            session.commit();
        }
    }

    /**
     * 通过详细页去爬去现价、目录
     *
     * @param url https://book.douban.com/subject/26953606/
     * @throws IOException
     */
    public static void sclawByDetail(String url) throws IOException {
        Document document = Jsoup.parse(HttpClient.get(url));
        //书的id
        int bookId = Integer.parseInt(url.replace("https://book.douban.com/subject/", "").replace("/", ""));


        Book book = new Book();

        //现价
        String currentPrice = document.select("#content > div > div.aside > div:nth-child(2) > div > span:nth-child(2)").text();
        try {
            //目录
            String catalog = document.select("#dir_" + bookId + "_full").text();
            if (catalog.length() > 1000) {
                book.setCatalog("");
            } else {
                book.setCatalog(catalog);
            }
        } catch (Exception e) {

        }
        book.setCurrentPrice(currentPrice);
        book.setId(bookId);
        System.out.println(book.toString());
        mapper.updateByPrimaryKeySelective(book);
        session.commit();


//#comments > ul > li:nth-child(1) > div > h3 > span.comment-info > a

        //爬取评论
        Elements elements = document.select("#comments:nth-child(1) > ul > li");
//            System.out.println(elements.text());
        for (int i = 1; i <= elements.size(); i++) {
            Comment comment1 = new Comment();
            //用户名
            String username = elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-info > a").text();
            String username2 = EmojiParser.removeAllEmojis(username);
            comment1.setUsername(username2);

            //评分
//                #comments > ul > li:nth-child(1) > div > h3 > span.comment-info > span.user-stars.allstar40.rating
            String score = elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-info > span.user-stars.allstar50.rating").attr("title");
            if (score.isEmpty()) {
                score = elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-info > span.user-stars.allstar40.rating").attr("title");
                if (score.isEmpty()) {
                    score = elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-info > span.user-stars.allstar30.rating").attr("title");
                }
                if (score.isEmpty()) {
                    score = elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-info > span.user-stars.allstar20.rating").attr("title");
                }
                if (score.isEmpty()) {
                    score = elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-info > span.user-stars.allstar10.rating").attr("title");
                }
                if (score.isEmpty()) {
                    score = elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-info > span.user-stars.allstar0.rating").attr("title");
                }
            }

            //时间
            String time = elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-info > span:nth-child(3)").text().replace(" 2019-03-10", "");
            //评论
            String comment = elements.select("li:nth-child(" + i + ") > div > p > span").text();
            String comment2 = EmojiParser.removeAllEmojis(comment);

            //赞同
            int approval = Integer.parseInt(elements.select("li:nth-child(" + i + ") > div > h3 > span.comment-vote").text().replace("有用", "").trim().replace("  0", ""));

            comment1.setBookId(bookId);
            comment1.setScore(score);
            comment1.setApproval(approval);
            comment1.setComment(comment2);
            comment1.setTime(time);
            System.out.println(comment1.toString());
            mapper2.insertSelective(comment1);
            session.commit();
        }

    }


    /**
     * 根据url去api中爬数据，解析其中xml文档
     *
     * @param url http://api.douban.com/book/subject/4123377
     */
    public static void sclawByAPI(String url) throws IOException, JDOMException, DocumentException {
        String xml = HttpClient.get(url).replace("This XML file does not appear to have any style information associated with it. The document tree is shown below.", "");
        SAXReader saxReader = new SAXReader();
        org.dom4j.Document document = saxReader.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));
        Book book = new Book();

        //得到根节点
        Element root = document.getRootElement();

        //书的id
        int bookId = Integer.parseInt(root.element("id").getText().replace("http://api.douban.com/book/subject/", ""));
        book.setId(bookId);

        //图书封面的url
        List<Element> list = root.elements("link");
        for (Element element : list) {
            if (element.attributeValue("rel").equals("image")) {
                String link = element.attributeValue("href");
                book.setImgUrl(link);
                break;
            }
        }

        //内容简介
        try {
            Element child = root.element("summary");
            book.setBriefIntroduction(child.getText());
        } catch (Exception e) {

        }


        List<Element> list2 = root.elements("attribute");
        for (Element element : list2) {
            //书的ISBM13
            if (element.attributeValue("name").equals("isbn13")) {
                book.setIsbn(element.getText());
                System.out.println("1111111111");
            }

            //页数
            if (element.attributeValue("name").equals("pages")) {
                try {
                    book.setPages(Integer.parseInt(element.getText().replace("页", "").replace("？", "0").trim()));
                } catch (Exception e) {

                }
            }

            //书名
            if (element.attributeValue("name").equals("title")) {
                book.setBookName(element.getText());
            }

            //作者
            if (element.attributeValue("name").equals("author")) {
                book.setAuthor(element.getText());
            }

            //译者
            if (element.attributeValue("name").equals("translator")) {
                book.setTranslator(element.getText());
            }

            //原价
            if (element.attributeValue("name").equals("price")) {
                book.setOriginalPrice(element.getText());
            }

            //出版社
            if (element.attributeValue("name").equals("publisher")) {
                book.setPublishingHouse(element.getText());
            }

            //出版时间
            if (element.attributeValue("name").equals("pubdate")) {
                book.setYearOfPublication(element.getText());
            }

            //作者介绍
            if (element.attributeValue("name").equals("author-intro")) {
                book.setAuthorIntroduction(element.getText());
            }
        }

        //图书标签
        List<Element> list3 = root.elements("tag");
        StringBuilder builder = new StringBuilder();
        for (Element element : list3) {
            builder.append(element.attributeValue("name") + "/");
        }
        book.setLabel(builder.toString());

        //图书标签
        List<Element> list4 = root.elements("rating");
        for (Element element : list4) {
            if (!element.attributeValue("average").isEmpty()) {
                book.setScore(Float.parseFloat(element.attributeValue("average")));
            }
            book.setNumberOfPeople(Integer.parseInt(element.attributeValue("numRaters")));
        }


        mapper.updateByPrimaryKey(book);
        session.commit();
        System.out.println("完成一条");


    }


    public static void main(String[] args) throws Exception {

//        for (int i = 1; i <= 74; i++) {
//            sclaw("https://book.douban.com/tag/%E5%8E%86%E5%8F%B2?start=" + i * 20+ "&type=T");
//            System.out.println(i);
//            Thread.sleep(1000);
//        }

//        sclawByAPI("http://api.douban.com/book/subject/26953606");



//        List<Book> list = mapper.selectByExample(null);
//        LinkedList<String> list1 = new LinkedList();
//        for (int i = 0; i < list.size(); i++) {
//            int bookId = list.get(i).getId();
//            list1.add("http://api.douban.com/book/subject/" + bookId);
//        }
//
//        for (int i = 346; i < 1314; i++) {
//            sclawByAPI(list1.get(i));
//            System.out.println("当前--->" + (i+1));
//        }


        List<Book> list = mapper.selectByExample(null);
        for (int i = 0; i < list.size(); i++) {
            int bookId = list.get(i).getId();
            //将url添加到队列中
            bq.add("https://book.douban.com/subject/" + bookId + "/");
        }
        System.out.println("添加完成");

        //创建线程池
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(8);
        while (!bq.isEmpty() ) {
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        sclawByDetail(bq.poll());
                        fixedThreadPool.shutdown();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        fixedThreadPool.shutdown();
    }
}