package com.example.news.web.service;

import com.example.news.web.model.News;
import com.example.news.web.model.User;

import java.util.List;

public interface NewsService {

    List<News> getNewsListById(long userId);
    News getNewsByNewsId(long newsId);

//    List<News> getNewsFromApi(long userId, String keyword);
    List<News> getNewsFromApi(List<User> userList, String keyword);
}
