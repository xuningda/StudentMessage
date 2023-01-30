<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/updatestuinfo" method="post">
    <table border="1" width="50%">
        <tr><td>ID</td><td><input type="text" name="id"></td></tr>
        <tr><td>姓名</td><td><input type="text" name="name"></td></tr>
        <tr><td>性别</td><td><input type="text" name="sex"></td></tr>
        <tr><td>年龄</td><td><input type="text" name="age"></td></tr>
        <tr><td>入学日期</td><td><input type="text" name="studydate"></td></tr>
        <tr><td>专业</td><td><input type="text" name="major"></td></tr>
        <tr><td>班级</td><td><input type="text" name="classroom"></td></tr>
        <tr><td>家庭地址</td><td><input type="text" name="address"></td></tr>
        <tr><td>手机号码</td><td><input type="text" name="mobile"></td></tr>
        <tr><td colspan="2" align="center"><input type="submit" value="提交"></td></tr>
    </table>
</form>
</body>
</html>