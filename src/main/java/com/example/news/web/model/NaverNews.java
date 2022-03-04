package com.example.news.web.model;

import java.util.Date;
import java.util.List;

public class NaverNews {

    public Date lastBuildDate;
    public long total;
    public int start;
    public int display;
    public List<Items> items;

    public Date getLastBuildDate() {
        return lastBuildDate;
    }

    public long getTotal() {
        return total;
    }

    public int getStart() {
        return start;
    }

    public int getDisplay() {
        return display;
    }

    public List<Items> getItems() {
        return items;
    }

    public static class Items{
        public String title;
        public String originallink;
        public String link;
        public String description;
        public Date pubDate;

        public String getTitle() {
            return title;
        }

        public String getOriginallink() {
            return originallink;
        }

        public String getLink() {
            return link;
        }

        public String getDescription() {
            return description;
        }

        public Date getPubDate() {
            return pubDate;
        }
    }

}
