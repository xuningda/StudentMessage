<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息管理系统</title>


<link rel="stylesheet"  type="text/css" href="css/login.css" />
</head>
<body>
<br>
<h1 align="center">学生信息管理系统</h1>
<br><br>
<div class="loginbox">
<div class="content">
	<h2><font size="10px"> Sign In</font></h2>
	<br><br>
	<form action="login" method="POST" >
	<div class="user">
	<tr>
		<th>用户账号：</th><td><input type="text" name="id" /></td><br><br>
	</tr>
	</div>
	<div class="pwd">
	<tr>
		<th>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;</th><td><input type="password" name="pwd" /></td><br><br>
	</tr>
	</div>
	<div class="denglu">
	<br><br>
	<tr colspan="2" >
		<th><input type="submit" value="登录" ></th>
		<th><input type="reset" value="重填" ></th>
	</tr>
	</div>
	</form>

</div>
</div>
</body>
</html>