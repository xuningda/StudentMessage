package com.xnd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xnd.dao.LoginDaoImpl;
import com.xnd.domain.LoginUser;

@WebServlet(name="登录" ,urlPatterns= {"/login"})
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//中文编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		//获取表单提交的数据
		String loginid=request.getParameter("id"); //<input type="text" name="id" />
		String loginpwd=request.getParameter("pwd"); //<input type="password" name="pwd" />
		LoginUser loginuser =new LoginUser();
		loginuser.setId(loginid);
		loginuser.setPassword(loginpwd);
		LoginDaoImpl luser=new LoginDaoImpl();
		LoginUser checkuser=luser.findLogin(loginuser);
		
		if(checkuser!=null) {
			if(checkuser.getJob().equals("teacher")) {
				
				request.getRequestDispatcher("StuinfoShowServlet").forward(request, response);
				
			}else if(checkuser.getJob().equals("student")) {
				
				request.getRequestDispatcher("StuWelcome.jsp").forward(request, response);
			}else if(checkuser.getJob().equals("admin")) {
				request.getRequestDispatcher("adminshow").forward(request, response);
			}else {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
			
	
	}

}
