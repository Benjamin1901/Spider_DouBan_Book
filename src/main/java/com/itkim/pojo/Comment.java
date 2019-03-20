package com.itkim.pojo;

public class Comment {
    private Integer id;

    private Integer bookId;

    private String username;

    private String score;

    private String time;

    private String comment;

    private String picUrl;

    private Integer approval;

    private Integer oppose;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getApproval() {
        return approval;
    }

    public void setApproval(Integer approval) {
        this.approval = approval;
    }

    public Integer getOppose() {
        return oppose;
    }

    public void setOppose(Integer oppose) {
        this.oppose = oppose;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", username='" + username + '\'' +
                ", score='" + score + '\'' +
                ", time='" + time + '\'' +
                ", comment='" + comment + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", approval=" + approval +
                ", oppose=" + oppose +
                '}';
    }
}