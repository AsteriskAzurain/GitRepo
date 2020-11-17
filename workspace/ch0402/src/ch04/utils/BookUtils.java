package ch04.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUtils {
	public static String URL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=lianxi";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "323232";
	public static final String DREIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	public static Connection getConnection() {
		
		try {
			Class.forName(DREIVER);
			System.out.println("driver succeed");
			Connection c =DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connected");
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
