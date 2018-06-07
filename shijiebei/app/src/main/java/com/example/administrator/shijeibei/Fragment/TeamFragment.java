package com.example.administrator.shijeibei.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.shijeibei.Activity.TeamA1Activity;
import com.example.administrator.shijeibei.R;

/**
 * Created by Administrator on 2018/6/6.
 */

public class TeamFragment extends Fragment {
    private Context mContext;
    private Button a1;
    private Button a2;
    private Button a3;
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_team,container,false);

        getViews(view);
        OnClickListenerImpl listener=new OnClickListenerImpl();
        a1.setOnClickListener(listener);
        a2.setOnClickListener(listener);
        a3.setOnClickListener(listener);


        return view;
    }
    private class OnClickListenerImpl implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.a1:
                    Intent intent1=new Intent();
                    intent1.setClass(mContext, TeamA1Activity.class);
                    startActivity(intent1);
                    break;
                case R.id.a2:
                    Intent intent2=new Intent();
                    intent2.setClass(mContext, TeamA1Activity.class);
                    startActivity(intent2);
                    break;
                case R.id.a3:
                    Intent intent3=new Intent();
                    intent3.setClass(mContext, TeamA1Activity.class);
                    startActivity(intent3);
                    break;
            }

        }
    }

    private void getViews(View view) {
        a1=view.findViewById(R.id.a1);
        a2=view.findViewById(R.id.a2);
        a3=view.findViewById(R.id.a3);
//        ivPhoto = view.findViewById(R.id.iv_photo);
    }

    @Override
    public void onAttach(Context context) {
        this.mContext=context;
        super.onAttach(context);
    }

}
