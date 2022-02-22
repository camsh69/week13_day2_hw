package com.day2Homework.example.day2Homework.models;

import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Folder> folders;

    public User(String name, ArrayList<Folder> folders) {
        this.name = name;
        this.folders = folders;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }
}
