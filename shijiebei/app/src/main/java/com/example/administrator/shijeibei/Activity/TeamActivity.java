package com.example.administrator.shijeibei.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.shijeibei.R;

public class TeamActivity extends AppCompatActivity {
    private TextView teamtitle;
    private TextView teamcontext;
    private ImageView teamimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        teamtitle = findViewById(R.id.teamtitle);
        teamcontext = findViewById(R.id.teamcontext);
        teamimage = findViewById(R.id.teamimage);

        Bundle bundle = getIntent().getExtras();//获取从mainactivity中传过来的对象

        String title = bundle.getString("title");//根据设定的键值获取对应的信息
        String context = bundle.getString("context");
        int imgid = bundle.getInt("imgid");

        teamtitle.setText(title);
        teamcontext.setText(context);
        teamimage.setImageResource(imgid);
    }
}
