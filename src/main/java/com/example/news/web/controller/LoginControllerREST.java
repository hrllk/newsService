package com.example.news.web.controller;

import com.example.news.web.model.User;
import com.example.news.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/rest/v1/auth")
public class LoginControllerREST {


    @Autowired
    LoginService loginService;

    @PostMapping("/signup")
    public String signup(User user){

        if (loginService.signup(user) > 0) {
            return "success";
        }
        return "fail";
    }
    @PostMapping("/login")
    public String login(User user, HttpSession session){

        User loginedUser = loginService.login(user);
        if (loginedUser != null){
            session.setAttribute("user_id",loginedUser.getUserId());
            return "success";
        }
        return "fail";
    }
}
