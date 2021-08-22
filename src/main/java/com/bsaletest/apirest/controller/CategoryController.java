package com.bsaletest.apirest.controller;

import com.bsaletest.apirest.model.MCategory;
import com.bsaletest.apirest.service.CategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CategoryController {
    @Qualifier("serviceCategory")
    CategoryService service;

    @CrossOrigin(origins="*",methods = {RequestMethod.GET})
    public List<MCategory> listarCategorias(){
        return service.obtener();
    }
}
