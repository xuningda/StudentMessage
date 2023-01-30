<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<br>
		<form action="${pageContext.request.contextPath }/add" method="POST" >
			<table border="1">
				<tr>
					<th>ID:</th><td><input type="text" name="stuid" ></td>
				</tr>
				<tr>
					<th>学生姓名:</th><td><input type="text" name="stuname" ></td>
				</tr>
				<tr>
					<th>学生性别：</th><td><input type="text" name="stusex" ></td>
				</tr>
				<tr>
					<th>学生年龄：</th><td><input type="text" name="stuage" ></td>
				</tr>
				<tr>
					<th>入学日期：</th><td><input type="text" name="studate" ></td>
				</tr>
				<tr>
					<th>专业：</th><td><input type="text" name="stumajor" ></td>
				</tr>
				<tr>
					<th>班级：</th><td><input type="text" name="stuclass" ></td>
				</tr>
				<tr>
					<th>家庭住址：</th><td><input type="text" name="stuaddr" ></td>
				</tr>
				<tr>
					<th>手机号码：</th><td><input type="text" name="stumobile" ></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="添加"></td>
				</tr>
				
			</table>
		
		</form>
	</div>
</body>
</html>