<%--
  Created by IntelliJ IDEA.
  User: 无语守望
  Date: 2020/12/15
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息</title>
</head>
<center>
    <body>
    修改住户<br/>
    <form action="${pageContext.request.contextPath}/dept/saveUpdate" method="post">
        <input name="deptno" type="hidden" value="${dept.deptno}" /><br/>
        住户姓名：<input name="deptname" type="text" value="${dept.deptname}" /><br/>
        住户性别：<input name="sex" type="radio" value="男"/>男<input name="sex" type="radio" value="女"/>女<br/>
        住户地址：<input name="deptloc" type="text" value="${dept.deptloc}"/><br/>
        住户工资：<input name="sal" type="text"  value="${dept.sal}"/><br/>
        住户地址编号：<input name="uid" type="text"  value="${dept.uid}"/><br/>
        <input type="submit" value="提交"/>
    </form>


    </body>
</center>
</html>
