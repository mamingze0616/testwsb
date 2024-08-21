package com.apex.bss.service;

import com.apex.bss.config.JdbcConfig;

import java.sql.*;

import static com.apex.bss.config.JdbcConfig.*;

public class RegisterService {

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
