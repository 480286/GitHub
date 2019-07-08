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
  <style type="text/css">
  	input{
  	
  		width:300px;
  		height: 50px;
  	}
  </style>
  
  <body>
    <center>
    	<h1>添加地址信息</h1>
    	<form action="AddServlet" method="post">
    	<table width="40%" height="30%">
    		<tr>
    			<td>收货人姓名</td>
    			<td><input type="text" name="add_name" placeHolder="收货人姓名"></td>
    		</tr>
    		<tr>
    			<td>省	市 	区（县）</td>
    			<td><input type="text" name="add_ssq" placeHolder="省	市 	区（县）"></td>
    		</tr>
    		<tr>
    			<td>详细地址</td>
    			<td><input type="text" name="add_xq" placeHolder="详细地址"></td>
    		</tr>
    		<tr>
    			<td>邮编</td>
    			<td><input type="text" name="add_yb" placeHolder="邮编"></td>
    		</tr>
    		<tr>
    			<td>电话号码</td>
    			<td><input type="text" name="add_tel" placeHolder="电话号码"></td>
    		</tr>
    		<tr>
    			<td></td>
    			<td><input type="submit" value="添加地址信息"></td>
    		</tr>
    	</table>
    	</form>
  	</center>
  </body>
</html>
