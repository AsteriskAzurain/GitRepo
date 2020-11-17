package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import dao.BookDao;
import entity.Book;

public class BookDaoImpl implements BookDao {

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		int n = 0;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection cn = DriverManager.getConnection("desktop-5ln0gqb","qysx3","");//共有三种方式
			/*1、参数：url，方式：拼接url
			 *2、参数：url, info，方式：传属性值
			 *3、参数：url, username, password，方式：直接传入数据库的用户名+密码 */
			
			String sql = "delete from Book where id=?";
			PreparedStatement pstms = cn.prepareStatement(sql);
			/*两种方式写sql语句：
			 * 1、预编译
			 * 2、静态*/
			pstms.setObject(1, "");
		    n = pstms.executeUpdate();//增删改都用这句，查询用executeQuery
		    pstms.close();
		    cn.close();
			
		}catch (Exception e) {
			e.getMessage();
		}
		return n;
	}

	@Override
	public int save() {
		// TODO Auto-generated method stub
		try {
			Connection conn=DriverManager.getConnection("desktop-5ln0gqb","qysx3","");
			StringBuffer sbSql=new StringBuffer();
			sbSql.append("insert into Book(BID,BName,BAuthor,BPrice,Bnotes) values(?,?,?,?,?)");
			//String sql="insert into student values(?,?,?)";
			PreparedStatement pstmt =conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, 123);
			pstmt.setNString(2, "123");
			pstmt.setNString(3, "123");
			pstmt.setFloat(4,12);
			pstmt.setNString(5,"123");
			int n=pstmt.executeUpdate();
			if(n==1){System.out.println("insert succeed");}
			else{System.out.println("insert failed");}
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.getMessage();
		}finally {}
		return 0;
	}

	@Override
	public List<Book> findbyall() {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection cn = DriverManager.getConnection("desktop-5ln0gqb","qysx3","");
			String sql = "select * from Book";
			PreparedStatement pstms = cn.prepareStatement(sql);
		    ResultSet rs=pstms.executeQuery();
		    pstms.close();
		    cn.close();
		    
		}catch(Exception e) {
			e.getMessage();
		}finally {
			
		}
		return null;
	}

}
