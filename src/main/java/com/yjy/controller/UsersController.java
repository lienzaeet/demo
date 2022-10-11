package com.yjy.controller;

import com.yjy.entity.User;
import com.yjy.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UsersController {
    @Resource
    private UsersService usersService;

    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("insert")
    public String insert(User user){
        usersService.insert(user);
        return "redirect:findall.do";
    }
    @RequestMapping("findbyname")
    public String findbyname(User user){
        usersService.findByUsername(user);
        return "index";
    }
    @ResponseBody
    @RequestMapping("findall")
    public Map findall(){
        List<User> list = usersService.findAll();
        int count = usersService.getCount();
        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",list);
        return map;
    }
    @RequestMapping("loding")
    public String loding(){
        return "page/table2";
    }
    @RequestMapping("loding2")
    public String loding2(){
        return "page/tableuser-role";
    }
}
