<%--
  Created by IntelliJ IDEA.
  User: 10363
  Date: 2022/9/24
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../../lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="../../css/public.css" media="all">
    <style>
        body {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<div class="layui-form layuimini-form">
    <div class="layui-form-item">
        <label class="layui-form-label required">pname</label>
        <div class="layui-input-block">
            <input type="text" name="pname" lay-verify="required" lay-reqtext="用户名不能为空" placeholder="请输入用户名" value="${product.pname}" class="layui-input">
            <tip>填写自己管理账号的名称。</tip>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">pid</label>
        <div class="layui-input-block">
            <input type="text" name="pid" lay-verify="required" readonly lay-reqtext="手机不能为空" placeholder="请输入手机" value="${product.pid}" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">price</label>
        <div class="layui-input-block">
            <input type="text" name="price" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机" value="${product.price}" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">discount</label>
        <div class="layui-input-block">
            <input type="text" name="discount" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机" value="${product.discount}" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">pphoto</label>
        <div class="layui-input-block">
            <input type="text" name="pphoto" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机" value="${product.pphoto}" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">pdescribe</label>
        <div class="layui-input-block">
            <input type="text" name="pdescribe" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机" value="${product.pdescribe}" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-normal" lay-submit lay-filter="saveBtn">确认保存</button>
        </div>
    </div>
</div>
</div>
<script src="../../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form'], function () {
        var form = layui.form,
            layer = layui.layer,
            $ = layui.$;

        //监听提交
        form.on('submit(saveBtn)', function (data) {
            $.ajax({
                type:"post",
                url:"/springmvc/product/update.do",
                data:{pid:data.field.pid, pname:data.field.pname, price:data.field.price, discount: data.field.discount, pphoto:data.field.pphoto, pdescribe:data.field.pdescribe},
                success:function (data){
                    var index = layer.alert("添加成功");
                    layer.close(index);
                    var iframeIndex = parent.layer.getFrameIndex(window.name);
                    parent.layer.close(iframeIndex);
                }
            });
            return false;
        });

    });
</script>
</body>
</html>
