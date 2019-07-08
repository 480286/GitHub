<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8"/>
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/b2cCss.css"/>
		<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
		<script type="text/javascript">
		$(	
			function() {
				
				$("#user").blur(
						function() {
							var username=$("#user").val();
						
							$.ajax({
								
								url:'user/ajax',
								
								data:{
									'username':username,
									},
								type:'post',
								dataType:'text',
								success:function(data){
									if(data==0){
										$("#ff").text("用户名已存在！请重新输入...");
									}
									else if(data==1){
										$("#ff").text("该用户名可以注册...");
									}
								}
							});
						}
						
				)
				
				$("#password").blur(
						function () {
							var regexPassword = /^(?![0-9]+$)(?![a-z]+$)(?![A-Z]+$)(?!([^(0-9a-zA-Z)])+$)^.{8,16}$/;
							var password=$("#password").val();
							if(regexPassword.test(password)){
								$("#gg").text("该密码可以使用！");
							}else{
								$("#gg").text("请输入字母数字和特殊符号的密码！");
							}
						}
				)
				
				$("#phone").blur(		
						function name() {
							var regexPhone = /^[1][3,4,5,7,8][0-9]{9}$/;
							var phone = $("#phone").val();
							if(regexPhone.test(phone)){
								$("#hh").text("该手机号可以使用！");
							}else{
								$("#hh").text("手机号格式不正确！");
							}
						}
				)
				
				$("#email").blur(
						function () {
							var regexEamil = new RegExp("^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
							var email=$("#email").val();
							if(regexEamil.test(email)){
								$("#ii").text("该邮箱可以使用！");
							}else{
								$("#ii").text("邮箱格式不正确！");
							}
						}		
				)
				
		   }
	  )
		
			
		</script>
	</head>
	<body>
		<center>
			<div id="All">
				<h1 align="center">注册</h1>
				<hr />
				<form action="user/register" method="post">
					<table>
							<tr>
								<td>用户名</td>		
								<td>
									<input type="text" name="username" id="user"/>
								</td>
								<td><font size="3" color="red" id="ff"></font></td>
							</tr>
							<tr>
								<td>密码</td>
								<td>
									<input type="password" name="password" id="password"/>
								</td>
								<td><font size="3" color="red" id="gg">必须为字母加数字且长度不小于8位</font></td>
							</tr>
							<tr>
								<td>手机号</td>
								<td>
									<input type="text" name="phone" id="phone"/>
								</td>
								<td><font size="3" color="red" id="hh"></font></td>
							</tr>
							<tr>
								<td>E-mail</td>
								<td>
									<input type="text" name="email" id="email"/>
								</td>
								<td><font size="3" color="red" id="ii"></font></td>
							</tr>
							<tr>
								<td><input type="submit" value="注册" class="formsub"/></td>
							</tr>
					</table>
				</form>
			</div>
		</center>
	</body>
</html>
