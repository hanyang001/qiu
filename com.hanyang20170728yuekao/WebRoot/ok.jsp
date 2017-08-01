<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ok.jsp' starting page</title>
    
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
   	<form action="user/selectIf" method="post">
   			工资:<input type="text" name="salary">
   			部门:<select name="did">
				<c:forEach items="${sessionScope.list}" var="dept">
					<option value="${dept.did}">${dept.dname}</option>
				</c:forEach>
				</select>
   			<input type="submit">
   	</form>	
   			<table>
   				<tr>
   					<td>员工</td>
   					<td>用户名</td>
   					<td>密码</td>
   					<td>入职时间</td>
   					<td>离职时间</td>
   					<td>工资</td>
   					<td>部门</td>
   				</tr>
   				<c:forEach items="${allList}" var="emp">
   					<tr>
   					<td>${emp.ename}</td>
   					<td>${emp.username}</td>
   					<td>${emp.password}</td>
   					<td>${emp.starttime}</td>
   					<td>${emp.entime}</td>
   					<td>${emp.salary}</td>
   					<td>${emp.dept.dname}</td>
   				</tr>
   				
   				</c:forEach>
   			</table>
   </center>
  </body>
</html>
