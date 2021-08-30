package com.bsaletest.apirest.converter;

import com.bsaletest.apirest.entity.Category;
import com.bsaletest.apirest.entity.Product;
import com.bsaletest.apirest.model.MCategory;
import com.bsaletest.apirest.model.MProduct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se utiliza para convetir: una entidad a un modelo, ouna lista de una entidad a a lista de un modelo.
 * @see Convertidor
 * @author AndZuñ
 */
@Component("converter")
public class Convertidor {

    /**
     * Este método convierte una lista de Product a una lista de MProduct.
     * @param products lista de Product para ser convertida.
     * @return lista de MProduct
     */
    public List<MProduct> convertirListaProducts(List<Product> products){
        List<MProduct> mproducts = new ArrayList<>();

        for(Product product : products){
            mproducts.add(new MProduct(product));
        }

        return mproducts;
    }

    /**
     * Este método convierte una lista de Category a una lista de MCategory.
     * @param categories lista de Category para ser convertida.
     * @return lista de MCategory
     */
    public List<MCategory> convertirListaCategories(List<Category> categories){
        List<MCategory> mcategories = new ArrayList<>();

        for(Category category : categories){
            mcategories.add(new MCategory(category));
        }

        return mcategories;
    }
}
