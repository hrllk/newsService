package com.example.news.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {



    @GetMapping("/")
    public String loginPage(){
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String getLoginPage() {
//        System.out.println("this is loginController");
        System.out.println("login controller");
        return "login";
    }
    @GetMapping("/signup")
    public String getSignupPage() {
        return "signup";
    }

}
