package com.yjy.mapper;


import com.yjy.entity.Product;
import com.yjy.entity.User;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface ProductMapper {
    public List<Product>  findAll();
    public Product findById(int pid);
    public void insert(Product product);
    public void delete(int id);
    public void update(Product product);
    public int getCount();
}
