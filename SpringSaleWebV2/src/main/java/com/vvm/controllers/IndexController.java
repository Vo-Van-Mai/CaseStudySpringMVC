/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvm.controllers;

import com.vvm.repositories.impl.CategoryRepositoryImpl;
import com.vvm.repositories.impl.ProductRespositoriesImpl;
import com.vvm.services.CategoryServices;
import com.vvm.services.ProductServices;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author BRAVO15
 */
@Controller
public class IndexController {
    @Autowired
    private CategoryServices cateService;
    @Autowired
    private ProductServices productService;
    
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        
        model.addAttribute("cates", cateService.getCategorys());
        model.addAttribute("product", productService.getProducts(params));
        return "index";
    }
    
}
