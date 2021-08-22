package com.bsaletest.apirest.entity;

import javax.persistence.*;

@Table (name="product")
@Entity
public class Product {
    @GeneratedValue
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="url_image")
    private String url_image;

    @Column(name="price")
    private double price;

    @Column(name="discount")
    private int discount;

    @Column(name="category")
    private int category;

    public Product(){

    }

    public Product(int id, String name, String url_image, double price, int discount, int category) {
        this.id = id;
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);;
        this.url_image = url_image;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
