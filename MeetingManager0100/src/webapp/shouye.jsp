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

<title>My JSP 'shouye.jsp' starting page</title>

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
	<br>

	<h1>英雄信息</h1>

	<table width="70%" height="40%">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>手机</td>
			<td>所在阵营</td>
			<td>部门</td>
			<td>职务</td>
			<td>操作</td>
		</tr>

		<c:forEach var="stu" items="${pf.list}">

			<tr>
				<td>${stu.id }</td>
				<td>${stu.name }</td>
				<td>${stu.xingbie }</td>
				<td>${stu.tel }</td>
				<td>${stu.gongsi}</td>
				<td>${stu.bumen }</td>
				<td>${stu.zhiwu }</td>
				<td><a href="xiangQing?id=${stu.id }">查看详情</a> | <a
					href="bianJi?id=${stu.id }">修改</a> | <a
					href="shanChu?id=${stu.id }">删除</a>
				</td>

			</tr>

		</c:forEach>

		<tr>
			<td colspan="8"><a href="add">添加英雄信息</a></td>
		</tr>
	</table>
	第${pf.pageNum }页 共${pf.pages }页 共有${pf.total }记录
	<a href="xinXi?currentPage=${pf.firstPage }">首页</a>

	<a href="xinXi?currentPage=${pf.prePage }">上一页</a>
	<form action="tiaoZhuan" method="post">
		<table>
			<tr>
				<td><input type="text" name="id" value="0" />
				</td>
				<td colspan="1"><input type="submit" value="跳转到" /></td>
			</tr>
		</table>
	</form>
	<a href="xinXi?currentPage=${pf.nextPage }">下一页</a>

	<a href="xinXi?currentPage=${pf.lastPage }">尾页</a>


	<form action="souSuo" method="post">
		<label>1、性别</label> 
		<select name="xingbie">
			<option value="">请选择</option>
			<option value="男">男</option>
			<option value="女">女</option>
		</select> <label>2、阵营</label> 
		<select name="gongsi">
			<option value="">请选择</option>
			<option value="影流教派">影流教派</option>
			<option value="艾欧尼亚">艾欧尼亚</option>
			<option value="虚空">虚空</option>
			<option value="诺克萨斯">诺克萨斯</option>
			<option value="德玛西亚">德玛西亚</option>
			<option value="祖安">祖安</option>
			<option value="无业游民">无业游民</option>
			<option value="瓦罗兰">瓦罗兰</option>
		</select> <label>3、部门</label> <select name="bumen">
			<option value="">请选择</option>
			<option value="管理">管理</option>
			<option value="群众">群众</option>
			<option value="无">无</option>
		</select>
		<table>
			<tr>

				<td colspan="1"><input type="submit" value="搜索" /></td>
			</tr>
		</table>
	</form>



</body>
</html>
