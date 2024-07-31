package com.apex.bss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {

    @RequestMapping("/doLogin.do")
    public String doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("name");
        String url=request.getParameter("url");
        request.setAttribute("myAttr","green");
        System.out.println(name+ " login url:"+url);
        return "index";

    }
}
