package com.example.administrator.shijeibei.Activity;


import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.administrator.shijeibei.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edituserName;
    private EditText editpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin=findViewById(R.id.btn_login);
        edituserName=findViewById(R.id.edt_userName);
        editpassword=findViewById(R.id.edt_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    public void register(View view){
        Intent intent = new Intent();
        intent.setClass(LoginActivity.this,RegisterActivity.class);
        startActivity(intent);
    }

    public void login(){
        new Thread(){
            @Override
            public void run() {
                //2. 创建请求Request对象
                //创建RequestBody对象，封装请求的参数信息
                // (需指定参数的内容、参数的类型、编码方式）
                //参数的内容
                OkHttpClient okHttpClient=new OkHttpClient();
                String username=edituserName.getText().toString().trim();
                String password=editpassword.getText().toString().trim();
                if(TextUtils.isEmpty(username)||TextUtils.isEmpty(password)){
                    Looper.prepare();
                    Toast.makeText(LoginActivity.this,"用户名或密码不能为空",Toast.LENGTH_LONG).show();
                    Looper.loop();
                }else{
                    okHttpClient=new OkHttpClient();
                    FormBody.Builder builder = new FormBody.Builder();
                    builder.add("username",username);
                    builder.add("password",password);
                    FormBody body = builder.build();
                    Request request = new Request.Builder().post(body).url("http://10.7.85.219:8080/WorldCupNews_Server/userlogin.action").build();

                    //3. 创建Call对象
                    Call call = okHttpClient.newCall(request);
                    //4. 提交请求并获取返回的响应数据
                    call.enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            Looper.prepare();
                            Toast.makeText(LoginActivity.this,"请求失败",Toast.LENGTH_LONG).show();
                            Looper.loop();
                        }

                        @Override
                        public void onResponse(Call call, Response response) throws IOException {
                            if((response.body().string()).equals("loginsuccess")){
                                Intent intent=new Intent();
                                intent.setClass(LoginActivity.this,MainActivity.class);
                                startActivity(intent);

                            }else{
                                Looper.prepare();
                                Toast.makeText(LoginActivity.this,"用户名或密码错误",Toast.LENGTH_LONG).show();
                                Looper.loop();
                            }
                        }
                    });

                }

            }
        }.start();
    }

}
