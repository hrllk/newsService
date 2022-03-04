package com.example.news.web.persistence;

import com.example.news.web.model.CollectionKeyword;
import com.example.news.web.model.CollectionKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CollectionKeywordMapper {
    long countByExample(CollectionKeywordExample example);

    int deleteByExample(CollectionKeywordExample example);

    int deleteByPrimaryKey(Long collectionKeywordId);

    int insert(CollectionKeyword record);

    int insertSelective(CollectionKeyword record);

    List<CollectionKeyword> selectByExample(CollectionKeywordExample example);

    CollectionKeyword selectByPrimaryKey(Long collectionKeywordId);

    int updateByExampleSelective(@Param("record") CollectionKeyword record, @Param("example") CollectionKeywordExample example);

    int updateByExample(@Param("record") CollectionKeyword record, @Param("example") CollectionKeywordExample example);

    int updateByPrimaryKeySelective(CollectionKeyword record);

    int updateByPrimaryKey(CollectionKeyword record);
}