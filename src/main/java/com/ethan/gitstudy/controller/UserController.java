package com.ethan.gitstudy.controller;


//@RestController
public class UserController {

    public String login(String username, String password) {
        return "登录成功！";
    }

    public String query() {
        return "查询成功！";
    }
}
