package com.ironyard.data;

import java.util.List;

/**
 * Created by favianalopez on 9/27/16.
 */
public class Entry {

    private long id;
    private String title;
    private String text;
    private String date;
    private List<Blog> blog;

    public Entry(long id, String title, String text, String date, List<Blog> blog) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.date = date;
        this.blog = blog;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }
}
