package com.xnd.servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xnd.dao.LoginDaoImpl;
import com.xnd.domain.LoginUser;


@WebServlet("/adminshow")
public class AdminShow extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		//
		LoginDaoImpl loginshow=new LoginDaoImpl();
		List<LoginUser> loginlist=loginshow.showAll();
		request.setAttribute("loginlist", loginlist);
		request.getRequestDispatcher("admin.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);		
	}
   
}
