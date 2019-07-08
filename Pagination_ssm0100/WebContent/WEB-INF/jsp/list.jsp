<%@page import="com.mypack.entity.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'list.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	欢迎${sessionScope.name }来到该页面
	<center>
		<h1>学生管理系统</h1>
		<hr width="70%" color="red" size="10">
		<table width="70%" height="40%">
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>地址</td>
				<td>编辑</td>
			</tr>

			<c:forEach var="stu" items="${pf.list }">

				<tr>
					<td>${stu.id }</td>
					<td>${stu.name }</td>
					<td>${stu.age }</td>
					<td>${stu.address }</td>
					<td>
						<a href="delete?id=${stu.id }">删除</a> | <a href="load?id=${stu.id }">修改</a>
					</td>
				</tr>

			</c:forEach>

			<tr>
				<td colspan="5"><a href="student/toadd">添加学生信息</a></td>
			</tr>
		</table>
		第${pf.pageNum }页 共${pf.pages }页 一共${pf.total }条记录
		<a href="list?currentPage=${pf.firstPage }">首页</a>
		<a href="list?currentPage=${pf.prePage }">上一页 </a>
		<a href="list?currentPage=${pf.nextPage }">下一页</a>
		<a href="list?currentPage=${pf.lastPage }">尾页</a>
		   
		

	</center>
</body>
</html>
