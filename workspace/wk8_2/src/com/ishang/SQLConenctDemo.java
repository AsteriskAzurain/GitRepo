package com.ishang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ishang.entity.Student;

public class SQLConenctDemo {
	private static String url = "jdbc:sqlserver://192.168.1.110:1433;DatabaseName=students";
	private static String username = "sa";
	private static String password = "123456";
	
	public static void main(String[] args) { 
		SQLConenctDemo sqlDemo = new SQLConenctDemo();
		sqlDemo.connectDataBaseDelete();
		sqlDemo.connectDataBaseSave();
		sqlDemo.connectDataBaseSave2();
		sqlDemo.connectDataBaseFind(); 
	}
	
	
	public  void connectDataBaseSave() {
		try {  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载驱动
			Connection conn = DriverManager.getConnection(url,username,password); //获取数据库连接对象
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("insert into student values(?,?,?)"); 	
			String sql = "insert into student values(?,?,?)";	
			PreparedStatement pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setNString(1, "PC001");
			pstmt.setString(2, "张三");
			pstmt.setString(3, "女"); 
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
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载驱动
			Connection conn = DriverManager.getConnection(url,username,password); //获取数据库连接对象
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("insert into student values('PC002','李四','男')"); 	
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
			Connection conn = DriverManager.getConnection(url,username,password); //获取数据库连接对象
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
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载驱动
			Connection conn = DriverManager.getConnection(url,username,password); //获取数据库连接对象
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from student"); 	
			PreparedStatement pstmt = conn.prepareStatement(sbSql.toString());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {				
				Student t = new Student();
				t.setSno(rs.getString(1));
				t.setSname(rs.getString(2));
				t.setSex(rs.getString(3));
				System.out.println(t.toString());
			}
			pstmt.close();
			conn.close();			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	
	public  void connectDataBaseFind2() {
		try { 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载驱动
			Connection conn = DriverManager.getConnection(url,username,password); //获取数据库连接对象
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from student"); 	
			Statement stmt = conn.createStatement(); 	
			ResultSet rs = stmt.executeQuery(sbSql.toString());
			while(rs.next()) {
				Student t = new Student();
				t.setSno(rs.getString("sno"));
				t.setSname(rs.getString(2));
				t.setSex(rs.getString(3));
				System.out.println(t.toString());
			}
			stmt.close();
			conn.close();			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}


}
