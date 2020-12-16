<%--
  Created by IntelliJ IDEA.
  User: 无语守望
  Date: 2020/12/15
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加住户</title>
</head>
<center>
<body>
添加住户<br/>
<form action="${pageContext.request.contextPath}/dept/save" method="post">
    住户姓名：<input name="deptname" type="text"/><br/>
    住户性别：<input name="sex" type="radio"/>男<input name="sex" type="radio"/>女<br/>
    住户地址：<input name="deptloc" type="text"/><br/>
    住户工资：<input name="sal" type="text"/><br/>
    住户地址编号：<input name="uid" type="text"/><br/>
<input type="submit" value="提交"/>
</form>


</body>
</center>
</html>
