package com.bsaletest.apirest.entity;

import javax.persistence.*;

/**
 * Esta clase de tipo entidad, se utiliza para interactuar con la tabla category de la base de datos.
 * @see Category
 * @author AndZuñ
 */
@Table(name="category")
@Entity
public class Category {
    @GeneratedValue
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    /**
     * Constructor vacio utilizado por hibernate
     */
    public Category(){
    }

    /**
     *
     * @param id id de la categori como int
     * @param name nombre de la categoría como Stirng
     */
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Método para ver el id de una categoria
     * @return el id como un int.
     */
    public int getId() {
        return id;
    }

    /**
     * Método para actualizar el id de una categoría
     * @param id el id nuevo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para ver el nombre de una categoria
     * @return el nombre como un String.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para actualizar el nombre de una categoría
     * @param name el nombre nuevo
     */
    public void setName(String name) {
        this.name = name;
    }
}
