package com.util;/*
  @Classname DButil
  @Description TODO
  @Date 2022/4/20 11:13
  @Created by mlf02
 */

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtil {
    //类加载时绑定资源文件
    private static   ResourceBundle bundle=ResourceBundle.getBundle("resources/db");
    private DBUtil(){}
    static {
        try {
            Class.forName(bundle.getString("driver"));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager
                .getConnection(
                        bundle.getString("url"),
                        bundle.getString("user"),
                        bundle.getString("password"));
        return connection;
    }

    public static void close(Connection con, Statement st,ResultSet resultSet)  {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
