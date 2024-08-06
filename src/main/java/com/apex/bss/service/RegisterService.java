package com.apex.bss.service;

import java.sql.*;

public class RegisterService {
    String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    String JDBC_USER = "root";
    String JDBC_PASSWORD = "Qwj20050517";


    public int register(String uname, int sex, int nationality, String birthdate, String phonenumber, String email, String upwd) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            // TODO: 访问数据库...

            try (Statement stmt = conn.createStatement()) {
                String sql = "insert into users(username,sex,nationality,birthdate,phonenumber,email,upwd) " +
                        "values('"+uname+"',"+sex+","+nationality+",'"+birthdate+"',"+phonenumber+",'"+email+"','"+upwd+"')";
                return stmt.executeUpdate(sql);



            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean queryByUserName(String uname) {
        //判断用户是否存在
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (Statement stmt = conn.createStatement()) {
                String sql = "select * from users where username = '"+uname+"'";
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    if(rs.next()==true){
                        System.out.println("uer exits");
                        return true;
                    }
                }
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
