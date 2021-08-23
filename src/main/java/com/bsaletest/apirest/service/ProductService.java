package com.bsaletest.apirest.service;

import com.bsaletest.apirest.converter.Convertidor;
import com.bsaletest.apirest.model.MProduct;
import com.bsaletest.apirest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceProduct")
public class ProductService {

    @Autowired
    @Qualifier("repositoryProduct")
    private ProductRepository repository;

    @Autowired
    @Qualifier("converter")
    private Convertidor converter;

    public List<MProduct> listarProducts(){
        return converter.convertirListaProducts(repository.findAll());
    }

    public List<MProduct> filtrarProductsName(String name){
        return converter.convertirListaProducts(repository.findProductByNameContainingOrderByName(name));
    }

    public List<MProduct> filtrarProductCategory(int category){
        return converter.convertirListaProducts(repository.findByCategoryOrderByName(category));
    }
}
