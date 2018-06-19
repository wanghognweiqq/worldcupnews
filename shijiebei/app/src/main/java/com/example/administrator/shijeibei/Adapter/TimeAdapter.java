package com.example.administrator.shijeibei.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.shijeibei.Entity.Time;
import com.example.administrator.shijeibei.R;
import com.example.administrator.shijeibei.Util.Utility;

import java.util.List;

/**
 * Created by Administrator on 2018/6/7.
 */

public class TimeAdapter extends ArrayAdapter<Time> {
    private int resourceId;
    public TimeAdapter(Context context, int resourceId, List<Time> times){
        super(context,resourceId,times);
        this.resourceId = resourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Time time = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView tvtime = view.findViewById(R.id.tv_time);
        TextView tvname1 = view.findViewById(R.id.tv_name1);
        TextView tvname2 = view.findViewById(R.id.tv_name2);
        TextView tvscore1 = view.findViewById(R.id.tv_score1);
        TextView tvscore2 = view.findViewById(R.id.tv_score2);
        ImageView ivimage1 = view.findViewById(R.id.iv_image1);
        ImageView ivimage2 = view.findViewById(R.id.iv_image2);
        tvtime.setText(time.getTime());
        tvname1.setText(time.getZhuchang());
        tvname2.setText(time.getKechang());
        tvscore1.setText(time.getScore1());
        tvscore2.setText(time.getScore2());
        ivimage1.setImageResource(Utility.handleImage(time.getZhuchang()));
        ivimage2.setImageResource(Utility.handleImage(time.getKechang()));
        return view;
    }


}
