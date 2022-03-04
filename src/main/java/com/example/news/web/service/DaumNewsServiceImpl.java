package com.example.news.web.service;

import com.example.news.web.model.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaumNewsServiceImpl implements DaumNewsService{
    @Override
    public List<News> getDaumNews(String keyword) {
        return null;
    }
}
