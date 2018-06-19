package com.example.administrator.shijeibei.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.administrator.shijeibei.Fragment.HomeFragment;
import com.example.administrator.shijeibei.Fragment.TeamFragment;
import com.example.administrator.shijeibei.Fragment.TimeFragment;
import com.example.administrator.shijeibei.R;

public class MainActivity extends AppCompatActivity {

    private Button btnhome;
    private Button btntime;
    private Button btnteam;
    private FragmentManager fragmentManager;
    private HomeFragment homeFragment = new HomeFragment();
    private TimeFragment timeFragment = new TimeFragment();
    private TeamFragment teamFragment = new TeamFragment();
    private Fragment currentFragment = new Fragment();
    private OnclickedImpl listener = new OnclickedImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getview();
        setlistener();
        changeFragment(homeFragment);
    }

    private void setlistener() {
        btnhome.setOnClickListener(listener);
        btntime.setOnClickListener(listener);
        btnteam.setOnClickListener(listener);
    }

    private void changeFragment(Fragment fragment){
        if(null == fragmentManager){
            fragmentManager = getSupportFragmentManager();
        }
        if(currentFragment != fragment){
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.hide(currentFragment);
            if(!fragment.isAdded()) {
                transaction.add(R.id.show_fragment,fragment);
            }
            transaction.show(fragment);
            transaction.commit();
            currentFragment = fragment;
        }
    }

    private void getview() {
        btnhome = findViewById(R.id.btn_home);
        btntime = findViewById(R.id.btn_time);
        btnteam = findViewById(R.id.btn_team);
    }

    private void setSelected (){
        btnhome.setSelected(false);
        btntime.setSelected(false);
        btnteam.setSelected(false);
    }

    private class OnclickedImpl implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_home:
                    setSelected();
                    btnhome.setSelected(true);
                    changeFragment(homeFragment);
                    break;
                case R.id.btn_time:
                    setSelected();
                    btntime.setSelected(true);
                    changeFragment(timeFragment);
                    break;
                case R.id.btn_team:
                    setSelected();
                    btnteam.setSelected(true);
                    changeFragment(teamFragment);
                    break;
            }
        }
    }
}
