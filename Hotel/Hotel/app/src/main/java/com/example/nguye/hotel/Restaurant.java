package com.example.nguye.hotel;

public class Restaurant {
    int image;
    String name, add;
    String price;

    public Restaurant(int image, String name, String add, String price) {
        this.image = image;
        this.name = name;
        this.add = add;
        this.price = price;
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
    public String getPrice() {
        return price;
    }
}

