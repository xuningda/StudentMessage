package com.xnd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xnd.dao.InfoDao;
import com.xnd.domain.Studentinfo;

@WebServlet("/updatestuinfo")
public class Updatestuinfo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method=request.getMethod();
		
		InfoDao up=new InfoDao();
		Studentinfo stuinfo=null;
		if("get".equalsIgnoreCase(method)) {
			int uid=Integer.parseInt(request.getParameter("uid"));
			if(uid!=0) {
				stuinfo=up.findByStuId(uid);
				request.setAttribute("idinfo", stuinfo);
				request.getRequestDispatcher("/UpdateStuinfo.jsp").forward(request, response);
				return;
			}
		}else if("post".equalsIgnoreCase(method)){
		    String uid=request.getParameter("uid");
			stuinfo=new Studentinfo();
			stuinfo.setId(uid);
			stuinfo.setName(request.getParameter("name"));
			stuinfo.setSex(request.getParameter("sex"));
			stuinfo.setAge(request.getParameter("age"));
			stuinfo.setStudydate(request.getParameter("studydate")); 
			stuinfo.setMajor(request.getParameter("major"));
			stuinfo.setClassroom(request.getParameter("classroom"));
			stuinfo.setAddress(request.getParameter("address"));
			stuinfo.setMobile(request.getParameter("mobile"));
			
			up.updateStuInfo(stuinfo);
			response.sendRedirect(request.getContextPath()+"/StuinfoShowServlet");
			return;
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}

}
