package ch0402.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ch04.utils.BookUtils;
import ch0402.entity.UserBean;

public class UserDao {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	
	public int insert(UserBean user) {
		int n=0;
		conn=BookUtils.getConnection();
		try {
			StringBuffer sql =new StringBuffer();
			sql.append("insert into card_user(uname,upasswd) values(?,?)");
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setString(1,user.getUname());
			pstmt.setString(2, user.getUpasswd());
			n=pstmt.executeUpdate();
		}catch(Exception e){
			System.out.println("insert exception");
			e.printStackTrace();
		}finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return n;
	}
	
	public List<UserBean> find(UserBean user){
		
		List<UserBean> list= new ArrayList<UserBean>();
		
		conn=BookUtils.getConnection();
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("select * from card_user where uname=?");
			pstmt=conn.prepareStatement(sql.toString());
			System.out.println(user.getUname());
			pstmt.setString(1, user.getUname());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				UserBean l= new UserBean();
				System.out.println(rs.getString("uname")+"\t"+rs.getString("upasswd"));
				l.setUid(rs.getInt("userid"));
				l.setUname(rs.getString("uname"));
				l.setUpasswd(rs.getString("upasswd"));
				list.add(l);
			}
		}catch(Exception e) {
			System.out.println("find exception");
			e.printStackTrace();
		}finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		
		return list;
	}
}
