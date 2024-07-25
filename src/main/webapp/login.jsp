<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet" type="text/css"/>
    <%--    <script type="text/javascript">--%>
    <%--        var str = "qwertyupasdfghjkzxcvbnmQWERTYUPASDFGHJKLZXCVBNM23456789";--%>
    <%--        function yz() {--%>
    <%--            //随机出4个0-字符串长度之间的数字 做为下标--%>
    <%--            yzmStr="";--%>
    <%--            for(var i=1;i<=4;i++){--%>
    <%--                yzmStr+=str.substr(Math.round(Math.random()*(str.length-1)),1);--%>
    <%--            }--%>
    <%--            //把验证码赋值到页面--%>
    <%--            document.getElementById("syzm").innerHTML=yzmStr;--%>
    <%--        }--%>

    <%--        function $(id) {--%>
    <%--            return document.getElementById(id);--%>
    <%--        }--%>
    <%--        function login_yz() {--%>
    <%--            //验证 用户名 和 密码不能为空--%>
    <%--            //获取用户名--%>
    <%--            var uname = $("uname").value;--%>
    <%--            if(uname.length==0){--%>
    <%--                alert("用户名不能为空");--%>
    <%--                return false;--%>
    <%--            }--%>
    <%--            //获取密码--%>
    <%--            var upwd = $("upwd").value;--%>
    <%--            if(upwd.length==0){--%>
    <%--                alert("密码不能为空");--%>
    <%--                return false;--%>
    <%--            }--%>

    <%--            //获取验证码:判断和电脑的验证码是否相等--%>
    <%--            //PS：自己实现-输入的验证码不区分大小写-大小写转换--%>
    <%--            var yzm = $("uyzm").value;--%>
    <%--            //yzm.lower();--%>
    <%--            var str1=yzm.toUpperCase();--%>
    <%--            //alert(str1);--%>
    <%--            var str2=yzmStr.toUpperCase();--%>
    <%--            if(str1!=str2){--%>
    <%--                alert("验证码输入错误，请重新输入");--%>
    <%--                //清空输入的验证码--%>
    <%--                $("uyzm").value="";--%>
    <%--                //重新生成验证码--%>
    <%--                yz();--%>
    <%--                return false;--%>
    <%--            }--%>
    <%--        }--%>
    <%--    </script>--%>
</head>
<body>
<div id="login">
    <div id="top">
        <img src="images/logo.png"/>
        <div id="top_center">
            |南方基金
        </div>
    </div>
    <div id="center">
        <div id="center_left"></div>
        <div>
            <%--           <form action="doLogin.jsp" onsubmit="return login_yz()">--%>
            <form id="center_middle" action="doLogin">
                <div class="userdiv">
                    <img src="images/lock.png"/>
                    <input type="text" id="uname" name="textfield"/>
                </div>
                <div class="userdiv">
                    <img src="images/key.png"/>
                    <input type="password" id="upwd" name="textfield2"/>
                </div>
                <div id="center-middle_bottom">
                    <div id="btn">
                        <input type="submit" value="登录">
                        <input type="reset" value="清空">
                    </div>
                </div>

            </form>
        </div>
        <div id="center_right"></div>
    </div>
    <div id="down">
        <form id="down_center">
            <div id="inf">
                <span class="inf_text">版本信息</span> <span class="copyright">管理信息系统
						2008 v2.0</span>
            </div>
        </form>
    </div>
</div>
</body>
</html>
