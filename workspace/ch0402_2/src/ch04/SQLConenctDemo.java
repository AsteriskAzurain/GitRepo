package ch04;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ch04.entity.BookBean;
import ch04.utils.BookUtils;

public class SQLConenctDemo {
	private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=lianxi";
	private static String username = "sa";
	private static String password = "323232";
	
	public static void main(String[] args) { 
		SQLConenctDemo sqlDemo = new SQLConenctDemo();
//		sqlDemo.connectDataBaseDelete();
//		sqlDemo.connectDataBaseSave();
//		sqlDemo.connectDataBaseSave2();
//		sqlDemo.connectDataBaseFind(); 
	    Connection conn = null;
	    ResultSet rs = null;
	    PreparedStatement pstmt = null;
		
		conn = BookUtils.getConnection(); 
		try {  			
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from book"); 			
			pstmt = conn.prepareStatement(sbSql.toString());				 
			rs =  pstmt.executeQuery();	  
			List<BookBean> list = new ArrayList<>();
			while(rs.next()) {
				BookBean book = new BookBean();
				book.setBookid(rs.getInt("bid"));
				book.setBookname(rs.getString("bname"));
				book.setAuthor(rs.getString("bauthor"));
				book.setPrice(rs.getFloat("bprice"));
				book.setNotes(rs.getString("bnote"));
				list.add(book);
//				System.out.println(book.toString());
			}
			System.out.println(list);
		}catch (Exception e) { 
			e.printStackTrace();
		}finally {
			BookUtils.Close(rs, pstmt, conn);
		}
	}
	
	
	public  void connectDataBaseSave() {
		try {  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url,username,password); 
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("insert into student values(?,?,?)"); 	
			String sql = "insert into student values(?,?,?)";	
			PreparedStatement pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setNString(1, "PC001");
			pstmt.setString(2, "张三");
			pstmt.setString(3, "�?"); 
			int n =  pstmt.executeUpdate();	 
			System.out.println(n);
			pstmt.close();
			conn.close();			
		}catch (Exception e) {
			// TODO: handle exception
		}		
	}
	
	public  void connectDataBaseSave2() {
		try { 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url,username,password); //获取数据库连接对�?
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("insert into student values('PC002','李四','�?')"); 	
			Statement stmt = conn.createStatement(); 		 
			int n =  stmt.executeUpdate(sbSql.toString());
			System.out.println(n);
			stmt.close();
			conn.close();			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public void connectDataBaseDelete() {
		try { 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载驱动
			Connection conn = DriverManager.getConnection(url,username,password); //获取数据库连接对�?
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("delete from student "); 	
			Statement stmt = conn.createStatement(); 		 
			int n =  stmt.executeUpdate(sbSql.toString());
			System.out.println(n);
			stmt.close();
			conn.close();			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public  void connectDataBaseFind() {
		try { 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url,username,password);
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from book"); 	
			PreparedStatement pstmt = conn.prepareStatement(sbSql.toString());
			ResultSet rs = pstmt.executeQuery();
			if(rs.equals(null)) {System.out.println("��rst");}
			else {System.out.println("�ǿ�");}
			System.out.println(rs);
			while(rs.next()) {				
				BookBean t = new BookBean();
				t.setBookid(rs.getInt(1));
				t.setBookname(rs.getString(2));
				t.setAuthor(rs.getString(3));
				t.setPrice(rs.getFloat(4));
				t.setNotes(rs.getString(5));
				System.out.println(t.toString());
			}
			pstmt.close();
			conn.close();			
		}catch (Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}finally {System.out.println("finally");}		
	}
	
	
	public  void connectDataBaseFind2() {
		try { 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载驱动
			Connection conn = DriverManager.getConnection(url,username,password); //获取数据库连接对�?
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from student"); 	
			Statement stmt = conn.createStatement(); 	
			ResultSet rs = stmt.executeQuery(sbSql.toString());
			while(rs.next()) {
				BookBean t = new BookBean();
				t.setBookid(rs.getInt("sno"));
				t.setBookname(rs.getString(2));
				t.setAuthor(rs.getString(3));
				System.out.println(t.toString());
			}
			stmt.close();
			conn.close();			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}


}
