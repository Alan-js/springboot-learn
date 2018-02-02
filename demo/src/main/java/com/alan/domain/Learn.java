package com.alan.domain;

/**
 * Created by 170090 on 2018/1/30.
 */
public class Learn {
    private String author;
    private String title;
    private String url;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Learn(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}
