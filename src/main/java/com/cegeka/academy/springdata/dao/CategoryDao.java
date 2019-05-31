package com.cegeka.academy.springdata.dao;

import com.cegeka.academy.springdata.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Long> {
     Category findByName(String name);
}
