package com.example.epoxydemo.model;

/**
 * Created by Kros on 27/07/2017.
 */

public class Comment {
    private final int id;
    private final String comment;

    public Comment(int id, String comment) {
        this.id = id;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }
}
