package com.yjy.service;

import com.yjy.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(int id);
    public void insert(Product product);
    public void delete(int cid);
    public void update(Product product);
    public int getCount();
}
