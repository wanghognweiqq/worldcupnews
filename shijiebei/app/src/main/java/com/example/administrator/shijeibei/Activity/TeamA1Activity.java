package com.example.administrator.shijeibei.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.shijeibei.R;

public class TeamA1Activity extends AppCompatActivity {
    private TextView teamtitle;
    private TextView teamcontext;
    private ImageView teamimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_a1);
        teamtitle = findViewById(R.id.teamtitle);
        teamcontext = findViewById(R.id.teamcontext);
        teamimage = findViewById(R.id.teamimage);
        teamtitle.setText("111");
    }
}
