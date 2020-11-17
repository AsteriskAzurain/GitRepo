package pkg;

import java.sql.*;

public class ConnSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=test";
			String userName="sa";
			String userPwd="";
			
			try {
				Class.forName(driverName);
				System.out.println("加载驱动成功！");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}
