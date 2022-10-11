<%--
  Created by IntelliJ IDEA.
  User: 29169
  Date: 2022/9/6
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <label class="layui-form-label required">商品id</label>
        <div class="layui-input-block">
            <input type="text" name="pid" lay-verify="required" lay-reqtext="id不能为空" placeholder="请输入id" value="" class="layui-input">
            <tip>填写自己管理账号的名称。</tip>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">名字</label>
        <div class="layui-input-block">
            <input type="text" name="pname" lay-verify="required" lay-reqtext="不能为空" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">标价</label>
        <div class="layui-input-block">
            <input type="text" name="market_price" lay-verify="required" lay-reqtext="不能为空" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">售价</label>
        <div class="layui-input-block">
            <input type="text" name="shop_price" lay-verify="required" lay-reqtext="不能为空" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">图</label>
        <div class="layui-input-block">
            <input type="text" name="image" lay-verify="required" lay-reqtext="不能为空" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">日期</label>
        <div class="layui-input-block">
            <input type="text" name="pdate" lay-verify="required" lay-reqtext="不能为空" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">推荐</label>
        <div class="layui-input-block">
            <input type="text" name="is_recommend" lay-verify="required" lay-reqtext="不能为空" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">促销</label>
        <div class="layui-input-block">
            <input type="text" name="is_promotion" lay-verify="required" lay-reqtext="不能为空" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">折扣</label>
        <div class="layui-input-block">
            <input type="text" name="is_promotion" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">描述</label>
        <div class="layui-input-block">
            <input type="text" name="describe" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">次级id</label>
        <div class="layui-input-block">
            <input type="text" name="secondaryid" placeholder="请输入" value="" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-normal" lay-submit lay-filter="saveBtn">确认保存</button>
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
                type:'post',
                url:'/javawebmvc/ProductServlet1?op=add',
                data:{pid:data.field.pid,pname:data.field.pname,market_price:data.field.market_price,shop_price:data.field.shop_price,image:data.field.image,pdate:data.field.pdate,is_recommend:data.field.is_recommend,is_promotion:data.field.is_promotion,describe:data.field.describe,secondaryid:data.field.secondaryid},
                dataType:'JSON',
                success:function (data){
                    alert("更新成功!")

                    // 关闭弹出层
                    layer.close(index);

                    var iframeIndex = parent.layer.getFrameIndex(window.name);
                    parent.layer.close(iframeIndex);

                }
            });
            var index = layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            }, function () {

                // 关闭弹出层
                layer.close(index);

                var iframeIndex = parent.layer.getFrameIndex(window.name);
                parent.layer.close(iframeIndex);


            });

            return false;
        });

    });
</script>
</body>
</html>
