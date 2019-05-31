package com.cegeka.academy.springdata.service;

import com.cegeka.academy.springdata.dao.CategoryDao;
import com.cegeka.academy.springdata.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category saveCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public Category findByName(String name) {
        return categoryDao.findByName(name);
    }
}
