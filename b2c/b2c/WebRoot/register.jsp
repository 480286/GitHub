<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<meta charset="utf-8">
<title>注册</title>
<link href="css/base.css" rel="stylesheet" type="text/css">
<link href="css/css.css" rel="stylesheet" type="text/css">
<script src="js/jquery-2.1.1.min.js"></script>
<style>
.tab {
	overflow: hidden;
	margin-top: 20px; margin-bottom:-1px;
}
.tab li {
	display: block;
	float: left;
	width: 100px;padding:10px 20px; cursor:pointer; border:1px solid #ccc; 
}
.tab li.on {
	background: #90B831; color:#FFF;padding:10px 20px;
}
.conlist {padding:30px; border:1px solid #ccc; width:300px;}
.conbox {
	display: none;
}
</style>
<script>
$(function(){
	$(".tab li").each(function(i){
		$(this).click(function(){
		$(this).addClass("on").siblings().removeClass("on");
		$(".conlist .conbox").eq(i).show().siblings().hide();
		})
	})
})
</script>
</head>

<body class="l-bg">
<div class="login-top">
    <div class="wrapper">
        <div class="fl font30">LOGO</div>
        <div class="fr">您好，欢迎为生活充电在线！</div>
    </div>
</div>
<div class="l_main2">
    <div class="l_bttitle"> 
        <h2>注册</h2>
    </div>
    <div class="loginbox">
        <div class="tab">
            <ul>
                <li class="on">我是买家</li>
                <li>我是卖家</li>
            </ul>
        </div>
        <div class="conlist">
            <div class="conbox" style="display:block;">
            	<form action="RegisterServlet" method="post">
	                <p>
	                    <div class="fl res-text">用户名：</div><div><input type="text" class="loginuser" name="username"></div>
	                </p>
	                <p>
	                   <div class="fl res-text">密码：</div><div><input type="password" class="loginuser" name="password"></div>
	                </p>
	                <p>
	                   <div class="fl res-text">确认密码：</div><div><input type="password" class="loginuser"></div>
	                </p>
	                <p>
	                   <div class="fl res-text">验证码：</div>
	                   <div class="fl"><input type="password" class="loginuser2"></div>
	                   <div class="fl same-code">获取验证码</div>
	                   <!--<div class="fl same-code2">60秒后重新获取</div>-->
	                </p>
	                <p>
	                    <input type="submit" class="loginbtn" value="注册">
	                </p>
                </form>
            </div>
            <div class="conbox">
            	<p>
                    <div class="fl res-text">用户名：</div><div><input type="text" class="loginuser"></div>
                </p>
                <p>
                   <div class="fl res-text">密码：</div><div><input type="password" class="loginuser"></div>
                </p>
                <p>
                   <div class="fl res-text">确认密码：</div><div><input type="password" class="loginuser"></div>
                </p>
                <p>
                   <div class="fl res-text">验证码：</div>
                   <div class="fl"><input type="password" class="loginuser2"></div>
                   <div class="fl same-code">获取验证码</div>
                   <!--<div class="fl same-code2">60秒后重新获取</div>-->
                </p>
                <p>
                    <input type="button" class="loginbtn" value="注 册">
                </p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
