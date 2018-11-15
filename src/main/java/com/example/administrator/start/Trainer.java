package com.example.administrator.start;

public class Trainer {
    private String name;
    private int imageId;

    public Trainer(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
        }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
