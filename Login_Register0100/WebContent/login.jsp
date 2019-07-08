<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<h1 style="color: red">登录</h1>
	<form action="login" method="post">
		<table align="center" border="1px">
			<tr>
				<td>账号：</td>
				<td><input type="text" name="users" value="用户名/手机号/邮箱"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" value="用户名/手机号/邮箱"/></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="登录"></td>
			</tr>
		</table>
		<a href="register.jsp">立即注册</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="resetpassword.jsp"></a>
	</form>
</body>
</html>