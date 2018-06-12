package com.example.administrator.shijeibei.Entity;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/7.
 */

public class Time extends DataSupport {
    private String time;
    private String zhuchang;
    private String kechang;
    private String score1;
    private String score2;
    private int image1;
    private int image2;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getZhuchang() {
        return zhuchang;
    }

    public void setZhuchang(String zhuchang) {
        this.zhuchang = zhuchang;
    }

    public String getKechang() {
        return kechang;
    }

    public void setKechang(String kechang) {
        this.kechang = kechang;
    }

    public String getScore1() {
        return score1;
    }

    public void setScore1(String score1) {
        this.score1 = score1;
    }

    public String getScore2() {
        return score2;
    }

    public void setScore2(String score2) {
        this.score2 = score2;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}
