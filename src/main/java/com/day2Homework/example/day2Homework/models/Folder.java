package com.day2Homework.example.day2Homework.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="folders")
public class Folder {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
