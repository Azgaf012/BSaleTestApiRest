package com.bsaletest.apirest.controller;

import com.bsaletest.apirest.model.MProduct;
import com.bsaletest.apirest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase especifica los diferentes endpoint de producto que se pueden consumir.
 * @see ProductController
 * @author AndZuñ
 */
@RestController
@RequestMapping("/v1")//Indico que todos los endpoint se le antepone con la v1/
public class ProductController {
    @Autowired
    @Qualifier("serviceProduct")
    ProductService service;

    /**
     * Este método se ejecuta al llamar al endpoint "/productPage", devuelve una lista paginada de MProduct
     * @param pageable size: cantidad de productos por página, page: nro de página a devolver.
     * @return lista paginada de MProduct
     */
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping("/productsPage")
    public Page<MProduct> listarProductsPage(@PageableDefault(size=16,page=0)Pageable pageable){
        List<MProduct> products=service.listarProducts();
        int start =(int) pageable.getOffset();
        int end=(start + pageable.getPageSize())>products.size()? products.size():(start +pageable.getPageSize());

        Page<MProduct> pages = new PageImpl<>(products.subList(start,end),pageable,products.size());

        return pages;
    }

    /**
     * Este método se ejecuta al llamar al endpoint "/productsNamePage", devuelve una lista paginada de MProduct que en su nombre contenga el valor del parámetro name.
     * @param name nombre que debe contener el producto.
     * @param pageable size: cantidad de productos por página, page: nro de página a devolver.
     * @return lista paginada de MProduct
     */
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping("/productsNamePage")
    public Page<MProduct> filtrarProductsNamePage(String name,@PageableDefault(size=16,page=0)Pageable pageable){
        List<MProduct> products=service.filtrarProductsName(name);
        int start =(int) pageable.getOffset();
        int end=(start + pageable.getPageSize())>products.size()? products.size():(start +pageable.getPageSize());

        Page<MProduct> pages = new PageImpl<>(products.subList(start,end),pageable,products.size());

        return pages;
    }

    /**
     * Este método se ejecuta al llamar al endpoint "/productsCategoryPage", devuelve una lista paginada de MProduct filtrada por una categoría.
     * @param category categoría por la que se filtraran los productos.
     * @param pageable size: cantidad de productos por página, page: nro de página a devolver.
     * @return lista paginada de MProduct
     */
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping("/productsCategoryPage")
    public Page<MProduct> filtrarProductsCategoryPage(int category,@PageableDefault(size=16,page=0)Pageable pageable){
        List<MProduct> products=service.filtrarProductCategory(category);
        int start =(int) pageable.getOffset();
        int end=(start + pageable.getPageSize())>products.size()? products.size():(start +pageable.getPageSize());

        Page<MProduct> pages = new PageImpl<>(products.subList(start,end),pageable,products.size());

        return pages;
    }
}
