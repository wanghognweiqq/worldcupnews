package com.example.administrator.shijeibei.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.shijeibei.Adapter.TimeAdapter;
import com.example.administrator.shijeibei.Entity.Time;
import com.example.administrator.shijeibei.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/6.
 */

public class TimeFragment extends Fragment {
    private Context context;
    private ListView lvtime;
    private TimeAdapter timeAdapter;
    private List<Time> times;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.time,container,false);
        lvtime = view.findViewById(R.id.lv_time);
        times = getdata();
        timeAdapter = new TimeAdapter(context, R.layout.time_item,times);
        lvtime.setAdapter(timeAdapter);
        return view;
    }
    private List<Time> getdata(){
        List<Time> times = new ArrayList<>();
        Time time = new Time();
        time.setTime("2018.6.6 23:00");
        time.setZhuchang("俄罗斯");
        time.setKechang("英国");
        time.setScore1(0);
        time.setScore2(0);
        time.setImage1(R.mipmap.tab_home);
        time.setImage2(R.mipmap.tab_home_selected);
        times.add(time);

        Time time1 = new Time();
        time1.setTime("2018.6.6 23:00");
        time1.setZhuchang("俄罗斯");
        time1.setKechang("英国");
        time1.setScore1(0);
        time1.setScore2(0);
        time1.setImage1(R.mipmap.tab_home);
        time1.setImage2(R.mipmap.tab_home_selected);
        times.add(time1);
        return times;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
