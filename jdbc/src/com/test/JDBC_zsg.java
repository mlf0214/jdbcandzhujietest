package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBC_zsg {
/*
  @Classname JDBC_zsg
  @Description TODO 使用PreparedStatement完成增删改
  @Date 2022/4/20 9:25
  @Created by mlf02
 */
public static void main(String[] args) {
    Connection connection=null;
    PreparedStatement ps=null;
    //资源绑定器
    ResourceBundle bundle=ResourceBundle.getBundle("resources/db");
    String driver = bundle.getString("driver");
    String url = bundle.getString("url");
    String user = bundle.getString("user");
    String password = bundle.getString("password");
    try {
        Class.forName(driver);
        connection = DriverManager.getConnection(url,user,password);
        //增加一条数据
//        ps= connection.prepareStatement("insert into mysql.student(age,name) value (?,?)");
//        ps.setInt(1,16);
//        ps.setString(2,"令狐冲");
        //删除一条数据
//        ps = connection.prepareStatement("delete from student where name = ?");
//        ps.setString(1,"令狐冲");
        //修改数据
        ps = connection.prepareStatement("update student set name = ? , age= ? where id = ?");
        ps.setString(1,"令狐冲");
        ps.setInt(2,22);
        ps.setInt(3,1);
        //执行
        int i = ps.executeUpdate();
        System.out.println("受影响的行数"+i);

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
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

}
