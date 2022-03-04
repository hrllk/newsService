package com.example.news.web.service;

import com.example.news.web.model.User;

import javax.servlet.http.HttpSession;

public interface LoginService {

    int signup(User user);
    User login(User user);
}
