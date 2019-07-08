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
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
	$(
		$("#password1").blur(
			function () {
				var password = $("#password").val();
				var password1 = $("#password1").val();
						
				if(password==password1){
					$("#bb").text("再次确认密码成功！");
				}else{
					$("#bb").text("再次确认密码不正确！");
				}
			}	
		)
			
	)
</script>
</head>
<body>
<center>
	<form action="user/resetPassword" method="post">
		<table>
			<tr>
				<td>请输入想修改密码：</td><td><input type="text" name="password" id="password"/></td>
			</tr>
			<tr>
				<td>请再次确认密码：</td><td><input type="text" id="password1"/></td>
				<td><font size="3" color="red" id="bb"></font></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定"/></td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>