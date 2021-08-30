package com.bsaletest.apirest.service;

import com.bsaletest.apirest.converter.Convertidor;
import com.bsaletest.apirest.model.MCategory;
import com.bsaletest.apirest.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta clase se utiliza para facilitar todos los servicios al controlador.
 * @see CategoryService
 * @author AndZuñ
 */
@Service("serviceCategory")
public class CategoryService {

    @Autowired
    @Qualifier("repositoryCategory")
    private CategoryRepository repository;

    @Autowired
    @Qualifier("converter")
    private Convertidor converter;

    /**
     * Este método invoca al método findAll del repository, la ordena por nombre y luego convierte el resultado en una lista de MCategory con método convertirListaCategories del converter.
     * @return lista de MCategory
     */
    public List<MCategory> listarCategories(){
        return converter.convertirListaCategories(repository.findAll(Sort.by(Sort.Direction.ASC,"name")));
    }

}
