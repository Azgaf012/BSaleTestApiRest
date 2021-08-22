package com.bsaletest.apirest.model;

import com.bsaletest.apirest.entity.Product;

public class MProduct {
    private int id;
    private String name;
    private String url_image;
    private double price;
    private int discount;
    private int category;

    public MProduct(){

    }

    public MProduct(Product product){
        this.id = product.getId();
        this.name=product.getName();
        this.url_image=product.getUrl_image();
        this.price=product.getPrice();
        this.discount=product.getDiscount();
        this.category=product.getCategory();
    }

    public MProduct(int id, String name, String url_image, double price, int discount, int category) {
        this.id = id;
        this.name = name;
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
