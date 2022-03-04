package com.example.news.web.schedule;

import com.example.news.web.model.User;
import com.example.news.web.model.UserExample;
import com.example.news.web.persistence.UserMapper;
import com.example.news.web.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Schedule {

    @Autowired
    UserMapper userMapper;

    @Autowired
    NewsService newsService;

    @Scheduled(fixedDelay = 1000 * 60 * 60)
    public void updateNewsBatch() {


        List<User> userList = userMapper.selectByExample(new UserExample());
        newsService.getNewsFromApi(userList, null);
        System.out.println("hi :)");
    }

}
