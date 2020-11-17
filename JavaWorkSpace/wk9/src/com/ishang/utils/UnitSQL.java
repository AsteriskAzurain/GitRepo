package com.ishang.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UnitSQL {
	public static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=students";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "323232";
	public static final String DREIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	static {
		try {
			// 加载驱动�?
			Class.forName(DREIVER);

			/*
			 * //还有另一种方�?,但是会加载驱动二�?,通常不使用该方法 try { DriverManager.registerDriver(new
			 * com.mysql.jdbc.Driver()); } catch (SQLException e) { e.printStackTrace(); }
			 */
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 建立连接
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);// 创建与数据库的链�?
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 关闭连接
	public static void Close(ResultSet rs, PreparedStatement ps, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (ps != null) {
			try {
				ps.close();
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
