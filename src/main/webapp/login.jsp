<%--
  Created by IntelliJ IDEA.
  User: 29169
  Date: 2022/9/29
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/insert.do" method="post">
    用户名：<input type="text" name="usercode"><br>
    姓名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" value="注册">
</form>

<form action="user/findbyname.do" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
