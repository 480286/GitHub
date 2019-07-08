<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xiangqing.jsp' starting page</title>
    
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
  	英雄详情
  		<a href="xinXi">返回</a><br>
  			姓名:${yx.name }<br>
  			性别:${yx.xingbie }<br>
  			手机号:${yx.tel }<br>
  			所在阵营:${yx.gongsi }<br>
  			所在部门:${yx.bumen }<br>
  			职务:${yx.zhiwu }<br>
  			<hr  color="red" size="1">
  			生日:${yx.shengri }<br>
  			QQ:${yx.qq }<br>
  			微信:${yx.weixin }<br>
  			邮箱:${yx.youxiang }<br>
  			微博:${yx.weibo }<br>
    <br>
  </body>
</html>
