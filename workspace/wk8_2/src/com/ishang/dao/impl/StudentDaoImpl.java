package com.ishang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ishang.dao.StudentDao;
import com.ishang.entity.StudentsInfo;
import com.ishang.utils.UnitSQL;

public class StudentDaoImpl implements StudentDao {
    public Connection conn = null;
    public ResultSet rs = null;
    public PreparedStatement pstmt = null;

	@Override
	public int save(StudentsInfo t) {
		int n = 0;
		conn = UnitSQL.getConnection(); //获取数据库连接对象
		try {  			
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("insert into stu_info(id,name,sex,age,weight,hight) values(?,?,?,?,?   ,?)"); 			
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, t.getId());
			pstmt.setString(2, t.getName());
			pstmt.setString(3, t.getSex());
			pstmt.setInt(4, t.getAge());
			pstmt.setDouble(5, t.getWeight());
			pstmt.setDouble(6, t.getHight());
			n =  pstmt.executeUpdate();	  				
		}catch (Exception e) { 
			e.printStackTrace();
		}finally {
			UnitSQL.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public int update(StudentsInfo t) {
		int n = 0;
		conn = UnitSQL.getConnection(); //获取数据库连接对象
		try {  			
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("update stu_info set name=?,sex=?,age=?,weight=?,hight=? where id=?"); 			
			pstmt = conn.prepareStatement(sbSql.toString());			
			pstmt.setString(1, t.getName());
			pstmt.setString(2, t.getSex());
			pstmt.setInt(3, t.getAge());
			pstmt.setDouble(4, t.getWeight());
			pstmt.setDouble(5, t.getHight());
			pstmt.setInt(6, t.getId());
			n =  pstmt.executeUpdate();	  				
		}catch (Exception e) { 
			e.printStackTrace();
		}finally {
			UnitSQL.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public int delete(int id) {
		int n = 0;
		conn = UnitSQL.getConnection(); //获取数据库连接对象
		try {  			
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("delete from stu_info  where id=?"); 			
			pstmt = conn.prepareStatement(sbSql.toString());		 
			pstmt.setInt(1, id);
			n =  pstmt.executeUpdate();	  				
		}catch (Exception e) { 
			e.printStackTrace();
		}finally {
			UnitSQL.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public List<StudentsInfo> findByAll() {
		List<StudentsInfo> list = new ArrayList<>();
		conn = UnitSQL.getConnection(); //获取数据库连接对象
		try {  			
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from stu_info  "); 			
			pstmt = conn.prepareStatement(sbSql.toString());				 
			rs =  pstmt.executeQuery();	  
			while(rs.next()) {
				StudentsInfo students = new StudentsInfo();
				students.setId(rs.getInt("id"));
				students.setAge(rs.getInt("age"));
				students.setName(rs.getString("name"));
				students.setSex(rs.getString("sex"));
				students.setWeight(rs.getDouble("weight"));
				students.setHight(rs.getDouble("hight"));
				list.add(students);
			}
		}catch (Exception e) { 
			e.printStackTrace();
		}finally {
			UnitSQL.Close(rs, pstmt, conn);
		}
		return list;
	}

	@Override
	public StudentsInfo findById(int id) {
		StudentsInfo students = new StudentsInfo();
		conn = UnitSQL.getConnection(); //获取数据库连接对象
		try {  			
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from stu_info where id= ").append(id); 			
			pstmt = conn.prepareStatement(sbSql.toString());			 
			rs =  pstmt.executeQuery();	  
			students.setId(rs.getInt("id"));
			students.setAge(rs.getInt("age"));
			students.setName(rs.getString("name"));
			students.setSex(rs.getString("sex"));
			students.setWeight(rs.getDouble("weight"));
			students.setHight(rs.getDouble("hight"));
		}catch (Exception e) { 
			e.printStackTrace();
		}finally {
			UnitSQL.Close(rs, pstmt, conn);
		}
		return students;
	}

	@Override
	public List<StudentsInfo> findByEntity(StudentsInfo t) {
		List<StudentsInfo> list = new ArrayList<>();
		conn = UnitSQL.getConnection(); //获取数据库连接对象
		try {  			
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from stu_info where 1=1 "); 	
			if(t.getId()>0) {
				sbSql.append(" and id =").append(t.getId());
			}
			if(t.getName()!=null && !t.getName().equals("")) {
				sbSql.append(" and name like '%"+t.getName()+"%'");
			}
			if(t.getSex()!=null && !t.getSex().equals("")) {
				sbSql.append(" and sex like '%"+t.getSex()+"%'");
			}
			pstmt = conn.prepareStatement(sbSql.toString());				 
			rs =  pstmt.executeQuery();	  
			while(rs.next()) {
				StudentsInfo students = new StudentsInfo();
				students.setId(rs.getInt("id"));
				students.setAge(rs.getInt("age"));
				students.setName(rs.getString("name"));
				students.setSex(rs.getString("sex"));
				students.setWeight(rs.getDouble("weight"));
				students.setHight(rs.getDouble("hight"));
				list.add(students);
			}
		}catch (Exception e) { 
			e.printStackTrace();
		}finally {
			UnitSQL.Close(rs, pstmt, conn);
		}
		return list;
	}
 

}
