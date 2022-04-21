package com.test;/*
  @Classname JDBC_4
  @Description TODO jdbc事务
  @Date 2022/4/20 10:24
  @Created by mlf02
 */

import java.sql.*;
import java.util.ResourceBundle;

public class JDBC_4 {
    //在jdbc当中存在自动提交机制
    //自动提交就是 每执行一次dml语句就进行一次提交

    //在实际开发当中必须将JDBC的自动提交机制关闭掉，改成手动提交。
    //当一个完整的事务结束之后，再提交
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("resources/db");
        String url = bundle.getString("url");
        String driver = bundle.getString("driver");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        Connection    connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            //关闭自动提交
            connection.setAutoCommit(false);
             ps = connection.prepareStatement("update zhanghu set price = ? where name = ?");
             ps.setInt(1,10000);
             ps.setString(2,"zhangsan");
             ps.executeUpdate();

             ps.setInt(1,10000);
             ps.setString(2,"lisi");
             ps.executeUpdate();
             //两者都执行完毕之后并且不报异常，提交事务
            connection.commit();



        } catch (Exception e) {

            try {
                if (connection!=null){
                    //如果报异常的滑，进行手动回滚
                    connection.rollback();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
