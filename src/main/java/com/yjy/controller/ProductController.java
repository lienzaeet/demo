package com.yjy.controller;

import com.yjy.entity.Product;
import com.yjy.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("product")
public class ProductController {
    @Resource
    private ProductService productService;
    @RequestMapping("findall")
    @ResponseBody
    public Map findall(){
        List<Product> list = productService.findAll();
        int count = productService.getCount();
        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",list);
        return map;
    }
    @ResponseBody
    @RequestMapping("findById")
    public String findById(int uid,HttpSession session){
        Product product = productService.findById(uid);
        session.setAttribute("product",product);
        return "edit";
    }
    @RequestMapping("add")
    public String add(Product product){
        productService.insert(product);
        return "redirect:findall.do";
    }
    @RequestMapping("delete")
    public String delete(int uid){
        productService.delete(uid);
        return "redirect:findall.do";
    }
    @RequestMapping("update")
    public String update(Product product){
        productService.update(product);
        return "redirect:findall.do";
    }
    @RequestMapping("loding")
    public String loding(){
        return "page/table";
    }
}
