package com.yadav.product.service.repository;

import java.util.ArrayList;
import java.util.List;

import com.yadav.product.service.model.Product;

import org.springframework.stereotype.Service;



@Service
public class ProductRepositoryImpl implements ProductRepsitory {
    
    List<Product> productList = new ArrayList<>();



    public List<Product> findAll(){
        return this.productList;
    }

    public void createProduct(Product product){
        this.productList.add(product);
    }
}
