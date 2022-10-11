//package com.yjy;
//
//import com.yjy.entity.Users;
//import com.yjy.service.UsersService;
//import com.yjy.service.impl.UsersServiceImpl;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.config.IniSecurityManagerFactory;
//import org.apache.shiro.crypto.hash.Md5Hash;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.subject.Subject;
//import org.apache.shiro.util.Factory;
//
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        Users users = new Users();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名");
//        String username = sc.next();
//        users.setUsername(username);
//
//        System.out.println("请输入用户名");
//        String password = sc.next();
//        users.setPassword(password);
//        UsersService usersService = new UsersServiceImpl();
//        usersService.insert(user);
//    }
//
//    public void testLogin(Users users) {
//        //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
//        //2、得到SecurityManager实例 并绑定给SecurityUtils
//        SecurityManager securityManager = factory.getInstance();
//        SecurityUtils.setSecurityManager(securityManager);
//        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//        Subject subject = SecurityUtils.getSubject();
//        String username = users.getUsername();
//        String password = users.getPassword();
//        String password_salt_2 = new Md5Hash(password, "salt", 2).toString();
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password_salt_2);
//
//        //4、登录，即身份验证
//        subject.login(token);
//
//        //是否认证通过
//        System.out.println("认证结果：" + subject.isAuthenticated());
//        //6、退出
//        subject.logout();
//        System.out.println("认证结果：" + subject.isAuthenticated());
//    }
//}
