package com.apex.bss.bean;

public class UserInfo {
    private String username;
    private String email;
    private int sex;
    private int nationality;
    private int phonenumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        if (sex == 1)
        {
            return "男";
        }else {
            return "女";
        }
    }
    private void when(boolean b) {
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNationality() {
        if(nationality == 1)
            return "中国";
        else if (nationality == 2)
            return "美国";

    }

    public void setNationality(int nationality) {
        this.nationality = nationality;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
