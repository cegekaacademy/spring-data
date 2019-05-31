package com.cegeka.academy.springdata.controller;

import com.cegeka.academy.springdata.model.Category;
import com.cegeka.academy.springdata.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public void saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
    }
}
