package com.example.nguye.hotel;

public class Hotel {
    int image;
    String name, add;

    public Hotel(int image, String name, String add) {
        this.image = image;
        this.name = name;
        this.add = add;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }
}
