package com.ishang.webtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectSQL {
	public static final String URL = "jdbc:sqlserver://192.168.100.172:1433;DatabaseName=mydata";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "Ishang123";
	public static final String DREIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	public static void main(String[] args) {
		ConnectSQL cs = new ConnectSQL();
		// 添加
		cs.save();
		// 查询
		cs.find();		
		// 修改
		cs.update();
		// 删除
		cs.delete();
	}

	// 添加
	public void save() {
		try {
			Class.forName(DREIVER);
			Connection cn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "insert into book(code,name,author,price,memo) values(?,?,?,?,?) ";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, "P002");
			ps.setString(2, "Java程序设计");
			ps.setString(3, "张三");
			ps.setDouble(4, 11.0);
			ps.setString(5, "测试");
			int n = ps.executeUpdate();
			ps.close();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 查询
	public void find() {
		try {
			Class.forName(DREIVER);
			Connection cn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "select * from book";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {			
				System.out.println(rs.getString(2));
			}
			ps.close();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 修改
	public void update() {
		try {
			Class.forName(DREIVER);
			Connection cn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "update book set name=? where code = ? ";
			PreparedStatement ps = cn.prepareStatement(sql); 
			ps.setString(1, "面向对象程序设计");
			ps.setString(2, "P001"); 
			ps.executeUpdate();
			ps.close();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 删除
	public void delete() {
		try {
			Class.forName(DREIVER);
			Connection cn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "delete from book where code=?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, "P001");  
			ps.executeUpdate();
			ps.close();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
