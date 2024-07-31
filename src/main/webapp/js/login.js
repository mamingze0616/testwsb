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