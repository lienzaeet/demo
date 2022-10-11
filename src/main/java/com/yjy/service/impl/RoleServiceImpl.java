package com.yjy.service.impl;

import com.yjy.entity.Role;
import com.yjy.entity.User;
import com.yjy.mapper.RoleMapper;
import com.yjy.mapper.UsersMapper;
import com.yjy.service.RoleService;
import com.yjy.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;


    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public Role findById(int cid) {
        return null;
    }

    @Override
    public void insert(int userid,int roleid) {
        roleMapper.insert(userid,roleid);
    }

    @Override
    public void delete(int id) {
        roleMapper.delete(id);
    }

    @Override
    public void update(Role role) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public List<Role> findrolebyid(int id) {
        return roleMapper.findrolebyid(id);
    }

    @Override
    public List<Role> findroleother(int id) {
        return roleMapper.findroleother(id);
    }
}
