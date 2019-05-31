package com.cegeka.academy.springdata.service;

import com.cegeka.academy.springdata.model.Category;

public interface CategoryService {

    Category saveCategory(Category category);

    Category findByName(String name);
}
