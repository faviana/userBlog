package com.ironyard.data;

import java.util.List;

/**
 * Created by favianalopez on 9/27/16.
 */
public class Blog {

    private long id;
    private String title;
    private String date;
    private List<User>users;

    public Blog(long id, String title, String date, List<User> users) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.users = users;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
