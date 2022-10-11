package com.yjy.controller;

import com.yjy.entity.Product;
import com.yjy.entity.Role;
import com.yjy.entity.User;
import com.yjy.service.RoleService;
import com.yjy.service.UsersService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("role")
public class RoleController {
    @Resource
    private RoleService roleService;

    @ResponseBody
    @RequestMapping("findrolebyid")
    public Map findrolebyid(HttpSession session){
        int id = (int)session.getAttribute("id");
        List<Role> list = roleService.findrolebyid(id);
        int count = roleService.getCount();
        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",list);
        return map;
    }
    @ResponseBody
    @RequestMapping("insec")
    public void insec(int id, HttpSession session){
        session.setAttribute("id",id);
    }
    @RequiresPermissions("/role/delete.do")
    @RequestMapping("delete")
    public void delete(int id){
        roleService.delete(id);
    }
    @RequestMapping("add")
    public void add(int id,HttpSession session){
        int userid1 = (int)session.getAttribute("id");
        roleService.insert(userid1,id);
    }
    @ResponseBody
    @RequestMapping("findroleother")
    public Map findroleother(HttpSession session){
        int id = (int)session.getAttribute("id");
        List<Role> list = roleService.findroleother(id);
        int count = roleService.getCount();
        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",list);
        return map;
    }
    @ResponseBody
    @RequestMapping("findall")
    public Map findall(){
        List<Role> list = roleService.findAll();
        int count = roleService.getCount();
        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",list);
        return map;
    }
    @RequestMapping("loding")
    public String loding(){
        return "page/tablerole-permission";
    }
}
