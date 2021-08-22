package com.bsaletest.apirest.converter;

import com.bsaletest.apirest.entity.Category;
import com.bsaletest.apirest.model.MCategory;

import java.util.ArrayList;
import java.util.List;

public class Convertidor {
    public List<MCategory> convertirListaCategories(List<Category> categories){
        List<MCategory> mcategories = new ArrayList<>();

        for(Category category : categories){
            mcategories.add(new MCategory(category));
        }

        return mcategories;
    }
}
