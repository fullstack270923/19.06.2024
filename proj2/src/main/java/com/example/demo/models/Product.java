package com.example.demo.models;

import com.google.gson.Gson;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private static Gson gson = new Gson();

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // toString method
    @Override
    public String toString() {

        return gson.toJson(this);

//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", quantity=" + quantity +
//                '}';
    }
}
