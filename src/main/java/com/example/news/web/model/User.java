package com.example.news.web.model;

import java.io.Serializable;

public class User implements Serializable {
    private Long userId;

    private String id;

    private String name;

    private String password;

    private Byte isUseNaver;

    private Byte isUseDaum;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getIsUseNaver() {
        return isUseNaver;
    }

    public void setIsUseNaver(Byte isUseNaver) {
        this.isUseNaver = isUseNaver;
    }

    public Byte getIsUseDaum() {
        return isUseDaum;
    }

    public void setIsUseDaum(Byte isUseDaum) {
        this.isUseDaum = isUseDaum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", isUseNaver=").append(isUseNaver);
        sb.append(", isUseDaum=").append(isUseDaum);
        sb.append("]");
        return sb.toString();
    }
}