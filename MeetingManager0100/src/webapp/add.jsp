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
  
  <body>
  	<center>
    <h2>添加英雄</h2>
    <hr width="50%" size="6" color="red">
  
    <form action="towAdd" method="post">
    	<table width="50%" height="30%">
    	
    		
    		<tr>
    			<td>姓名</td>
    			<td><input type="text" name="name"/></td>
    		</tr>
    		<tr>
    			<td>性别</td>
    			<td><input type="text" name="xingbie"/></td>
    		</tr>
    		<tr>
    			<td>电话</td>
    			<td><input type="text" name="tel"/></td>
    		</tr>
    		<tr>
    			<td>阵营</td>
    			<td><input type="text" name="gongsi"/></td>
    		</tr>
    		<tr>
    			<td>部门</td>
    			<td><input type="text" name="bumen"/></td>
    		</tr>
    		<tr>
    			<td>职务</td>
    			<td><input type="text" name="zhiwu"/></td>
    		</tr>
    		<tr>
    			<td>生日</td>
    			<td><input type="text" name="shengri"/></td>
    		</tr>
    		<tr>
    			<td>QQ</td>
    			<td><input type="text" name="qq"/></td>
    		</tr>
    		<tr>
    			<td>微信</td>
    			<td><input type="text" name="weixin"/></td>
    		</tr>
    		<tr>
    			<td>邮箱</td>
    			<td><input type="text" name="youxiang"/></td>
    		</tr>
    		<tr>
    			<td>微博</td>
    			<td><input type="text" name="weibo"/></td>
    		</tr>
    		<tr>
    			<td colspan="2">
    				<input type="submit" value="添加英雄"/>
    			</td>		
    		</tr>  	
    	</table>
    
    </form>
    </center>
  </body>
</html>
