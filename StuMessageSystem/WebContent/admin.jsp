<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员界面</title>

</head>
<body>
		<h1>管理员界面</h1>
<div>
			<a href="${pageContext.request.contextPath }/register.jsp">注册账号信息</a>
</div>
<hr>
 <div class="show">
		<c:choose>
		<c:when test="${!empty loginlist}">
			<table border="1">
				<thead>
				<div class="formtitle">
					<th>用户名</th>
					<th>密码</th>
					<th>用户类型</th>
					<th>操&nbsp;&nbsp;作</th>
				</div>
				</thead>
				<tbody>
					<c:forEach items="${loginlist}" var="LoginUser" >
						<tr>
							<td>${LoginUser.id}</td>
							<td>${LoginUser.password }</td>
							<td>${LoginUser.job}</td>
							<td><a>删除</a><a>修改学生信息</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:when>
	<c:otherwise>
		<div>
			<c:out value="${loginlist }">
			      用户信息集合为空！
			</c:out>
		</div>
	</c:otherwise>
	</c:choose>
 </div>
		
</body>
</html>