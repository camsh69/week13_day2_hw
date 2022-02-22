package com.day2Homework.example.day2Homework.models;

import java.util.ArrayList;

public class Folder {

    private String title;
    private ArrayList<File> files;
    private User user;

    public Folder(String title, ArrayList<File> files, User user) {
        this.title = title;
        this.files = files;
        this.user = user;
    }

    public Folder() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
