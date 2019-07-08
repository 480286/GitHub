<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
  	<center>
    <h2>更新学生页面</h2>
    <hr width="50%" size="6" color="red">
    <!-- get和post请求：
    	get请求： 走浏览器地址栏传输，不安全，传输数据大小有限，
    	post请求： 走请求体，安全，传输数据理论上无限制
     -->
    <form action="student/update" method="post">
    	<table width="50%" height="30%">
    	
    		<tr>
    			<td>编号</td>
    			<td><input type="text" name="id" value="${stu.id }" readonly="readonly"/> </td>
    		</tr>
    		<tr>
    			<td>姓名</td>
    			<td><input type="text" name="name" value="${stu.name }"/></td>
    		</tr>
    		<tr>
    			<td>年龄</td>
    			<td><input type="text" name="age" value="${stu.age }"/></td>
    		</tr>
    		<tr>
    			<td>地址</td>
    			<td><input type="text" name="address" value="${stu.address }"/></td>
    		</tr>
    		<tr>
    			<td colspan="2">
    				<input type="submit" value="修改学生信息"/>
    			</td>
    			
    		</tr>
    	
    	</table>
    
    </form>
    </center>
  </body>
</html>
