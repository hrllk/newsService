package com.example.news.web.model;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable {
    private Long newsId;

    private Long userId;

    private Byte providerCode;

    private String provider;

    private String link;

    private String originallink;

    private String subject;

    private Date collectionTime;

    private Date pubAt;

    private String contents;

    private static final long serialVersionUID = 1L;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(Byte providerCode) {
        this.providerCode = providerCode;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getOriginallink() {
        return originallink;
    }

    public void setOriginallink(String originallink) {
        this.originallink = originallink;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    public Date getPubAt() {
        return pubAt;
    }

    public void setPubAt(Date pubAt) {
        this.pubAt = pubAt;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", newsId=").append(newsId);
        sb.append(", userId=").append(userId);
        sb.append(", providerCode=").append(providerCode);
        sb.append(", provider=").append(provider);
        sb.append(", link=").append(link);
        sb.append(", originallink=").append(originallink);
        sb.append(", subject=").append(subject);
        sb.append(", collectionTime=").append(collectionTime);
        sb.append(", pubAt=").append(pubAt);
        sb.append(", contents=").append(contents);
        sb.append("]");
        return sb.toString();
    }
}