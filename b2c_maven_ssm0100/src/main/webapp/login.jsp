<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>b2c在线商城</title>
		<link rel="stylesheet" href="css/b2cCss.css" />
		<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
		<script type="text/javascript">
			function requestJson() {
				var name=$("#username").val();
				var pwd=$("#password").val();
				
				if(name==""){
					alert("用户名不能为空！");
					return false;
				}
				else if(pwd==""){
					alert("密码不能为空");
					return false;
				}
				else{
					$.ajax({
						type:'post',
						url:'login',
						dataType:'json',
						async:true,
						data:{"username":name,"password":pwd},
						success:function(data){
							if(data==null){
								alert("没有这个用户");
							}else{
								alert("登录用户成功");
							}
						}
					});
				}
			}
		</script>
	</head>
	<body>
		<center>
			<div id="All">
				<h1 align="center">登录</h1>
				<hr />
				<form action="user/login" method="post">
					<table>
							<tr>		
								<td>
									用户名<input type="text" name="username" id="username"/>
								</td>
							</tr>
							<tr>
								<td>
									密码&nbsp;&nbsp;&nbsp;<input type="password" name="password" id="password"/>
								</td>
							</tr>
							<tr>
								<td><input type="submit" value="登录" class="formsub" onclick="requestJson()"/></td>
							</tr>
							<tr>
								<td align="left"><a href="register.jsp">立即注册</a>|<a href="retrieve.jsp">忘记密码</a></td>
							</tr>
					</table>
				</form>
			</div>
		</center>
	</body>
</html>