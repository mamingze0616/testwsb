package com.apex.bss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("/hello")
//    @ResponseBody
    public String sayHello(HttpServletRequest request) {
        String path =request.getParameter("path");
        if(StringUtils.hasText(path)){
            return path;
        }

        return "hello";
    }
    @RequestMapping("/form")
    public String form(){
        return "form";
    }
    @RequestMapping("/addForm")
    @ResponseBody
    public String addForm(HttpServletRequest request){
        //处理请求
        return "true";
    }
}
