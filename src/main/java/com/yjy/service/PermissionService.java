package com.yjy.service;

import com.yjy.entity.Permission;
import com.yjy.entity.Role;

import java.util.List;

public interface PermissionService {
    public List<Role> findAll();
    public Role findById(int cid);
    public void insert(int roleid,int permid);
    public void delete(int id);
    public void update(Role role);
    public int getCount();
    public List<Permission> findrolebyid(int id);
    public List<Permission> findroleother(int id);
}
