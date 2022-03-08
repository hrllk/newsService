package com.example.news.web.service;

import com.example.news.web.model.*;
import com.example.news.web.persistence.CollectionKeywordMapper;
import com.example.news.web.persistence.NewsMapper;
import com.example.news.web.persistence.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    Logger logger = LoggerFactory.getLogger(NewsServiceImpl.class);

    @Autowired
    NewsMapper newsMapper;

    @Autowired
    NaverNewsService naverNewsService;

    @Autowired
    DaumNewsService daumNewsService;

    @Autowired
    UserMapper userMapper;

    @Autowired
    CollectionKeywordMapper collectionKeywordMapper;

    @Override
    public List<News> getNewsListById(long userId) {

        NewsExample example = new NewsExample();
        example.createCriteria()
                .andUserIdEqualTo(userId);
        example.setOrderByClause("news_id");
//        example.order
        return newsMapper.selectByExample(example);
    }

    @Override
    public News getNewsByNewsId(long newsId) {
        return newsMapper.selectByPrimaryKey(newsId);
//        return null;
    }

    @Override
//    public List<News> getNewsFromApi(long userId, String keyword) {
    public List<News> getNewsFromApi(List<User> userList, String keyword) {

        /*
         * - 배치에의한,
         * - 키워드등록에의한, (최초1회)
         *
         * */
        logger.debug("userList: [{}]", userList);
        logger.debug("keyword: [{}]", keyword);

        for (User user : userList) {
            // 키워드등록에의한경우,
            if (keyword != null) {
//                User user = userMapper.selectByPrimaryKey(userId);

                if (user.getIsUseNaver() > 0) {

                    NaverNews naverNews = naverNewsService.getNaverNews(keyword);
                    List<NaverNews.Items> items = naverNews.items;
                    for (int i = 0; i < items.size(); i++) {
                        /* 사용자가 소지하고있는 뉴스 중복 체크 */
                        NaverNews.Items item = items.get(i);
                        String title = item.getTitle();

                        NewsExample nExample = new NewsExample();
                        nExample.createCriteria()
                                .andUserIdEqualTo(user.getUserId())
                                .andProviderCodeEqualTo((byte) 1) // 네이버
                                .andSubjectEqualTo(title);
                        if (newsMapper.countByExample(nExample) < 1) {

                            News news = new News();
                            news.setUserId(user.getUserId());
                            news.setSubject(title);
                            news.setProvider("NAVER");
                            news.setProviderCode((byte) 1);
                            news.setLink(item.getLink());
                            news.setOriginallink(item.getOriginallink());
                            news.setPubAt(item.getPubDate());
                            news.setContents(item.getDescription());
                            newsMapper.insertSelective(news);
                        }
                    }
                }

                if (user.getIsUseDaum() > 0) {

                }

                // 사용자의 뉴스설정값 check

            // 배치에의한경우,
            } else {
                CollectionKeywordExample cExample = new CollectionKeywordExample();
                cExample.createCriteria()
                        .andUserIdEqualTo(user.getUserId());
                List<CollectionKeyword> keywordList = collectionKeywordMapper.selectByExample(cExample);
                logger.debug("userId: [{}] \t keywordList: [{}]", user.getUserId(), keywordList);
                for (CollectionKeyword registeredKeyword : keywordList) {
                    if (user.getIsUseNaver() > 0) {

                        NaverNews naverNews = naverNewsService.getNaverNews(registeredKeyword.getKeyword());
                        logger.debug("resNaverItem: [{}]", naverNews);
                        List<NaverNews.Items> items = naverNews.items;
                        for (int i = 0; i < items.size(); i++) {
                            /* 사용자가 소지하고있는 뉴스 중복 체크 */
                            NaverNews.Items item = items.get(i);
                            String title = item.getTitle();

                            NewsExample nExample = new NewsExample();
                            nExample.createCriteria()
                                    .andUserIdEqualTo(user.getUserId())
                                    .andProviderCodeEqualTo((byte) 1) // 네이버
                                    .andSubjectEqualTo(title);
                            if (newsMapper.countByExample(nExample) < 1) {

                                News news = new News();
                                news.setUserId(user.getUserId());
                                news.setSubject(title);
                                news.setProvider("NAVER");
                                news.setProviderCode((byte) 1);
                                news.setLink(item.getLink());
                                news.setOriginallink(item.getOriginallink());
                                news.setPubAt(item.getPubDate());
                                news.setContents(item.getDescription());
                                newsMapper.insertSelective(news);
                            }
                        }
                    }

                    if (user.getIsUseDaum() > 0) {

                    }

                }
            }
        }
        return null;
    }
}
