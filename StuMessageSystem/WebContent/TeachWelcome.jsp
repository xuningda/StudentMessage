<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息管理系统</title>

<link rel="stylesheet" type="text/css" href="css/TeaWel.css" />
</head>

<body>
<br>
<div class="exit">
	<a href="${pageContext.request.contextPath }/login.jsp">退出登录</a>
</div>
<div>
	<a href="${pageContext.request.contextPath }/addstuinfo.jsp">添加学生信息</a>
</div><br><br><br>
<div class="show">
	<c:choose>
		<c:when test="${!empty stuinfolist}">
			<table border="1">
				<thead>
				<div class="formtitle">
					<th>ID</th>
					<th>学生姓名</th>
					<th>学生性别</th>
					<th>学生年龄</th>
					<th>入学日期</th>
					<th>专&nbsp;&nbsp;&nbsp;&nbsp;业</th>
					<th>班&nbsp;&nbsp;&nbsp;&nbsp;级</th>
					<th>家庭住址</th>
					<th>手机号码</th>
					<th>操&nbsp;&nbsp;作</th>
				</div>
				</thead>
				<tbody>
					<c:forEach items="${stuinfolist}" var="Studentinfo" >
						<tr>
							<td>${Studentinfo.id}</td>
							<td>${Studentinfo.name }</td>
							<td>${Studentinfo.sex}</td>
							<td>${Studentinfo.age}</td>
							<td>${Studentinfo.studydate }</td>
							<td>${Studentinfo.major }</td>
							<td>${Studentinfo.classroom}</td>
							<td>${Studentinfo.address}</td>
							<td>${Studentinfo.mobile}</td>
							<td><a href="${pageContext.request.contextPath }/deletestuinfo?uid=${Studentinfo.id}"><div class="delete">删除</div></a><a href="${pageContext.request.contextPath }/updatestuinfo?uid=${Studentinfo.id}">修改学生信息</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:when>
	<c:otherwise>
		<div>
			<c:out value="${stuinfolist }">
				学生信息集合为空！
			</c:out>
		</div>
	</c:otherwise>
	</c:choose>
</div>

</body>
</html>