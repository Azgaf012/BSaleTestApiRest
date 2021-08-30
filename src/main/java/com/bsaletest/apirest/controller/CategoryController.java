package com.bsaletest.apirest.controller;

import com.bsaletest.apirest.model.MCategory;
import com.bsaletest.apirest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *Esta clase especifica los diferentes endpoint de categoría que se pueden consumir.
 * @see CategoryController
 * @author AndZuñ
 */
@RestController
@RequestMapping("/v1")
public class CategoryController {

    @Autowired
    @Qualifier("serviceCategory")
    CategoryService service;

    /**
     * Este método se ejecuta al llamar al endpoint "/categories", devuelve una lista de MCategory
     * @return lista de MCategory
     */
    @CrossOrigin(origins = "*",methods ={RequestMethod.GET})
    @GetMapping("/categories")
    public List<MCategory> obtenerCategorias(){
        return service.listarCategories();
    }
}
