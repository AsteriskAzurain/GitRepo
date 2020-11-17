package ch06.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ch06.dao.UserDao;
import ch06.entity.UserBean;
import ch0802.utils.UnitSQL;

public class UserDaoImpl implements UserDao {

	public static Connection conn = null;
    public static ResultSet rs = null;
    public static PreparedStatement pstmt = null;
	
	@Override
	public List<UserBean> SearchByEntity(UserBean t) {
		// TODO Auto-generated method stub
		conn = UnitSQL.getConnection();
		List<UserBean> list = new ArrayList<>();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from user_info where 0=1 ");
			if (t.getRname() != null && !t.getRname().equals("")) {
				sbSql.append(" or rname like '%" + t.getRname() + "%'");
			}
			pstmt = conn.prepareStatement(sbSql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("find sth");
				UserBean user = new UserBean();
				user.setRname(rs.getString("rname"));
				user.setRsex(rs.getString("rsex"));
				user.setRyear(rs.getInt("ryear"));
				user.setRmonth(rs.getInt("rmonth"));
				user.setRrace(rs.getString("rrace"));
				user.setRintro(rs.getString("rintro"));
				list.add(user);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			UnitSQL.Close(rs, pstmt, conn);
		}
		
		return list;
	}

	@Override
	public int Insert(UserBean t) {
		// TODO Auto-generated method stub
		
		try {
			
			conn = UnitSQL.getConnection();
			int n=0;
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("insert into user_info(rname,rsex,ryear,rmonth,rrace,rintro) values(?,?,?,?,?,?)");
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setString(1, t.getRname());
			pstmt.setString(2, t.getRsex());
			pstmt.setInt(3, t.getRyear());
			pstmt.setInt(4, t.getRmonth());
			pstmt.setString(5, t.getRrace());
			pstmt.setString(6, t.getRintro());
			n=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			UnitSQL.Close(rs, pstmt, conn);
			}
		return 0;
	}
}
