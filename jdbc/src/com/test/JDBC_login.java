package com.test;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JDBC_login {
    public static void main(String[] args) {
        Map<String, String> map = initUi();
        selectSql(map);
    }

    private static void selectSql(Map<String, String> map) {
        //资源绑定器
        ResourceBundle bundle=ResourceBundle.getBundle("resources/db");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        //连接对象
        Connection connection=null;
        //执行对象
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        String username = map.get("username");
        String psd = map.get("password");
        System.out.println(username);
        System.out.println(psd);
        try {
            Class.forName(driver);
            connection= DriverManager.getConnection(url,user,password);
            statement = connection.prepareStatement("select * from log_in where username= ? and password =?");
            statement.setString(1,username);
            statement.setString(2,psd);
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }
//            System.out.println(resultSet.next());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (statement!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (resultSet!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static Map<String,String> initUi() {
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        map.put("username", username);
        map.put("password", password);
        return map;
    }}
