package com.blog.Blog.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Posty{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, anons, fulltext, cringe;
    private int views;

    public Posty() {
    }

    public Posty(String title, String anons, String fulltext) {
        this.title = title;
        this.anons = anons;
        this.fulltext = fulltext;
    }
    public Posty(String title, String anons, String fulltext, String cringe) {
        this.title = title;
        this.anons = anons;
        this.fulltext = fulltext;
        this.cringe = cringe;
    }

    public Long getId() {
        return id;
    }

    public void setCringe(String cringe) {
        this.cringe = cringe;
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

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getCringe() {
        return cringe;
    }
}
