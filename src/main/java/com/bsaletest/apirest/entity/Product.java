package com.bsaletest.apirest.entity;

import javax.persistence.*;

/**
 * Esta clase de tipo entidad, se utiliza para interactuar con la tabla product de la base de datos.
 * @see Product
 * @author AndZuñ
 */
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

    /**
     * Constructor vacío, utilizado por hibernate
     */
    public Product(){
    }

    /**
     * Constructor para crear un producto
     * @param id id del producto como int
     * @param name nombre del producto como String
     * @param url_image url_image del producto como String
     * @param price precio del productos como double
     * @param discount descuento del producto como double
     * @param category categoría del producto como int
     */
    public Product(int id, String name, String url_image, double price, int discount, int category) {
        this.id = id;
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);;
        this.url_image = url_image;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    /**
     * Método para ver el id de un producto
     * @return el id como un int.
     */
    public int getId() {
        return id;
    }

    /**
     * Método para actualizar el id de un producto
     * @param id el id nuevo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para ver el nombre de un producto
     * @return el nombre como un String.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para actualizar el nombre de un producto
     * @param name el nombre nuevo
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para ver la url_image de un producto
     * @return el url_image como un String.
     */
    public String getUrl_image() {
        return url_image;
    }

    /**
     * Método para actualizar el url_image de un producto
     * @param url_image el url_image nuevo
     */
    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    /**
     * Método para ver el precio de un producto
     * @return el precio como un double.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Método para actualizar el precio de un producto
     * @param price el precio nuevo
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Método para ver el id de un producto
     * @return el descuento como un double.
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * Método para actualizar el descuento de un producto
     * @param discount el descuento nuevo
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * Método para ver la categoria de un producto
     * @return la categoria como un int.
     */
    public int getCategory() {
        return category;
    }

    /**
     * Método para actualizar la categoria de un producto
     * @param category la categoria nueva
     */
    public void setCategory(int category) {
        this.category = category;
    }
}
