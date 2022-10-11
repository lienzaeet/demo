package com.yjy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Product {
    private int id;
    private String productno;
    private String product_name;
    private String city_name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date send_time;
    private String send_time_str;//用于显示格式化的时间：方便页面展示
    private double product_price;
    private String product_desc;
    private int product_status; //0关闭，1开启
    private String product_status_str;//用户显示格式化的状态：方便页面展示

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public Date getSend_time() {
        return send_time;
    }

    public void setSend_time(Date send_time) {
        this.send_time = send_time;
    }

    public String getSend_time_str() {
        return send_time_str;
    }

    public void setSend_time_str(String send_time_str) {
        this.send_time_str = send_time_str;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public int getProduct_status() {
        return product_status;
    }

    public void setProduct_status(int product_status) {
        this.product_status = product_status;
    }

    public String getProduct_status_str() {
        return product_status_str;
    }

    public void setProduct_status_str(String product_status_str) {
        this.product_status_str = product_status_str;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productno='" + productno + '\'' +
                ", product_name='" + product_name + '\'' +
                ", city_name='" + city_name + '\'' +
                ", send_time=" + send_time +
                ", send_time_str='" + send_time_str + '\'' +
                ", product_price=" + product_price +
                ", product_desc='" + product_desc + '\'' +
                ", product_status=" + product_status +
                ", product_status_str='" + product_status_str + '\'' +
                '}';
    }
}
