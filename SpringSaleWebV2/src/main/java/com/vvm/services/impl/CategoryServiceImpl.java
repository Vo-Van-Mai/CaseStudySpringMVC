/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvm.services.impl;

import com.vvm.pojo.Category;
import com.vvm.repositories.CategoryRepository;
import com.vvm.services.CategoryServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class CategoryServiceImpl implements CategoryServices{
    
    @Autowired
    private CategoryRepository cateRepo;
    @Override
    public List<Category> getCategorys() {
        return this.cateRepo.getCategorys();
    }

    @Override
    public Category getCateById(int id) {
        return this.cateRepo.getCateById(id);
    }
    
}
