package com.itkim.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIsNull() {
            addCriterion("publishing_house is null");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIsNotNull() {
            addCriterion("publishing_house is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseEqualTo(String value) {
            addCriterion("publishing_house =", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotEqualTo(String value) {
            addCriterion("publishing_house <>", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseGreaterThan(String value) {
            addCriterion("publishing_house >", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseGreaterThanOrEqualTo(String value) {
            addCriterion("publishing_house >=", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLessThan(String value) {
            addCriterion("publishing_house <", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLessThanOrEqualTo(String value) {
            addCriterion("publishing_house <=", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLike(String value) {
            addCriterion("publishing_house like", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotLike(String value) {
            addCriterion("publishing_house not like", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIn(List<String> values) {
            addCriterion("publishing_house in", values, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotIn(List<String> values) {
            addCriterion("publishing_house not in", values, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseBetween(String value1, String value2) {
            addCriterion("publishing_house between", value1, value2, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotBetween(String value1, String value2) {
            addCriterion("publishing_house not between", value1, value2, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andTranslatorIsNull() {
            addCriterion("translator is null");
            return (Criteria) this;
        }

        public Criteria andTranslatorIsNotNull() {
            addCriterion("translator is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatorEqualTo(String value) {
            addCriterion("translator =", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotEqualTo(String value) {
            addCriterion("translator <>", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorGreaterThan(String value) {
            addCriterion("translator >", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorGreaterThanOrEqualTo(String value) {
            addCriterion("translator >=", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLessThan(String value) {
            addCriterion("translator <", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLessThanOrEqualTo(String value) {
            addCriterion("translator <=", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLike(String value) {
            addCriterion("translator like", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotLike(String value) {
            addCriterion("translator not like", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorIn(List<String> values) {
            addCriterion("translator in", values, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotIn(List<String> values) {
            addCriterion("translator not in", values, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorBetween(String value1, String value2) {
            addCriterion("translator between", value1, value2, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotBetween(String value1, String value2) {
            addCriterion("translator not between", value1, value2, "translator");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationIsNull() {
            addCriterion("year_of_publication is null");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationIsNotNull() {
            addCriterion("year_of_publication is not null");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationEqualTo(String value) {
            addCriterion("year_of_publication =", value, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationNotEqualTo(String value) {
            addCriterion("year_of_publication <>", value, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationGreaterThan(String value) {
            addCriterion("year_of_publication >", value, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationGreaterThanOrEqualTo(String value) {
            addCriterion("year_of_publication >=", value, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationLessThan(String value) {
            addCriterion("year_of_publication <", value, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationLessThanOrEqualTo(String value) {
            addCriterion("year_of_publication <=", value, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationLike(String value) {
            addCriterion("year_of_publication like", value, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationNotLike(String value) {
            addCriterion("year_of_publication not like", value, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationIn(List<String> values) {
            addCriterion("year_of_publication in", values, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationNotIn(List<String> values) {
            addCriterion("year_of_publication not in", values, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationBetween(String value1, String value2) {
            addCriterion("year_of_publication between", value1, value2, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andYearOfPublicationNotBetween(String value1, String value2) {
            addCriterion("year_of_publication not between", value1, value2, "yearOfPublication");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Integer value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Integer value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Integer value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Integer value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Integer value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Integer> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Integer> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Integer value1, Integer value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Integer value1, Integer value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("ISBN is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("ISBN is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("ISBN =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("ISBN <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("ISBN >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("ISBN >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("ISBN <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("ISBN <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("ISBN like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("ISBN not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("ISBN in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("ISBN not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("ISBN between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("ISBN not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(String value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(String value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(String value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(String value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(String value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLike(String value) {
            addCriterion("original_price like", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotLike(String value) {
            addCriterion("original_price not like", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<String> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<String> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(String value1, String value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(String value1, String value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNull() {
            addCriterion("current_price is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNotNull() {
            addCriterion("current_price is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceEqualTo(String value) {
            addCriterion("current_price =", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotEqualTo(String value) {
            addCriterion("current_price <>", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThan(String value) {
            addCriterion("current_price >", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThanOrEqualTo(String value) {
            addCriterion("current_price >=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThan(String value) {
            addCriterion("current_price <", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThanOrEqualTo(String value) {
            addCriterion("current_price <=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLike(String value) {
            addCriterion("current_price like", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotLike(String value) {
            addCriterion("current_price not like", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIn(List<String> values) {
            addCriterion("current_price in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotIn(List<String> values) {
            addCriterion("current_price not in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceBetween(String value1, String value2) {
            addCriterion("current_price between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotBetween(String value1, String value2) {
            addCriterion("current_price not between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleIsNull() {
            addCriterion("number_of_people is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleIsNotNull() {
            addCriterion("number_of_people is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleEqualTo(Integer value) {
            addCriterion("number_of_people =", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleNotEqualTo(Integer value) {
            addCriterion("number_of_people <>", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleGreaterThan(Integer value) {
            addCriterion("number_of_people >", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_of_people >=", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleLessThan(Integer value) {
            addCriterion("number_of_people <", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("number_of_people <=", value, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleIn(List<Integer> values) {
            addCriterion("number_of_people in", values, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleNotIn(List<Integer> values) {
            addCriterion("number_of_people not in", values, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleBetween(Integer value1, Integer value2) {
            addCriterion("number_of_people between", value1, value2, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andNumberOfPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("number_of_people not between", value1, value2, "numberOfPeople");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionIsNull() {
            addCriterion("brief_introduction is null");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionIsNotNull() {
            addCriterion("brief_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionEqualTo(String value) {
            addCriterion("brief_introduction =", value, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionNotEqualTo(String value) {
            addCriterion("brief_introduction <>", value, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionGreaterThan(String value) {
            addCriterion("brief_introduction >", value, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("brief_introduction >=", value, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionLessThan(String value) {
            addCriterion("brief_introduction <", value, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionLessThanOrEqualTo(String value) {
            addCriterion("brief_introduction <=", value, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionLike(String value) {
            addCriterion("brief_introduction like", value, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionNotLike(String value) {
            addCriterion("brief_introduction not like", value, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionIn(List<String> values) {
            addCriterion("brief_introduction in", values, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionNotIn(List<String> values) {
            addCriterion("brief_introduction not in", values, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionBetween(String value1, String value2) {
            addCriterion("brief_introduction between", value1, value2, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andBriefIntroductionNotBetween(String value1, String value2) {
            addCriterion("brief_introduction not between", value1, value2, "briefIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionIsNull() {
            addCriterion("author_introduction is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionIsNotNull() {
            addCriterion("author_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionEqualTo(String value) {
            addCriterion("author_introduction =", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionNotEqualTo(String value) {
            addCriterion("author_introduction <>", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionGreaterThan(String value) {
            addCriterion("author_introduction >", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("author_introduction >=", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionLessThan(String value) {
            addCriterion("author_introduction <", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionLessThanOrEqualTo(String value) {
            addCriterion("author_introduction <=", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionLike(String value) {
            addCriterion("author_introduction like", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionNotLike(String value) {
            addCriterion("author_introduction not like", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionIn(List<String> values) {
            addCriterion("author_introduction in", values, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionNotIn(List<String> values) {
            addCriterion("author_introduction not in", values, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionBetween(String value1, String value2) {
            addCriterion("author_introduction between", value1, value2, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionNotBetween(String value1, String value2) {
            addCriterion("author_introduction not between", value1, value2, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("catalog is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(String value) {
            addCriterion("catalog =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(String value) {
            addCriterion("catalog <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(String value) {
            addCriterion("catalog >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("catalog >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(String value) {
            addCriterion("catalog <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(String value) {
            addCriterion("catalog <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLike(String value) {
            addCriterion("catalog like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotLike(String value) {
            addCriterion("catalog not like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<String> values) {
            addCriterion("catalog in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<String> values) {
            addCriterion("catalog not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(String value1, String value2) {
            addCriterion("catalog between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(String value1, String value2) {
            addCriterion("catalog not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}