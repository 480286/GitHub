<%@page import="com.mypack.entity.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!-- 引入jstl标签库   -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    This is my JSP page. <br>
    <!-- jsp本质上就是html+java代码片段   以html为主，java代码片段为辅 -->
  <!-- jsp9大内置对象： out request response session application page pageContext  exception config-->
  <!-- jsp4大作用域： page  request session application
  在相应的作用域里面设置的值都能共享
  	page:  当前页面  
  	request:  HttpServletRequest 请求转发的前后两个页面
  	session: HttpSession  会话 一个用户的一系列的流程
  	application:  ServletContext 该项目  ，所有session都共享的全局变量，只有一份
  	
  	都有方法：
  	setAttribute(String name,Object value);  设置值
  	Object getAttribute(String name);	取值
  
   -->
   <!-- 取值的几种方式 -->
   <%
   		Student s=new Student(1,"李四",23,"洛阳");
   		pageContext.setAttribute("stu", s);
        //request.setAttribute(arg0, arg1)
        //session.setAttribute(arg0, arg1)
        //application.setAttribute("name", "application_lisi");
        //取值方式一  通过java代码
        Student stu=(Student)pageContext.getAttribute("stu");
        out.println("姓名是： "+stu.getName());
        
        String[] strs={"ddd","fff","aaa","ttt"};
        session.setAttribute("arr", strs);
        
   %>	
   <!-- 取值方式二 jsp表达式  -->
   姓名： <%=((Student)pageContext.getAttribute("stu")).getName() %><br>
   
   <!-- 取值方式三  el表达式 -->
   <!-- 
   	jsp作用域：  page  request session application
   	el作用域： pageScope   requestScope  sessionScope  applicationScope 
    -->
   姓名是： ${pageScope.stu.name} <br>
   
   <!-- 取数组或集合  java for循环 或者 jstl标签库-->
   <c:forEach var="str" items="${sessionScope.arr }">
   		${str }
   </c:forEach>
  </body>
</html>
