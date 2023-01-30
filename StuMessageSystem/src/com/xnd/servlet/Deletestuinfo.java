package com.xnd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xnd.dao.InfoDao;

@WebServlet("/deletestuinfo")
public class Deletestuinfo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid=Integer.parseInt(request.getParameter("uid"));
		InfoDao delstu=new InfoDao();
		delstu.deleteStuInfoById(uid);
	
		response.sendRedirect(request.getContextPath()+"/StuinfoShowServlet");
		return;
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

	
}
