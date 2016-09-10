package com.gustavol95.foxgui.models;

/**
 * Created by Tavo on 01/09/2016.
 */
public class TVShow {
    private int id;
    private int image;
    private String name;
    private String summary;


    public TVShow(int id, int image, String name, String summary) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.summary = summary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
