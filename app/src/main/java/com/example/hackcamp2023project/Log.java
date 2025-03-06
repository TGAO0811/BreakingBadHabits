package com.example.hackcamp2023project;

public class Log {
    private int rating;
    private String description;

    public Log(int i, String d) {
        this.rating = i;
        this.description = d;
    }

    public int getRating() {
        return this.rating;
    }

    public String getDecription() {
        return this.description;
    }
}
