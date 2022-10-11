package com.yjy.service;

import com.yjy.entity.Role;
import com.yjy.entity.User;

import java.util.List;

public interface RoleService {
    public List<Role> findAll();
    public Role findById(int cid);
    public void insert(int userid,int roleid);
    public void delete(int id);
    public void update(Role role);
    public int getCount();
    public List<Role> findrolebyid(int id);
    public List<Role> findroleother(int id);
}
