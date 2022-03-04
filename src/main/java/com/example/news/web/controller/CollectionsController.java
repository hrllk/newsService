package com.example.news.web.controller;

import com.example.news.web.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@Controller
public class CollectionsController {

@Autowired
   NewsService newsService;

   @GetMapping("/collections")
   public String getCollectionsListPage(Model model, HttpSession session){

//      long userId = (long) session.getAttribute("user_id");
      int userId = ((Long) session.getAttribute("user_id")).intValue();
      model.addAttribute("userId", userId);
      return "news/list";
   }
   @GetMapping("/news/detail/{newsId}")
   public String getCollectionsDetailPage(Model model, HttpSession session, @PathVariable("newsId") int newsId){

//      long userId = (long) session.getAttribute("user_id");
//      int userId = ((Long) session.getAttribute("user_id")).intValue();
//      model.addAttribute("userId", userId);

      model.addAttribute("news",newsService.getNewsByNewsId(newsId));
      return "news/detail";
   }

}
