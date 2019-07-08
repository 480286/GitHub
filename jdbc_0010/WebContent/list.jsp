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
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <!-- 地址编号    收货人姓名   省  市  区（县）  详细地址   邮编   电话号码
   -->
  
  <body>
  	<center>
  		<h1>地址信息</h1>
  		<hr width="50%" color="red" size="9">
  		<table  width="40%" height="30%">
		    <tr>
		    	<td>地址编号</td>
		    	<td>收货人姓名</td>
		    	<td>省	市 	区（县）</td>
		    	<td>详细地址</td>
		    	<td>邮编</td>
		    	<td>电话号码</td>
		    	<td>操作</td>
		    </tr>
		    <%
		    	List<Address> addressLst=(List<Address>)session.getAttribute("lst");
		    	for(Address a:addressLst){
		     %>
		     <tr>
		     	<td><%=a.getAdd_id() %></td>
		     	<td><%=a.getAdd_name() %></td>
		     	<td><%=a.getAdd_ssx() %></td>
		     	<td><%=a.getAdd_xq() %></td>
		     	<td><%=a.getAdd_yb() %></td>
		     	<td><%=a.getAdd_tel() %></td>
		     	<td><a href="DeleteServlet?id=<%=a.getAdd_id() %>">删除</a> | <a href="LoadServlet?id=<%=a.getAdd_id() %>">修改</a></td>
		     </tr>
		     <%
		     	}
		      %>
		      
		      <tr>
		      	<td colspan="5">
		      		<a href="add.jsp">添加地址信息</a>
		      	</td>
		      </tr>
		</table>
	</center>
  </body>
</html>
