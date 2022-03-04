package com.example.news.web.controller;

import com.example.news.web.model.CollectionKeyword;
import com.example.news.web.persistence.CollectionKeywordMapper;
import com.example.news.web.service.KeywordService;
import com.example.news.web.service.NewsService;
import com.infinigru.gruvoice.web.model.DataTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/v1/")
public class KeywordControllerREST {

    @Autowired
    KeywordService keywordService;

    @GetMapping("/keywords/{userId}")
    public DataTable getKeywordsByUserId(@PathVariable("userId") long userId) {

        DataTable dataTable = new DataTable();
        dataTable.setData(keywordService.getKeywordListById(userId));
        return dataTable;

    }

    @PostMapping("/keywords")
    public int addKeyword(CollectionKeyword keyword) {
        return keywordService.addKeywords(keyword);
    }
}
