<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: 29169
  Date: 2022/8/22
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ProductServlet?op=findall" method="post">
    姓名:<input type="text"  name="names" id="name" onkeyup="checkName()"><br>
    <ul id="show">

    </ul>
    <input type="submit" value="提交">
</form>
     <button id="1">批量删除</button>

     <table border="1">
         <tr>
             <td>选择</td>
             <td>商品号</td>
             <td>商品名</td>
             <td>价格</td>
             <td>折扣</td>
             <td>商品图片</td>
             <td>商品描述</td>
             <td>操作</td>
         </tr>
         <c:forEach var="product" items="${list}">
             <tr>
                 <td> <input type="checkbox" value="${product.pid}" name="sids">选择</td>
                 <td>${product.pid}</td>
                 <td>${product.pname}</td>
                 <td>${product.price}</td>
                 <td>${product.discount}</td>
                 <td><img src="/${product.pphoto}"></td>
                 <td>${product.pdescribe}</td>
                 <td>
                     <a href="delete.do?pid=${product.pid}">删除</a>
                     <a href="findById.do?pid=${product.pid}">修改</a>
                     <a href="ProductServlet?op=Download&pphoto=${product.pphoto}">下载</a>
                 </td>
             </tr>

         </c:forEach>

     </table>
     <a href="goadd.do">添加</a>
</body>
</html>
