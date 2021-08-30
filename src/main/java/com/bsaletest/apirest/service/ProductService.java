package com.bsaletest.apirest.service;

import com.bsaletest.apirest.converter.Convertidor;
import com.bsaletest.apirest.model.MProduct;
import com.bsaletest.apirest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta clase se utiliza para facilitar servicios al controlador.
 * @see ProductService
 * @author AndZuñ
 */
@Service("serviceProduct")
public class ProductService {

    @Autowired
    @Qualifier("repositoryProduct")
    private ProductRepository repository;

    @Autowired
    @Qualifier("converter")
    private Convertidor converter;

    /**
     * Este método invoca al método findAllByOrderByName del repository,
     * luego convierte el resultado en una lista de MProduct con método convertirListaProducts del converter.
     * @return lista de MProduct
     */
    public List<MProduct> listarProducts(){
        return converter.convertirListaProducts(repository.findAllByOrderByName());
    }

    /**
     * Este método invoca al método findProductByNameContainingOrderByName del repository,
     * luego convierte el resultado en una lista de MProduct con método convertirListaProducts del converter.
     * @param name texto que debe contener el nombre del producto.
     * @return lista de MProduct
     */

    public List<MProduct> filtrarProductsName(String name){
        return converter.convertirListaProducts(repository.findProductByNameContainingOrderByName(name));
    }

    /**
     * Este método invoca al método findByCategoryOrderByName del repository,
     * luego convierte el resultado en una lista de MProduct con método convertirListaProducts del converter.
     * @param category categoría por la que se filtraran los productos.
     * @return lista de MProduct
     */
    public List<MProduct> filtrarProductCategory(int category){
        return converter.convertirListaProducts(repository.findByCategoryOrderByName(category));
    }
}
