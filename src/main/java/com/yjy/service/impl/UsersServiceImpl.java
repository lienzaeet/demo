package com.yjy.service.impl;

import com.yjy.entity.User;
import com.yjy.mapper.UsersMapper;
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
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;
    @Override
    public void findByUsername(User user) {
        //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //2、得到SecurityManager实例 并绑定给SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        String username=user.getUsername();
        String password=user.getPassword();
        String password1 = new Md5Hash(password, "salt", 2).toString();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password1);

        //4、登录，即身份验证
        subject.login(token);
        //是否认证通过
        System.out.println("认证结果：" + subject.isAuthenticated());
    }

    @Override
    public List<User> findAll() {
        return usersMapper.findAll();
    }

    @Override
    public User findById(int cid) {
        return null;
    }

    @Override
    public void insert(User user) {
       String password = user.getPassword();
       user.setSalt("salt");
       String password1 = new Md5Hash(password, "salt", 2).toString();
       user.setPassword(password1);
       usersMapper.insert(user);
    }

    @Override
    public void delete(int cid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public int getCount() {
        return usersMapper.getCount();
    }

    @Override
    public User findrolebyid(int id) {
        return null;
    }
}
