package com.test;/*
  @Classname JDBUtil_test
  @Description TODO
  @Date 2022/4/21 8:25
  @Created by mlf02
 */

import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBUtil_test {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            connection = DBUtil.getConnection();
            statement = connection.prepareStatement("select * from log_in where username = ? and password = ?");
            statement.setString(1,"zhangsan");
            statement.setString(2,"123456");
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                System.out.println("登录成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }




    }





}
