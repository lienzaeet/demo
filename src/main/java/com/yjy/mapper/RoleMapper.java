package com.yjy.mapper;

import com.yjy.entity.Role;
import com.yjy.entity.User;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface RoleMapper {
    public void insert(int userid,int roleid);
    public int getCount();
    public List<Role> findAll();
    public List<Role> findrolebyid(int id);
    public void delete(int id);
    public List<Role> findroleother(int id);
}
