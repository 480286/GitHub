<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.mypack.entity.Address" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
   <%
  	Address a=(Address)session.getAttribute("address");
   %>
   <center>
    	<h1>修改地址信息</h1>
    	<form action="UpdateServlet" method="post">
    	<table width="40%" height="30%">
    	
    		<tr>
    			<td>地址编号</td>
    			<td><input type="text" name="add_id" value="<%=a.getAdd_id()%>" readonly="readonly"> </td>
    		</tr>
    		<tr>
    			<td>收货人姓名</td>
    			<td><input type="text" name="add_name"  value="<%=a.getAdd_name()%>"> </td>
    		</tr>
    		<tr>
    			<td>省	市 	区（县）</td>     
    			<td><input type="text" name="add_ssx"  value="<%=a.getAdd_ssx()%>"> </td>
    		</tr>
    		<tr>
    			<td>详细地址</td>     
    			<td><input type="text" name="add_xq"  value="<%=a.getAdd_xq()%>"> </td>
    		</tr>
    		<tr>
    			<td>邮编</td>     
    			<td><input type="text" name="add_yb"  value="<%=a.getAdd_yb()%>"> </td>
    		</tr>
    		<tr>
    			<td>电话号码</td>     
    			<td><input type="text" name="add_tel"  value="<%=a.getAdd_tel()%>"> </td>
    		</tr>
    		<tr>
    			<td></td>
    			<td><input type="submit" value="修改地址信息"> </td>
    		</tr>
    	</table>
    	</form>
    </center>
  </body>
</html>
