<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript">
        var str = "qwertyupasdfghjkzxcvbnmQWERTYUPASDFGHJKLZXCVBNM23456789";

        function login_yz() {
            //验证 用户名 和 密码不能为空
            //获取用户名
            var uname = document.getElementById("uname").value;
            if (uname.length == 0) {
                alert("用户名不能为空");
                return false;
            }
            //获取密码
            var upwd = document.getElementById("upwd").value;
            if (upwd.length == 0) {
                alert("密码不能为空");
                return false;
            }
        }
    </script>
</head>
<body>
<div id="login">
    <div id="top">
        <div id="imgDiv"></div>
        <span style="padding-left: 20px;color: white">南方基金</span>
    </div>
    <div id="center">
        <form id="center_middle" action="doLogin" onsubmit="return login_yz()">
                <div class="userdiv">
                    <img src="images/lock.png"/>
                    <input type="text" id="uname" name="uname"/>
                </div>
                <div class="userdiv">
                    <img src="images/key.png"/>
                    <input type="password" id="upwd" name="upwd"/>
                </div>
                <div id="center-middle_bottom">
                    <button type="submit">登录</button>
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
