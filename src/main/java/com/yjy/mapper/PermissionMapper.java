package com.yjy.mapper;

import com.yjy.entity.Permission;
import com.yjy.entity.Role;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface PermissionMapper {
    public void insert(int roleid,int permid);
    public int getCount();
    public List<Role> findAll();
    public List<Permission> findrolebyid(int id);
    public void delete(int id);
    public List<Permission> findroleother(int id);
}
