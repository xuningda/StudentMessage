package com.xnd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xnd.dao.LoginDaoImpl;
import com.xnd.domain.LoginUser;


@WebServlet(name="注册",urlPatterns= {"/register"})
public class Registerlogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request,response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//获取表单提交数据
		String nid=request.getParameter("id");
		String npwd=request.getParameter("password");
		String ntp=request.getParameter("type");
		
		LoginUser loginuser=new LoginUser();
		loginuser.setId(nid);
		loginuser.setPassword(npwd);
		loginuser.setJob(ntp);
		LoginDaoImpl login1= new LoginDaoImpl();
		login1.addlogin(loginuser);
		request.getRequestDispatcher("/adminshow").forward(request, response);
		
	}
	
}
