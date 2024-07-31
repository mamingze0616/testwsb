package com.apex.bss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Controller
public class LoginController {

    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam String uname, @RequestParam String upwd) throws SQLException, ClassNotFoundException {
        // JDBC连接的URL, 不同数据库有不同的格式:
        Class.forName("com.mysql.jdbc.Driver");
        String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "Qwj20050517";
        // 获取连接:
        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        // TODO: 访问数据库...
        System.out.println("conn success!");
        // 关闭连接:
        conn.close();
        return "index";

    }
}
