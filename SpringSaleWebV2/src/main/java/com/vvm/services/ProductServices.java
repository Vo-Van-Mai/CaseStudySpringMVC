/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vvm.services;

import com.vvm.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface ProductServices {

    List<Product> getProducts(Map<String, String> params);

    void addOrUpdate(Product p);

    Product getProductById(int id);

    void deleteProduct(int id);
}
