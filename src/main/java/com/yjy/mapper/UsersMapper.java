package com.yjy.mapper;

import com.yjy.entity.Permission;
import com.yjy.entity.User;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface UsersMapper {
    public User findByUsername(String Username);
    public void insert(User user);
    public int getCount();
    public List<User> findAll();
    public List<Permission> findPermission(String name);
}
