<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/login.css">
  </head>
  
  <body>
  
    登录页面<br>
    
    <form action="login" method="post">
    	
    	<table id="tt">
    		<tr>
    			<td>用户名</td>
    			<td><input type="text" name="username"></td>
    		</tr>
    		<tr>
    			<td>密码</td>
    			<td><input type="password" name="password"></td>
    		</tr>
    		<tr>
    			<td colspan="2">
    				<input type="submit" value="登录">
    			</td>
    			
    		</tr>
    	</table>
    </form>
    <a href="register.jsp">立即注册</a>
    
  </body>
</html>
