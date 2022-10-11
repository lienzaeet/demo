package com.yjy.controller;

import com.yjy.entity.Permission;
import com.yjy.entity.Role;
import com.yjy.mapper.PermissionMapper;
import com.yjy.service.PermissionService;
import com.yjy.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("perm")
public class PermissionController {
    @Resource
    private RoleService roleService;
    @Resource
    private PermissionService permissionService;

    @ResponseBody
    @RequestMapping("findrolebyid")
    public Map findrolebyid(HttpSession session){
        int id = (int)session.getAttribute("id");
        List<Permission> list = permissionService.findrolebyid(id);
        int count = permissionService.getCount();
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
    @RequestMapping("delete")
    public void delete(int id){
        permissionService.delete(id);
    }
    @RequestMapping("add")
    public void add(int id,HttpSession session){
        int roleid = (int)session.getAttribute("id");
        permissionService.insert(roleid,id);
    }
    @ResponseBody
    @RequestMapping("findroleother")
    public Map findroleother(HttpSession session){
        int id = (int)session.getAttribute("id");
        List<Permission> list = permissionService.findroleother(id);
        int count = permissionService.getCount();
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
