package com.apex.bss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;

@Controller
public class LoginController {

    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam String uname, @RequestParam String upwd, HttpServletRequest request) {
        // JDBC连接的URL, 不同数据库有不同的格式:
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "Qwj20050517";
        // 获取连接:
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            // TODO: 访问数据库...
            try (Statement stmt = conn.createStatement()) {
                String sql = "select * from users where username = '"+uname+"'";
                System.out.println(sql);
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    System.out.println("welcome");
                    if(rs.next()==false){
                        System.out.println("uer not exits");
                        request.setAttribute("error", "user not exits");
                        return "forward:/login.jsp";
                    }
                    while (rs.next()) {

                        long id = rs.getLong(1); // 注意：索引从1开始
                        String username = rs.getString(2);
                        String email = rs.getString(3);
                        System.out.println("welcome id:"+id + ", username:" + username + " to our system!, your email is " + email);
                        request.setAttribute("email", email);

                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return "index";

    }
}
