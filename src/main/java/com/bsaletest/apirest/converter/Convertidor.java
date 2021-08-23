package com.bsaletest.apirest.converter;

import com.bsaletest.apirest.entity.Category;
import com.bsaletest.apirest.entity.Product;
import com.bsaletest.apirest.model.MCategory;
import com.bsaletest.apirest.model.MProduct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("converter")
public class Convertidor {

    public List<MProduct> convertirListaProducts(List<Product> products){
        List<MProduct> mproducts = new ArrayList<>();

        for(Product product : products){
            mproducts.add(new MProduct(product));
        }

        return mproducts;
    }

    public List<MCategory> convertirListaCategories(List<Category> categories){
        List<MCategory> mcategories = new ArrayList<>();

        for(Category category : categories){
            mcategories.add(new MCategory(category));
        }

        return mcategories;
    }
}
