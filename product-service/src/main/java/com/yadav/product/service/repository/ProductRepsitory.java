package com.yadav.product.service.repository;

import java.util.List;

import com.yadav.product.service.model.Product;

public interface ProductRepsitory {
    public List<Product> findAll();

    public void createProduct(Product product);
}
