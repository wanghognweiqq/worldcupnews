package com.example.administrator.shijeibei.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.administrator.shijeibei.Activity.LoginActivity;
import com.example.administrator.shijeibei.Activity.MainActivity;
import com.example.administrator.shijeibei.Adapter.ArticleAdapter;
import com.example.administrator.shijeibei.Entity.Article;
import com.example.administrator.shijeibei.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/6.
 */

public class HomeFragment extends Fragment {
    private Context context;
    private TextView tvRefresh;
    private ListView lvNew;
    private TextView tvLogin;
    List<Article> articles = new ArrayList<Article>();
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            //处理消息
            switch (msg.what){
                //获取消息内容  msg.arg1   msg.arg2   msg.getData()
                case 1:
//                for(int i=0;i<articles.size();i++){
//                    Log.i("whw"+i,articles.get(i).toString());
//                    }
                    Log.i("whh","消息获取成功");
                    ArticleAdapter articleAdapter=new ArticleAdapter(context, R.layout.activity_jsoup_item,articles);
                    lvNew.setAdapter(articleAdapter);
                    lvNew.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            String strUri= (String) ((TextView)view.findViewById(R.id.tv_uri)).getText();
                            Uri uri=Uri.parse(strUri);  //字符串转化为uri
                            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                        }
                    });

                    break;


            }
            super.handleMessage(msg);
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shouye_layout,container,false);
        lvNew=view.findViewById(R.id.lv_new);
        Thread thread= new DownloadThread();
        thread.start();

        tvRefresh=view.findViewById(R.id.tv_refresh);
        tvRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh();
            }
        });

        tvLogin=view.findViewById(R.id.tv_login);
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, LoginActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }


    class DownloadThread extends Thread{
        @Override
        public void run() {
//                List<Article> articles = new ArrayList<Article>();
            try {
                for(int i=1;i<=1;i++) {
                    Document doc = Jsoup.connect("https://voice.hupu.com/soccer/" + Integer.toString(i)).get();
                    Elements titleLinks = doc.select("div.list-hd");
                    Elements timeLinks = doc.select("div.otherInfo");
                    Document doc1 = Jsoup.connect(titleLinks.get(i).select("a").attr("href")).get();
                    Elements imgLinks = doc1.select("div.artical-importantPic");
                    for (int j = 0; j < titleLinks.size(); j++) {
                        String title = titleLinks.get(j).select("a").text();
                        String uri = titleLinks.get(j).select("a").attr("href");
                        String time = timeLinks.get(j).select("span.other-left").select("a").text();
                        Article article = new Article();
                        article.setTitle(title);
                        article.setUri(uri);
                        article.setTime(time);
                        articles.add(article);
                    }
                }
                Message msg=Message.obtain();
                msg.what = 1;
                handler.sendMessage(msg);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void refresh() {
//        finish();
        Intent intent=new Intent(context,MainActivity.class);
        startActivity(intent);

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
