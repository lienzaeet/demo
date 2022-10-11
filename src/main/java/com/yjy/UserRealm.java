package com.yjy;

import com.yjy.entity.Permission;
import com.yjy.entity.User;
import com.yjy.mapper.UsersMapper;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm {
    @Resource
    private UsersMapper usersMapper;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username =(String) principalCollection.getPrimaryPrincipal();

        List<Permission> list = usersMapper.findPermission(username);
        List<String> permission=new ArrayList<>();
        for (Permission permission1 : list) {
            String url = permission1.getUrl();
            permission.add(url);
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(permission);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户输入的用户名
        String username = (String)token.getPrincipal();
        User user = usersMapper.findByUsername(username);
        String password = user.getPassword();
        String salt = user.getSalt();
        //根据用户名将密码查询出来
        //假设查询出来的密码是 1111
        //具体的匹配让它自己匹配
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username,password,ByteSource.Util.bytes(salt),getName());
        return info;
    }
}
