package com.test;/*
  @Classname JDBC_3
  @Description TODO 使用PreparedStatement模糊查询
  @Date 2022/4/20 9:54
  @Created by mlf02
 */

import java.sql.*;
import java.util.ResourceBundle;

public class JDBC_3 {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ResourceBundle bundle = ResourceBundle.getBundle("resources/db");
        String url = bundle.getString("url");
        String driver = bundle.getString("driver");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,password);
            ps = connection.prepareStatement("select name from student where name like ? ");
            ps.setString(1,"%令%");
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
