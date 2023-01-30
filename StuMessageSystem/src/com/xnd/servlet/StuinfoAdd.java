package com.xnd.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xnd.dao.InfoDao;
import com.xnd.domain.Studentinfo;

@WebServlet("/add")
public class StuinfoAdd extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//±‡¬ÎŒ Ã‚
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");

			String sid=request.getParameter("stuid");
			String sname=request.getParameter("stuname");
			String ssex=request.getParameter("stusex");
			String sage=request.getParameter("stuage");
			String sdate=request.getParameter("studate"); 
			String smajor=request.getParameter("stumajor");
			String sclass=request.getParameter("stuclass");
			String saddr=request.getParameter("stuaddr");
			String smobile=request.getParameter("stumobile");
		/*	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d;
			try {
				d = sdf.parse(sdate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 */	
			Studentinfo stuinfo=new Studentinfo();
			stuinfo.setId(sid);
			stuinfo.setName(sname);
			stuinfo.setSex(ssex);
			stuinfo.setAge(sage);
			stuinfo.setStudydate(sdate);  
			stuinfo.setMajor(smajor);
			stuinfo.setClassroom(sclass);
			stuinfo.setAddress(saddr);
			stuinfo.setMobile(smobile);
			
			InfoDao iadd=new InfoDao();
			iadd.addstuinfo(stuinfo);
			request.getRequestDispatcher("/StuinfoShowServlet").forward(request, response);
			
	}
	
}
