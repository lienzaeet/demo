<%--
  Created by IntelliJ IDEA.
  User: 29169
  Date: 2022/8/22
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>


<body>
<form action="update.do" method="get">
         ID:<input type="text" readonly value="${product.pid}" name="pid"><br>
         商品名:<input type="text" value="${product.pname}" name="pname"><br>
         价格:<input type="text" value="${product.price}" name="price"><br>
         折扣:<input type="text" value="${product.discount}" name="discount"><br>
         图片:<input type="text" readonly value="${product.pphoto}" name="pphoto"><br>
         描述:<input type="text" value="${product.pdescribe}" name="pdescribe"><br>
          <input type="submit" value="提交">
</form>
</body>
</html>
