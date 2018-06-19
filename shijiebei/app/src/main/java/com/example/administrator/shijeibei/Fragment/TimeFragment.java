package com.example.administrator.shijeibei.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.shijeibei.Adapter.TimeAdapter;
import com.example.administrator.shijeibei.Entity.Time;
import com.example.administrator.shijeibei.Layout.RefreshableView;
import com.example.administrator.shijeibei.R;
import com.example.administrator.shijeibei.Util.OkHttpUtil;
import com.example.administrator.shijeibei.Util.Utility;

import org.litepal.crud.DataSupport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/6/6.
 */

public class TimeFragment extends Fragment {
    private Context context;
    private ListView lvtime;
    private TimeAdapter timeAdapter;
    private List<Time> times;
    private List<Time> alltime = new ArrayList<>();
    private RefreshableView refreshableView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.time,container,false);
        lvtime = view.findViewById(R.id.lv_time);
        refreshableView = view.findViewById(R.id.rv_time);
        timeAdapter = new TimeAdapter(context, R.layout.time_item,alltime);
        queryTime();
        lvtime.setAdapter(timeAdapter);
        refreshableView.setOnRefreshListener(new RefreshableView.PullToRefreshListener() {
            @Override
            public void onRefresh() {
                queryFromServer();
                refreshableView.finishRefreshing();
            }
        },0);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public void queryTime () {
        times = DataSupport.findAll(Time.class);
        if (times.size() > 0) {
            alltime.clear();
            for (Time time : times) {
                alltime.add(time);
                timeAdapter.notifyDataSetChanged();
                lvtime.setSelection(0);
            }
        }else {
            queryFromServer();
        }
    }

    public void queryFromServer () {
        String address = "http://10.7.85.227:8080/WorldCupNews_Server/selecttime.action";
        OkHttpUtil.sendOkHttpRequest(address, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responsetext = response.body().string();
                Boolean result = false;
                result = Utility.handleTimeResponse(responsetext);
                if (result) {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            queryTime();
                        }
                    });
                }
            }
        });
    }
}
