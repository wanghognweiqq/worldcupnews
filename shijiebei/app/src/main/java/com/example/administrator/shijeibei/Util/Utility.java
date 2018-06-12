package com.example.administrator.shijeibei.Util;

import android.text.TextUtils;

import com.example.administrator.shijeibei.Entity.Time;
import com.example.administrator.shijeibei.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2018/6/12.
 */

public class Utility {

    public static boolean handleTimeResponse (String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray AllTime = new JSONArray(response);
                for (int i = 0; i < AllTime.length(); i++) {
                    JSONObject TimeObject = AllTime.getJSONObject(i);
                    Time time = new Time();
                    time.setTime(TimeObject.getString("time"));
                    time.setZhuchang(TimeObject.getString("team1"));
                    time.setKechang(TimeObject.getString("team2"));
                    time.setScore1(TimeObject.getString("score1"));
                    time.setScore2(TimeObject.getString("score2"));
                    time.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static int handleImage(String teamname){
        switch (teamname) {
            case "俄罗斯":
                return R.mipmap.eluosi;
            case "沙特阿拉伯":
                return R.mipmap.shate;
            case "埃及":
                return R.mipmap.aiji;
            case "乌拉圭":
                return R.mipmap.wulagui;
            case "摩洛哥":
                return R.mipmap.moluoge;
            case "伊朗":
                return R.mipmap.yilang;
            case "葡萄牙":
                return R.mipmap.putaoya;
            case "西班牙":
                return R.mipmap.xibanya;
            case "法国":
                return R.mipmap.faguo;
            case "澳大利亚":
                return R.mipmap.aodaliya;
            case "阿根廷":
                return R.mipmap.agenting;
            case "冰岛":
                return R.mipmap.bingdao;
            case "秘鲁":
                return R.mipmap.bilu;
            case "丹麦":
                return R.mipmap.danmai;
            case "克罗地亚":
                return R.mipmap.keluodiya;
            case "尼日利亚":
                return R.mipmap.nirili;
            case "哥斯达黎加":
                return R.mipmap.gesidalijia;
            case "塞尔维亚":
                return R.mipmap.saierweiya;
            case "德国":
                return R.mipmap.deguo;
            case "墨西哥":
                return R.mipmap.moxige;
            case "巴西":
                return R.mipmap.baxi;
            case "瑞士":
                return R.mipmap.ruishi;
            case "瑞典":
                return R.mipmap.ruidian;
            case "韩国":
                return R.mipmap.hanguo;
            case "比利时":
                return R.mipmap.bilishi;
            case "巴拿马":
                return R.mipmap.banama;
            case "突尼斯":
                return R.mipmap.tunisi;
            case "英格兰":
                return R.mipmap.yingelan;
            case "哥伦比亚":
                return R.mipmap.gelunbiya;
            case "日本":
                return R.mipmap.riben;
            case "波兰":
                return R.mipmap.bolan;
            case "塞内加尔":
                return R.mipmap.saineijiaer;
        }
        return 0;
    }
}
