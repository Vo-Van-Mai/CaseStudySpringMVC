/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvm.controllers;

import com.vvm.pojo.Product;
import com.vvm.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author BRAVO15
 */
@Controller
public class ProductControllers {
    
    @Autowired
    private ProductServices productService;
    
    @GetMapping("/product")
    public String list(Model model){
        model.addAttribute("product", new Product());
        return "product";
    }
    
    @GetMapping("/product/{productId}")
    public String update(Model model, @PathVariable(value="productId") int id ){
        model.addAttribute("product", this.productService.getProductById(id));
        return "product";
    }
    
    @PostMapping("/product")
    public String create(@ModelAttribute(value="product") Product p){
        this.productService.addOrUpdate(p);
        return "redirect:/";
    }
}
