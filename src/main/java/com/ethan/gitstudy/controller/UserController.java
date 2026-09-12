package com.ethan.gitstudy.controller;


//@RestController
public class UserController {

    public String login(String username, String password) {
        return "登录成功！";
    }

    public String query() {
        return "查询成功！";
    }

    public String register(String username, String password){
        return "注册成功！";
    }

    public String delete(String username, String password){
        return "删除成功！";
    }
}
