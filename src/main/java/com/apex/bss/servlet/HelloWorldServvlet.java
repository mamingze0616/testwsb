package com.apex.bss.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServvlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html");
        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println("<h1>helloworld</h1>");
    }
}
