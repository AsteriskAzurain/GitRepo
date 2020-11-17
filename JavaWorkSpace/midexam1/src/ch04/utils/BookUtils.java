package ch04.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUtils {
	public static final String URL = "jdbc:sqlserver://DESKTOP-5LN0GQB:1433;DatabaseName=lianxi";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "323232";
	public static String DREIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	public static Connection getConnection() {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("数据库驱动加载成功！");}
		catch(Exception e){
			System.out.println("加载失败");
			e.printStackTrace();
			
		}try {
			
			Connection c =DriverManager.getConnection(URL,"sa","323232");
			System.out.println("数据库连接成功！");
			return c;
		} catch (Exception e) {
			System.out.println("Exceptionconn");
			e.printStackTrace();
		}
		return null;
	}
	public static void Close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
