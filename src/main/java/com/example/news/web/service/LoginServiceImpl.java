package com.example.news.web.service;

import com.example.news.web.model.User;
import com.example.news.web.model.UserExample;
import com.example.news.web.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user) {

        UserExample example = new UserExample();
        example.createCriteria()
                .andIdEqualTo(user.getId())
                .andPasswordEqualTo(user.getPassword());

//        User loginedUser = userMapper.selectByExample(example).get(0);

        return userMapper.selectByExample(example).get(0);

    }

    @Override
    public int signup(User user) {
        return userMapper.insertSelective(user);
    }
}
