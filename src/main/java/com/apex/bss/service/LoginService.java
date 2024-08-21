package com.apex.bss.service;

import com.apex.bss.bean.UserInfo;
import com.apex.bss.config.JdbcConfig;
import org.springframework.stereotype.Service;

import java.sql.*;

@Service
public class LoginService {
    public boolean login(String username, String upwd) {
        String sql = "SELECT username, upwd FROM users WHERE username = '" + username + "'";
        try (Connection conn = DriverManager.getConnection(JdbcConfig.JDBC_URL, JdbcConfig.JDBC_USER, JdbcConfig.JDBC_PASSWORD)) {
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    String dbUpwd = rs.getString("upwd");
                    if (dbUpwd.equals(upwd)) {
                        return true; // 登录成功
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false; // 登录失败
    }

    public boolean queryUserByUserName(String uname) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (Connection conn = DriverManager.getConnection(JdbcConfig.JDBC_URL, JdbcConfig.JDBC_USER, JdbcConfig.JDBC_PASSWORD)) {
            try (Statement stmt = conn.createStatement()) {
                String sql = "select count(*) AS NUM from users where username = '" + uname + "'";

                System.out.println(sql);
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    System.out.println("welcome");
                    if (rs.next()) {
                        int num = rs.getInt(1); // 注意：索引从1开始
                        if (num == 0) {
                            System.out.println("用户名不存在");
                            return false;
                        } else {
                            System.out.println("用户名存在");
                            sql = "select username, upwd from users where username = '" + uname + "'";
                            System.out.println(sql);
                            return true;
                        }
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return false;
    }

    public UserInfo queryUserInfoByUserName(String uname)
    {
        UserInfo userInfo = new UserInfo();
        String sql = "select username,email,sex,phonenumber,nationality from users where username = '" + uname + "'";
        try (Connection conn = DriverManager.getConnection(JdbcConfig.JDBC_URL, JdbcConfig.JDBC_USER, JdbcConfig.JDBC_PASSWORD)) {
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    userInfo.setUsername(rs.getString("username"));
                    userInfo.setEmail(rs.getString("email"));
                    userInfo.setSex(rs.getInt("sex"));
                    userInfo.setPhonenumber(rs.getInt("phonenumber"));
                    userInfo.setNationality(rs.getInt("nationality"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userInfo;
    }
}





