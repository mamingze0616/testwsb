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
        <div id="paiban">
            <div id="imgDiv"></div>
            <span style="padding-left: 20px;color: white">南方基金</span>
        </div>
        <div id="paibann">
            <div id="imgDi"></div>
            <div id="right" style="color: white;font-size: 20px;">${userInfo["username"]}</div>
        </div>


    </div>
    <div id="center">
        <form class="registerForm" action="doRegister" method="post">
            <div id="middle">
                <input type="text" sex="sex" placeholder="sex" value=${userInfo["sex"]}>
                welcome <%=request.getParameter("uname")%> <br/>
                your email is ${userInfo["email"]}<br/>
                your sex is ${userInfo["sex"]}<br/>
                your nationality is ${userInfo["nationality"]}<br/>
                your phonenumber is ${userInfo["phonenumber"]}<br/>
            </div>
        </form>
    </div>
    <div id="down">
        <span class="inf_text">版本信息管理信息系统2008 v2.0</span>
    </div>
</div>
</body>
</html>