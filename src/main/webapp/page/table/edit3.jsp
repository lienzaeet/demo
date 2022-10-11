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
        <label class="layui-form-label required">secondary_name</label>
        <div class="layui-input-block">
            <input type="text" name="secondary_name" lay-verify="required" lay-reqtext="用户名不能为空" placeholder="请输入用户名" value="${secondary.secondary_name}" class="layui-input">
            <tip>填写自己管理账号的名称。</tip>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">secondaryid</label>
        <div class="layui-input-block">
            <input type="text" name="secondaryid" lay-verify="required" readonly lay-reqtext="手机不能为空" placeholder="请输入手机" value="${secondary.secondaryid}" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">sid</label>
        <div class="layui-input-block">
            <input type="text" name="sid" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机" value="${secondary.sid}" class="layui-input">
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
                url:"/springmvc/secondary/update.do",
                data:{secondaryid:data.field.secondaryid, secondary_name:data.field.secondary_name, sid:data.field.sid},
                success:function (data){
                    var index = layer.alert("修改成功");
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
