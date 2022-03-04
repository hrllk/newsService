package com.example.news.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class KeywordController {


   @GetMapping("/keywords")
   public String getKeywordListPage(Model model, HttpSession session){

//      long userId = (long) session.getAttribute("user_id");
      int userId = ((Long) session.getAttribute("user_id")).intValue();
      model.addAttribute("userId", userId);
      return "keyword/list";
   }

   @GetMapping("/keywords/register")
   public String getKeywordDetailPage(Model model, HttpSession session){

//      long userId = (long) session.getAttribute("user_id");
      int userId = ((Long) session.getAttribute("user_id")).intValue();
      model.addAttribute("userId", userId);
      return "keyword/detail";
   }
}
