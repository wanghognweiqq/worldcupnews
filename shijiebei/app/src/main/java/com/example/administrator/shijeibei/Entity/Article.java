package com.example.administrator.shijeibei.Entity;

/**
 * Created by Administrator on 2018/6/6 0006.
 */

public class Article {
    private String title;
    private String uri;
    private String time;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", uri='" + uri + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
