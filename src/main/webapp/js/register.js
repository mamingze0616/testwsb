$(function () {
    const register_yz = () => {
        var uname = $('#uname').val();
        if (uname == null) {
            alert("用户名不能为空");
            return false;
        }
        var phonenumber = $('#phonenumber').val();
        if (phonenumber == null) {
            alert("手机号不能为空");
            return false;
        }
        var email = $('#email').val();
        if (email == null) {
        alert("邮箱不能为空");
        return false;
        }
        var upwd = $('#upwd').val();
        if (upwd == null) {
            alert("密码不能为空");
            return false;
        }
        var querenmima = $('#querenmima').val();
        if (querenmima == null) {
            alert("确认密码不能为空");
            return false;
        }

}

})
;


