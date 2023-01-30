<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
<body>
	  <div style="background-color: rgb(164, 255, 225); width:400px;" class="card">
        <h3>注册新用户</h3>
       <div class="form">
        <form action="register" method="post">
            <table>
                <tr>
                    <td id="id">用户账号：</td>
                    <td><input type="text" name="id" ></td>
                </tr>
                <tr>
                    <td id="pwd">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td id="tp">账号类型：</td>
                    <td><input type="text" name="type"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="点击注册"></td>
                    <td><input type="reset" value="重置"></td>
                </tr>
            </table>
        </form>
    </div>
    </div>
</body>
</html>