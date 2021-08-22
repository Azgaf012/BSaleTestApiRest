package com.bsaletest.apirest.entity;

import javax.persistence.*;

@Table(name="category")
@Entity
public class Category {
    @GeneratedValue
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    public Category(){

    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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
}
