package com.xnd.dao;

import java.sql.*;
import java.util.*;

import com.xnd.domain.*;
import com.xnd.utils.DbUtils;

public class LoginDaoImpl {
	public LoginUser findLogin(LoginUser loginuser) {
		String sql="select * from login_info where id=? and password=?";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		LoginUser logintype=null;
		
		String lid=loginuser.getId();
		String lpwd=loginuser.getPassword();
		con=DbUtils.getConnection();
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,lid);
			ps.setString(2, lpwd);
			rs=ps.executeQuery();
			while(rs.next()) {
				logintype=new LoginUser();
				logintype.setId(rs.getString("id"));
				logintype.setPassword(rs.getString("password"));
				logintype.setJob(rs.getString("job"));
				return logintype;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbUtils.close(con,ps,rs);
		}
		
		return logintype;
	}
	
	public void addlogin(LoginUser loginuser) {
		String sql="insert into login_info(id,password,job) values(?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		con=DbUtils.getConnection();
		if(con!=null) {
			try {
				ps=con.prepareStatement(sql);
				ps.setString(1, loginuser.getId());
				ps.setString(2, loginuser.getPassword());
				ps.setString(3, loginuser.getJob());
				int n=ps.executeUpdate();
				if(n>0) {
					System.out.println("×¢²á³É¹¦£¡");
				}else {
					System.out.println("×¢²áÊ§°Ü£¡");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DbUtils.close(con,ps);
			}
			
		}
	}
	
	public List<LoginUser> showAll(){
		String sql="select * from login_info";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		LoginUser logininfo=null;
		List<LoginUser> list=new ArrayList<LoginUser>();
		//
		con=DbUtils.getConnection();
		if(con!=null) {
			try {
				ps=con.prepareStatement(sql);
				//
				rs=ps.executeQuery();
				
				while(rs.next()) {
					logininfo=new LoginUser();
					logininfo.setId(rs.getString(1));
					logininfo.setPassword(rs.getString(2));
					logininfo.setJob(rs.getString(3));
					list.add(logininfo);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DbUtils.close(con,ps,rs);
			}
		}
		return list;
	}
}
