package com.bsaletest.apirest.converter;

import com.bsaletest.apirest.entity.Category;
import com.bsaletest.apirest.model.MCategory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("converter")
public class Convertidor {
    public List<MCategory> convertirListaCategories(List<Category> categories){
        List<MCategory> mcategories = new ArrayList<>();

        for(Category category : categories){
            mcategories.add(new MCategory(category));
        }

        return mcategories;
    }
}
