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
<style type="text/css">
	input{
		width: 200px;
		height: 18px;
		
	}
	.ve{
		width: 60px;
		height: 16px;
	}
	.yzm{
		width: 80px;
		height: 24px;
	}
	.tj{
		width: 80px;
		height: 24px;
	}
</style>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
	$(
		function () {
			$(".yzm").click(
					function () {
						var email=$("#email").val();
						alert("aaaa");
						$.ajax({
							url:'user/ajaxVe',
							data:{
								'email':email,
							},
							type:'post',
							dataType:'text',
							success:function(data){
								if(data=='0'){
									$("#em").text("邮箱发送验证码成功！");
								}else{
									$("#em").text("验证码发送失败！");
								}
							}
						});
					}
			),	
			
			
			$(".ve").blur(
					function (){
						var regexVe = /^\d{4}$/;
						var ve = $(".ve").val();
						if(regexVe.test(ve)){
							$("#am").text("验证码符合匹配规则");
						}else{
							$("#am").text("验证码不符合匹配规则，请重新输入");
						}
					}	
			)	
		}
		
	)
</script>
</head>
<!-- gfncjgqvsmfbbiaj 授权码 -->
<body>
<center>
	<h1>找回密码</h1>
	<form action="user/retrieve" method="post">
		<table>
			<tr>
				<td><input type="text" placeholder="请输入邮箱号" id="email"/></td>
				<td><font size="3" color="red" id="em">请输入邮箱号</font></td>
				<td><input type="button" value="获取验证码" class="yzm" /></td>
			</tr>
			<tr>
				<td><input type="text" name="verification" class="ve"/></td>
				<td><font size="3" color="red" id="am">请输入四位数验证码</font></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交验证" class="tj"/></td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>