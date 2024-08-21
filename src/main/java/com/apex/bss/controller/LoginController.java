package com.apex.bss.controller;

import com.apex.bss.bean.UserInfo;
import com.apex.bss.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@Controller
public class LoginController {
    LoginService loginService = new LoginService();

    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam String uname,
                          @RequestParam String upwd,
                          HttpServletRequest request) {


        try {
            //先判断有没有该用户
            if (loginService.queryUserByUserName(uname)) {
                //判断密码是否正确
                if (loginService.login(uname, upwd)) {
                    //返回index
                    //密码正确情况下，获取用户信息
                    UserInfo userInfo = loginService.queryUserInfoByUserName(uname);
                    request.setAttribute("email", userInfo.getEmail());
                    request.setAttribute("userInfo", userInfo);
                    return "index";
                } else {
                    //返回error password error
//              request.setAttribute("");
//                    return login
                    return "forward:/login.jsp";
                }


            } else {
                //返回error user not exits
//              request.setAttribute("");
                return "forward:/login.jsp";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


//        return "index";

    }
}
