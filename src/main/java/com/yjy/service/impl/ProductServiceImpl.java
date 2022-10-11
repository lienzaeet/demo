package com.yjy.service.impl;

import com.yjy.entity.Product;
import com.yjy.mapper.ProductMapper;
import com.yjy.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public Product findById(int id) {
        return productMapper.findById(id);
    }

    @Override
    public void insert(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void delete(int id) {
        productMapper.delete(id);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }

    @Override
    public int getCount() {
        return productMapper.getCount();
    }
}
