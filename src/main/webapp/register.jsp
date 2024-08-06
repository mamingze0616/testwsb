<%--
  Created by IntelliJ IDEA.
  User: wangh
  Date: 2024/8/1
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
    <link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/register.css" rel="stylesheet" type="text/css"/>
    <script src="<%=request.getContextPath()%>/js/jquery/jquery-3.7.1.js"></script>
    <script src="<%=request.getContextPath()%>/js/register.js"></script>
</head>

<body>
<div id="login">
    <div id="top">
        <div id="imgDiv"></div>
        <span style="padding-left: 20px;color: white">南方基金</span>
    </div>
    <div id="center">
        <form class="registerForm" action="doRegister" method="post">
            <div id="middle">
                <div id="middle_left">
                <input type="text" id="uname" name="uname" placeholder="用户名"/>
                    <%--                <input type="text" id="sex" name="sex" placeholder="性别"/>--%>
                <select name="sex" id="sex" placeholder="性别">
                    <option value="1">男</option>
                    <option value="2">女</option>
                </select>
                    <%--                <input type="text" id="nationality" name="nationality" placeholder="国籍"/>--%>
                <select name="nationality" id="nationality" placeholder="国籍">
                    <option value="1">中国</option>
                    <option value="2">美国</option>
                    <option value="3">英国</option>
                    <option value="4">法国</option>
                    <option value="5">德国</option>
                    <option value="6">日本</option>
                    <option value="7">韩国</option>
                    <option value="8">俄罗斯</option>
                    <option value="9">意大利</option>
                </select>
                <input type="date" id="birthdate" name="birthdate" placeholder="出生日期"/>
            </div>
                <div id="middle_right">
                    <input type="text" id="phonenumber" name="phonenumber" placeholder="手机号"/>
                    <input type="email" id="email" name="email" placeholder="邮箱"/>
                    <input type="password" id="upwd" name="upwd" placeholder="密码"/>
                    <input type="password" id="querenmima" name="querenmima" placeholder="确认密码"/>

                </div>
            </div>
            ${requestScope.error}
            <div id="center-middle_bottom">
                <button type="submit" id="login_zhuce">注册</button>
                <button type="reset">清空</button>
            </div>
        </form>


    </div>
    <div id="down">
        <span class="inf_text">版本信息管理信息系统2008 v2.0</span>
    </div>
</div>
</body>
</html>
