package com.example.news.web.service;

import com.example.news.web.model.CollectionKeyword;

import java.util.List;

public interface KeywordService {

    List<CollectionKeyword> getKeywordListById(long userId);
    int addKeywords(CollectionKeyword keyword);
}
