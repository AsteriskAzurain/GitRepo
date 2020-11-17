package ch0802.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ch0802.dao.StudentDao;
import ch0802.entity.StudentTo;
import ch0802.utils.UnitSQL;

public class StudentDaoImpl implements StudentDao {
	public Connection conn = null;
    public ResultSet rs = null;
    public PreparedStatement pstmt = null;
	@Override
	public List<StudentTo> SearchByEntity(StudentTo t) {

		List<StudentTo> list = new ArrayList<>();
		conn = UnitSQL.getConnection(); //获取数据库连接对象
		try {  			
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from stu_info where 1=1 "); 	
			if(t.getId()>0) {
				sbSql.append(" and id =").append(t.getId());
			}
			if(t.getCode()!=null && !t.getCode().equals("")) {
				sbSql.append(" and code ='"+t.getCode().trim()+"'");
			}
			if(t.getName()!=null && !t.getName().equals("")) {
				sbSql.append(" and name ='"+t.getName().trim()+"'");
			}
			if(t.getSex()!=null && !t.getSex().equals("")) {
				sbSql.append(" and sex like '%"+t.getSex().trim()+"%'");
			}
			pstmt = conn.prepareStatement(sbSql.toString());				 
			rs =  pstmt.executeQuery();	  
			while(rs.next()) {
				StudentTo students = new StudentTo();
				students.setId(rs.getInt("id"));
				students.setCode(rs.getString("code"));
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
