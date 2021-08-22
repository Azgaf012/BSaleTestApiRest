package com.bsaletest.apirest.controller;

import com.bsaletest.apirest.model.MCategory;
import com.bsaletest.apirest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CategoryController {

    @Autowired
    @Qualifier("serviceCategory")
    CategoryService service;

    @CrossOrigin(origins = "*",methods ={RequestMethod.GET})
    @GetMapping("/categories")
    public List<MCategory> obtenerCategorias(){
        return service.obtener();
    }
}
