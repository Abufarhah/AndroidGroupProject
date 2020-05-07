package com.example.androidgroupproject.model;

import java.io.Serializable;

public class Movie implements Serializable {
    private String title;
    private String description;
    private int imageID;
    private String director;
    private String stars;

    public Movie(String title, String description, int imageID, String director, String stars) {
        this.title = title;
        this.description = description;
        this.imageID = imageID;
        this.director = director;
        this.stars = stars;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageID() {
        return imageID;
    }

    public String getDirector() {
        return director;
    }

    public String getStars() {
        return stars;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageID=" + imageID +
                ", director='" + director + '\'' +
                ", stars='" + stars + '\'' +
                '}';
    }
}
