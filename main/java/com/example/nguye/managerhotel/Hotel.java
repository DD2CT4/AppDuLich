package com.example.nguye.managerhotel;

public class Hotel {
    public int id;
    public String name;
    public String address;
    public String price;
    public byte[]anh;

    public Hotel(int id, String name, String address, String price, byte[] anh) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
        this.anh = anh;
    }
}
