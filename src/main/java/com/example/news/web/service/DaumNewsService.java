package com.example.news.web.service;

import com.example.news.web.model.News;

import java.util.List;

public interface DaumNewsService {

    List<News> getDaumNews(String keyword);
}
