package com.example.animal;

import android.media.Image;

public class Animal {
    private int  image;
    private String name;
    private String type;

    public Animal(int image, String name, String type) {
        this.image = image;
        this.name = name;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
