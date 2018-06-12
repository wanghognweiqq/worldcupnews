package com.example.administrator.shijeibei.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.administrator.shijeibei.Entity.Article;
import com.example.administrator.shijeibei.R;

import java.util.List;

/**
 * Created by Administrator on 2018/6/7 0007.
 */

public class ArticleAdapter extends BaseAdapter {
    private Context mContext;
    private int mLayout;
    private List<Article> mDatas;

    public ArticleAdapter(Context mContext, int mLayout, List<Article> mDatas) {
        this.mContext = mContext;
        this.mLayout = mLayout;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView=inflater.inflate(mLayout,null);
        TextView tvTitle=convertView.findViewById(R.id.tv_title);
        TextView tvUri=convertView.findViewById(R.id.tv_uri);
        TextView tvTime=convertView.findViewById(R.id.tv_time);
        Article article=mDatas.get(position);
        tvTitle.setText(article.getTitle());
        tvUri.setText(article.getUri());
        tvTime.setText(article.getTime());


        return convertView;
    }
}
