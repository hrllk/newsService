package com.example.news.web.service;

import com.example.news.web.model.CollectionKeyword;
import com.example.news.web.model.CollectionKeywordExample;
import com.example.news.web.model.UserExample;
import com.example.news.web.persistence.CollectionKeywordMapper;
import com.example.news.web.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordServiceImpl implements KeywordService{

    @Autowired
    CollectionKeywordMapper collectionKeywordMapper;

    @Autowired
    NewsService newsService;

    @Autowired
    UserMapper userMapper;


    @Override
    public List<CollectionKeyword> getKeywordListById(long userId) {
        CollectionKeywordExample example = new CollectionKeywordExample();
        example.createCriteria()
                .andUserIdEqualTo(userId);
        return collectionKeywordMapper.selectByExample(example);
    }

    @Override
    public int addKeywords(CollectionKeyword collectionKeyword) {

        /* 최초 등록된 키워드는 1번에 한해 바로 수집 처리 되며, 이후에는 지정된 주기별로 수집을 실행, */
        String keywords = collectionKeyword.getKeyword();
        if (keywords != null) {
            if (keywords.contains(",")) {
                String[] keywordArr = keywords.split(",");
                for (String keyword : keywordArr) {
                    if (keyword != null && !keyword.isEmpty()){
                        addKeyword(keyword, collectionKeyword);
                    }
                }
            } else {
                addKeyword(keywords, collectionKeyword);
            }
        }

        return 1;
    }

    public int addKeyword(String keyword, CollectionKeyword collectionKeyword){

        /* 중복체크 */
        CollectionKeywordExample example = new CollectionKeywordExample();
        example.createCriteria()
                .andUserIdEqualTo(collectionKeyword.getUserId())
                .andKeywordEqualTo(keyword);
        if (collectionKeywordMapper.countByExample(example) < 1) {

            /* 적재 & 게시물 가져오기 */
            CollectionKeyword ck = new CollectionKeyword();
            ck = collectionKeyword;
            ck.setKeyword(keyword);
            collectionKeywordMapper.insertSelective(ck);


//            userMapper.selectByPrimaryKey()
            UserExample uEx = new UserExample();
            uEx.createCriteria()
                            .andUserIdEqualTo(collectionKeyword.getUserId());

//            newsService.getNewsFromApi(collectionKeyword.getUserId(), keyword);
            newsService.getNewsFromApi(userMapper.selectByExample(uEx), keyword);
        }

        return 1;
    }
}
