package com.bsaletest.apirest.model;

import com.bsaletest.apirest.entity.Category;

public class MCategory {
    private int id;
    private String name;

    public MCategory(){

    }

    public MCategory(Category category){
        this.id = category.getId();
        this.name=category.getName();
    }

    public MCategory(int id, String name) {
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
