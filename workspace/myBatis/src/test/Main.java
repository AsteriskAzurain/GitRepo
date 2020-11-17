package test;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://114.67.73.152:3306/mybatis?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "000000");
            String sql = "select * from user where username = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"王五");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getString("id")+"   "
                        +resultSet.getString("username")
                        +"   "+resultSet.getString("birthday")
                        +"   "+resultSet.getString("sex")
                        +"   "+resultSet.getString("address"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
