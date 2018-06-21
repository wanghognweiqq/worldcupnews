package com.example.administrator.shijeibei.Util;

import android.util.Log;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/6/8.
 */

public class OkHttpUtil {

    public static void sendOkHttpRequest (String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new  Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

    public static void sendOkHttpRequest (String address, FormBody body, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).post(body).build();
        client.newCall(request).enqueue(callback);
    }
}
