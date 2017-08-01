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
    
    <title>My JSP 'reg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="static/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript">
	
		$(function() {
			$("#firstname").blur(function() {
				$.post("user/Exisit", "ename=" + $(this).val(), function(d) {
					if(d=="ok"){
						alert("用户名存在")
						$("#firstname").val($("#firstname").val()+"市场部")
					}
				});

			});
		});
	</script>
  </head>
  
  <body>
	<form class="form-horizontal" role="form" action="user/add">
		
		<div class="form-group">
			<label for="firstname" class="col-sm-2 control-label">员工</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="firstname" name="ename"
					placeholder="请输入员工">
			</div>
		</div>
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">用户名</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="lastname" name="username"
					placeholder="请输入用户名">
			</div>
		</div>
		
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">密码</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="lastname1" name="password"
					placeholder="请输入密码">
			</div>
		</div>
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">入职时间</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="lastname2" name="starttime"
					placeholder="请输入入职时间">
			</div>
		</div>
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">离职时间</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="lastname3" name="entime"
					placeholder="请输入离职时间">
			</div>
		</div>
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">薪资</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="lastname4" name="salary"
					placeholder="请输入薪资">
			</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2  control-label">部门列表</label>
				<select class="col-sm-2" name="did">
				<c:forEach items="${sessionScope.list}" var="dept">
					<option value="${dept.did}">${dept.dname}</option>
				</c:forEach>
				</select>
				
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">提交</button>
			</div>
		</div>
	
	</form>
</body>
</html>
