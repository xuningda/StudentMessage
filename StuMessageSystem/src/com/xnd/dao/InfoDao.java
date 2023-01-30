package com.xnd.dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import com.xnd.domain.Studentinfo;
import com.xnd.utils.DbUtils;

public class InfoDao  {
	public List<Studentinfo> showAll() {
		String sql="select * from student_info";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Studentinfo> list=new ArrayList<Studentinfo>(); //定义一个集合对象来存放
		//连接数据库
		con=DbUtils.getConnection();
		if(con!=null) {
			try {
				ps=con.prepareStatement(sql);
				//执行查询操作，并返回一个结果集
				rs=ps.executeQuery();
				Studentinfo stuinfo=null;
				//遍历结果集对象
				while(rs.next()) {
					stuinfo=new Studentinfo();
					stuinfo.setId(rs.getString(1));
					stuinfo.setName(rs.getString(2));
					stuinfo.setSex(rs.getString(3));
					stuinfo.setAge(rs.getString(4));
					stuinfo.setStudydate(rs.getString(5));
					stuinfo.setMajor(rs.getString(6));
					stuinfo.setClassroom(rs.getString(7));
					stuinfo.setAddress(rs.getString(8));
					stuinfo.setMobile(rs.getString(9));
					list.add(stuinfo);
					
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
	
	public void addstuinfo(Studentinfo stuinfo) {
		String sql="insert into student_info(stuinfo_id,name,sex,age,studydate,major,classroom,address,mobile) values(?,?,?,?,?,?,?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		 
		con=DbUtils.getConnection();
		if(con!=null) {
			try {
				ps=con.prepareStatement(sql);
				
				ps.setString(1, stuinfo.getId());
				ps.setString(2, stuinfo.getName());
				ps.setString(3, stuinfo.getSex());
				ps.setString(4, stuinfo.getAge());
				ps.setString(5,stuinfo.getStudydate());
				ps.setString(6, stuinfo.getMajor());
				ps.setString(7, stuinfo.getClassroom());
				ps.setString(8, stuinfo.getAddress());
				ps.setString(9, stuinfo.getMobile());
			
				int n=ps.executeUpdate();
				if(n>0) {
					System.out.println("添加成功！");
					
				}else {
					System.out.println("添加失败！");

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DbUtils.close(con,ps);
			}
			
		}
	}
	
	
	public void deleteStuInfoById(int id) {
		String sql="delete from student_info where stuinfo_id=?";
		Connection con=null;
		PreparedStatement ps=null;
		con=DbUtils.getConnection();
		if(con!=null) {
			try {
				ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				int n=ps.executeUpdate();
				if(n>0) {
					System.out.println("删除成功！");
				}else {
					System.out.println("删除失败！");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DbUtils.close(con,ps);
			}
			
		}
		
	}
	
	public void deleteLoginInfoById(int id) {
		String sql="delete from login_info where id=?";
		Connection con=null;
		PreparedStatement ps=null;
		con=DbUtils.getConnection();
		if(con!=null) {
			try {
				ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				int n=ps.executeUpdate();
				if(n>0) {
					System.out.println("删除成功！");
				}else {
					System.out.println("删除失败！");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DbUtils.close(con,ps);
			}
			
		}
		
	}
	
	public Studentinfo findByStuId(int id) {
		String sql="select * from student_info where stuinfo_id=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Studentinfo infos=null;
		con=DbUtils.getConnection();
		if(con!=null) {
			try {
				ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				rs=ps.executeQuery();
				while(rs.next()) {
					infos=new Studentinfo();
					infos.setId(rs.getString("stuinfo_id"));
					infos.setName(rs.getString("name"));
					infos.setSex(rs.getString("sex"));
					infos.setAge(rs.getString("age"));
					infos.setStudydate(rs.getString("studydate"));   
					infos.setMajor(rs.getString("major"));
					infos.setClassroom(rs.getString("classroom"));
					infos.setAddress(rs.getString("address"));
					infos.setMobile(rs.getString("mobile"));
					return infos;	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DbUtils.close(con,ps,rs);
			}
		}
		return infos;
	}
	
	
	
	
	
	public void updateStuInfo(Studentinfo stuinfo) {
		String sql="update student_info set stuinfo_id=?,name=?,sex=?,age=?,studydate=?,major=?,classroom=?,address=?,mobile=? where stuinfo_id=?";
		Connection con=null;
		PreparedStatement ps=null;
		Studentinfo stuifno =null;
		con=DbUtils.getConnection();
		if(con!=null) {
			try {
				ps=con.prepareStatement(sql);
				ps.setString(1, stuinfo.getId());
				ps.setString(2, stuinfo.getName());
				ps.setString(3, stuinfo.getSex());
				ps.setString(4, stuinfo.getAge());
				ps.setString(5, stuinfo.getStudydate());  
				ps.setString(5, stuinfo.getMajor());
				ps.setString(6, stuinfo.getClassroom());
				ps.setString(7, stuinfo.getAddress());
				ps.setString(8, stuinfo.getMobile());
				ps.setString(9, stuinfo.getId());
				int n=ps.executeUpdate();
				if(n>0) {
					System.out.println("修改成功！");
				}else {
					System.out.println("修改失败！");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DbUtils.close(con,ps);
			}
			
		}
	}
}
