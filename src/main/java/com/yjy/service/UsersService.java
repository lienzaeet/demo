package com.yjy.service;

import com.yjy.entity.User;

import java.util.List;

public interface UsersService {
    public void findByUsername(User user);
    public List<User> findAll();
    public User findById(int cid);
    public void insert(User user);
    public void delete(int cid);
    public void update(User user);
    public int getCount();
    public User findrolebyid(int id);
}
