$(document).ready(function(){
    $("#login_btn").click(()=>{
        // alert("点击登录");
        var uname = $('#uname').val();
        if (uname == null) {
            alert("用户名不能为空");
            return false;
        }
        //获取密码
        var upwd = $("#upwd").val();
        if (upwd == null) {
            alert("密码不能为空");
            return false;
        }
    });

    $("#register_btn").click(()=>{
        // alert("点击注册");
        window.location.href="register.jsp";
    });
});
