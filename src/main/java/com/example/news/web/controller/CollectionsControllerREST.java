package com.example.news.web.controller;

import com.example.news.web.service.NewsService;
import com.infinigru.gruvoice.web.model.DataTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/v1/")
public class CollectionsControllerREST {


   @Autowired
   NewsService newsService;

   @GetMapping("/news/{userId}")
   public DataTable getNewsByUserId(@PathVariable("userId") long userId) {

      DataTable dataTable = new DataTable();
      dataTable.setData(newsService.getNewsListById(userId));
      return dataTable;

   }
}
