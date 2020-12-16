<%--
  Created by IntelliJ IDEA.
  User: 无语守望
  Date: 2020/12/14
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>住户信息列表</title>
</head>
<center>
<body >
<a href="${pageContext.request.contextPath}/dept/add">住户添加</a>
<table border="1px" style="margin-top: 30px;height: 250px;width: 500px ">
    <tr align="center">
        <th><input type="checkbox"/>全选</th>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>地址</th>
        <th>工资</th>
        <th>地址编号</th>
        <th>操作</th>
    </tr>
<c:forEach var="dept" items="${deptList}">
    <tr align="center">
        <td> <input type="checkbox"/> </td>
        <%--自动去掉get方法--%>
        <%--如果性别设置是0或1的话 ${dept.sex eq 0?"男":"女"} --%>
        <td>${dept.deptno}</td>
        <td>${dept.deptname}</td>
        <td>${dept.sex}</td>
        <td>${dept.deptloc}</td>
        <td>${dept.sal}</td>
        <td>${dept.uid}</td>
        <td>
            <a href="${pageContext.request.contextPath}/dept/edit?deptno=${dept.deptno}" >修改</a>&nbsp;
            <a href="${pageContext.request.contextPath}/dept/delete?deptno=${dept.deptno}">删除 </a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</center>
</html>
