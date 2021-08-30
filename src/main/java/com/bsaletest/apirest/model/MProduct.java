package com.bsaletest.apirest.model;

import com.bsaletest.apirest.entity.Product;

/**
 * Esta clase se utiliza para evitar que el controlador trabaje directamente con la entidad Product.
 * @see MProduct
 * @author AndZuñ
 */
public class MProduct {
    private int id;
    private String name;
    private String url_image;
    private double price;
    private int discount;
    private int category;

    /**
     * Constructor vacío, utilizado por hibernate
     */
    public MProduct(){

    }

    /**
     * Constructor para crear un MProduct a partir de una entidad Product
     * @param product entidad Product
     */
    public MProduct(Product product){
        this.id = product.getId();
        this.name=product.getName();
        this.url_image=product.getUrl_image();
        this.price=product.getPrice();
        this.discount=product.getDiscount();
        this.category=product.getCategory();
    }

    /**
     * Método para ver el id de un MProduct
     * @return el id como un int.
     */
    public int getId() {
        return id;
    }

    /**
     * Método para actualizar el id de un MProduct
     * @param id el id nuevo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para ver el nombre de un MProduct
     * @return el nombre como un String.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para actualizar el nombre de un MProduct
     * @param name el nombre nuevo
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para ver la url_image de un MProduct
     * @return el url_image como un String.
     */
    public String getUrl_image() {
        return url_image;
    }

    /**
     * Método para actualizar el url_image de un MProduct
     * @param url_image el url_image nuevo
     */
    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    /**
     * Método para ver el precio de un MProduct
     * @return el precio como un double.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Método para actualizar el precio de un MProduct
     * @param price el precio nuevo
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Método para ver el id de un MProduct
     * @return el descuento como un double.
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * Método para actualizar el descuento de un MProduct
     * @param discount el descuento nuevo
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * Método para ver la categoria de un MProduct
     * @return la categoria como un int.
     */
    public int getCategory() {
        return category;
    }

    /**
     * Método para actualizar la categoria de un MProduct
     * @param category la categoria nueva
     */
    public void setCategory(int category) {
        this.category = category;
    }
}
