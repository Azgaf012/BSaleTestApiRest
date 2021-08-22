package com.bsaletest.apirest.service;

import com.bsaletest.apirest.converter.Convertidor;
import com.bsaletest.apirest.model.MCategory;
import com.bsaletest.apirest.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceCategory")
public class CategoryService {


    @Qualifier("repositoryCategory")
    private CategoryRepository repository;

    @Qualifier("converter")
    private Convertidor converter;

    public List<MCategory> obtener(){
        return converter.convertirListaCategories(repository.findAll(Sort.by(Sort.Direction.ASC,"name")));
    }

}
