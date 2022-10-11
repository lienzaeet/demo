<%--
  Created by IntelliJ IDEA.
  User: 29169
  Date: 2022/8/22
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="add.do" method="get">
    ID:<input type="text"  name="pid"><br>
    商品名:<input type="text"  name="pname" ><br>
    价格:<input type="text"  name="price"><br>
    折扣:<input type="text" name="discount"><br>
    图片:<input type="file"  name="pphoto"><br>
    描述:<input type="text" name="pdescribe"><br>
    <input type="submit" value="提交">
</form>
</body>
<script>
   function checkName() {
       var xmlhttp=new XMLHttpRequest();
       var name = document.getElementById("name").value;
       xmlhttp.open("get","AjaxServlet?op=findbyname&name="+name,true);
       xmlhttp.send();
       xmlhttp.onreadystatechange=function (){
           if (xmlhttp.readyState==4&&xmlhttp.status==200){
               if (xmlhttp.responseText=="商品已存在"){
                   document.getElementById("show").innerHTML=xmlhttp.responseText;
                   document.getElementById("show1").innerHTML="";
               }else {
                   document.getElementById("show1").innerHTML=xmlhttp.responseText;
                   document.getElementById("show").innerHTML="";
               }

           }
       }
   }
</script>
</html>
