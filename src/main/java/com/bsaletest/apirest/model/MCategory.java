package com.bsaletest.apirest.model;

import com.bsaletest.apirest.entity.Category;

/**
 * Esta clase se utiliza para evitar que el controlador trabaje directamente con la entidad Category.
 * @see MProduct
 * @author AndZuñ
 */

public class MCategory {
    private int id;
    private String name;

    /**
     * Constructor vacio utilizado por hibernate
     */
    public MCategory(){

    }

    /**
     * Constructor para crear un MProduct a partir de una entidad Category
     * @param category entidad Category
     */
    public MCategory(Category category){
        this.id = category.getId();
        this.name=category.getName();
    }

    /**
     * Método para ver el id de una MCategory
     * @return el id como un int.
     */
    public int getId() {
        return id;
    }

    /**
     * Método para actualizar el id de una MCategory
     * @param id el id nuevo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para ver el nombre de una MCategory
     * @return el nombre como un String.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para actualizar el nombre de una MCategory
     * @param name el nombre nuevo
     */
    public void setName(String name) {
        this.name = name;
    }
}
