package com.example.nguye.hotel;

import java.io.Serializable;

public class Trangchu implements Serializable{
    public int id;
    public String name;
    public String address;
    public String disc;
    public byte[]image;

    public Trangchu(int id, String name, String address, String disc, byte[] image) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.disc = disc;
        this.image = image;
    }
}
