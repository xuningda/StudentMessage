package com.xnd.servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xnd.dao.InfoDao;
import com.xnd.domain.Studentinfo;



@WebServlet("/StuinfoShowServlet")
public class StuinfoShow extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		

		InfoDao info=new InfoDao();
		List<Studentinfo> stuinfolist=info.showAll();
		request.setAttribute("stuinfolist", stuinfolist);
		request.getRequestDispatcher("TeachWelcome.jsp").forward(request, response);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req,resp);
	}
		
}
