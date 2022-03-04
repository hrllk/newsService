package com.example.news.web.model;

import java.io.Serializable;
import java.util.Date;

public class CollectionKeyword implements Serializable {
    private Long collectionKeywordId;

    private Long userId;

    private String keyword;

    private Date createdAt;

    private static final long serialVersionUID = 1L;

    public Long getCollectionKeywordId() {
        return collectionKeywordId;
    }

    public void setCollectionKeywordId(Long collectionKeywordId) {
        this.collectionKeywordId = collectionKeywordId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collectionKeywordId=").append(collectionKeywordId);
        sb.append(", userId=").append(userId);
        sb.append(", keyword=").append(keyword);
        sb.append(", createdAt=").append(createdAt);
        sb.append("]");
        return sb.toString();
    }
}