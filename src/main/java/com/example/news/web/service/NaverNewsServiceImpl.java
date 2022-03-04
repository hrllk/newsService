package com.example.news.web.service;

import com.example.news.web.model.NaverNews;
import com.example.news.web.model.News;
import com.example.news.web.model.NewsExample;
import com.example.news.web.persistence.NewsMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NaverNewsServiceImpl implements NaverNewsService{

    @Override
    public NaverNews getNaverNews(String keyword) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("X-Naver-Client-Id", "qXPada7nrmo0GeQ1aio9");
            httpHeaders.add("X-Naver-Client-Secret", "zT2QlFbooc");

//            String url = String.format("https://naveropenapi.apigw.ntruss.com/map-reversegeocode/v2/gc?request=coordsToaddr&sourcecrs=epsg:4326&output=json&orders=legalcode,admcode,addr,roadaddr&coords=%s,%s", longVal, latVal);
//            String url = "https://openapi.naver.com/v1/search/news.xml?query=%EC%A3%BC%EC%8B%9D&display=10&start=1&sort=sim";
//            String url = "https://openapi.naver.com/v1/search/news.xml?query=" + keyword + "&display=10&start=1&sort=sim";
            String url = "https://openapi.naver.com/v1/search/news.json?query=" + keyword + "&display=10&start=1&sort=sim";
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity(httpHeaders), String.class);
            if (response != null && response.getStatusCode() == HttpStatus.OK) {
                ObjectMapper om = new ObjectMapper();
                om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                return om.readValue(response.getBody(), NaverNews.class);
            }

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
