package com.apex.bss.controller;

import com.apex.bss.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {

    @RequestMapping("/doRegister")
    public String doRegister(String uname, int sex, int nationality,
                             String birthdate, String phonenumber, String email,
                             String upwd, HttpServletRequest request) {
        RegisterService registerService = new RegisterService();
        //根据uname查询users表，如果存在，则提示用户名已存在，否则插入
        if (registerService.queryByUserName(uname)) {
            request.setAttribute("error", "user exited");
            return "forward:/register.jsp";

        } else {
            registerService.register(uname, sex, nationality, birthdate, phonenumber, email, upwd);
            return "index";
        }


    }
}
