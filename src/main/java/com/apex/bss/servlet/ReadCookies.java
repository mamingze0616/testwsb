package com.apex.bss.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Random;

public class ReadCookies extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = null;
        Random random = new Random();
        Cookie cookie2 = new Cookie("testcCoName", "123456"+ random.nextInt());
        System.out.println("cookie2 value:"+cookie2.getValue());
        response.addCookie(cookie2);
        Cookie[] cookies = null;
        // 获取与该域相关的 Cookie 的数组
        cookies = request.getCookies();
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String title = "Delete Cookie Example";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n");
        if (cookies != null) {
            out.println("<h2>Cookie 名称和值</h2>");
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                if (cookie.getName() != null && cookie.getName().equals("JSESSIONID")) {
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);

                    out.print("准备删除的 cookie：" +
                            cookie.getName() + "<br/>");
                }
                out.print("名称：" + cookie.getName() + "，");
                out.print("值：" + URLDecoder.decode(cookie.getValue(), "utf-8") + " <br/>");
            }
        } else {
            out.println(
                    "<h2 class=\"tutheader\">No Cookie founds</h2>");
        }



        out.println("</body>");
        out.println("</html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
