$(document).ready(function () {
    $("#login_zhuce").click(() => {
        var uname = $('#uname').val();
        if (uname == null || uname == "") {
            alert("用户名不能为空");
            return false;
        }
        var nationality = $('#nationality').val();
        if (nationality == null || nationality == "") {
            alert("国籍不能为空");
            return false;
        }
        var sex = $('#sex').val();
        if (sex == null || sex == "") {
            alert("性别不能为空");
            return false;
        }
        var birthdate = $('#birthdate').val();
        if (birthdate == null || birthdate == "") {
            alert("日期不能为空");
            return false;
        }
        var phonenumber = $('#phonenumber').val();
        if (phonenumber == null || phonenumber == "") {
            alert("手机号不能为空");
            return false;
        }
        var email = $('#email').val();
        if (email == null || email == "") {
            alert("邮箱不能为空");
            return false;
        }
        var upwd = $('#upwd').val();
        if (upwd == null || upwd == "") {
            alert("密码不能为空");
            return false;
        }
        var querenmima = $('#querenmima').val();
        if (querenmima == null || querenmima == "") {
            alert("确认密码不能为空");
            return false;

        }
        if (upwd != querenmima) {
            alert("两次密码不一致");
            return false;
        }
    });
});
