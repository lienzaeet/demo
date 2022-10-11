package com.yjy.service.impl;

import com.yjy.entity.Permission;
import com.yjy.entity.Role;
import com.yjy.mapper.PermissionMapper;
import com.yjy.mapper.RoleMapper;
import com.yjy.service.PermissionService;
import com.yjy.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public Role findById(int cid) {
        return null;
    }

    @Override
    public void insert(int roleid,int permid) {
        permissionMapper.insert(roleid,permid);
    }

    @Override
    public void delete(int id) {
        permissionMapper.delete(id);
    }

    @Override
    public void update(Role role) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public List<Permission> findrolebyid(int id) {
        return permissionMapper.findrolebyid(id);
    }

    @Override
    public List<Permission> findroleother(int id) {
        return permissionMapper.findroleother(id);
    }
}
