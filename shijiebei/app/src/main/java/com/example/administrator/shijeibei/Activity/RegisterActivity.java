package com.example.administrator.shijeibei.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.shijeibei.R;
import com.example.administrator.shijeibei.Util.RegisterOkhttpUtil;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RegisterActivity extends AppCompatActivity {
    private EditText registerusername;
    private EditText registerpassword;
    private EditText registerrealname;
    private EditText registeremile;
    private Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getViews();
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void getViews() {
        registerusername=findViewById(R.id.et_regist_username);
        registerpassword=findViewById(R.id.et_regist_pwd);
        registeremile=findViewById(R.id.et_regist_mail);
        registerrealname=findViewById(R.id.et_regist_realname);
        btnregister=findViewById(R.id.btn_register);
    }


    public void register(){
        String mail = registeremile.getText().toString();
        String username = registerusername.getText().toString();
        String password = registerpassword.getText().toString();
        String realname=registerrealname.getText().toString();
        String address = "http://10.7.85.219:8080/WorldCupNews_Server/register.action";
        FormBody.Builder builder = new FormBody.Builder();
        builder.add("email",mail);
        builder.add("username",username);
        builder.add("password",password);
        builder.add("realname",realname);
        FormBody body = builder.build();
        RegisterOkhttpUtil.sendOkHttpFormBodyRequest(address, body, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
//                                    Toast.makeText(RegisterActivity.this,"请求失败",Toast.LENGTH_SHORT).show();
                Log.i("MainActivity","请求失败");
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String responseText = response.body().string();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        switch (responseText)
                        {
                            case "registersuccess":
                                Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                                Intent intent1 = new Intent(getApplicationContext(),LoginActivity.class);
                                startActivity(intent1);
                                break;
                            case "null":
                                Toast.makeText(RegisterActivity.this,"注册信息不能为空",Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                registeremile.setText("");
                                registerusername.setText("");
                                registerpassword.setText("");
                                registerrealname.setText("");
                                Toast.makeText(RegisterActivity.this,"该用户已注册",Toast.LENGTH_SHORT).show();

                        }
//                        if(responseText.equals("registersuccess")){
//                            Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
//                            Intent intent1 = new Intent(getApplicationContext(),LoginActivity.class);
//                            startActivity(intent1);
//                        }
//                        else if (responseText.equals("null"){
//                            Toast.makeText(RegisterActivity.this,"注册信息不能为空",Toast.LENGTH_SHORT).show();
//
//                        }
//                        else {
//                            registeremile.setText("");
//                            registerusername.setText("");
//                            registerpassword.setText("");
//                            registerrealname.setText("");
//                            Toast.makeText(RegisterActivity.this,"该用户已注册",Toast.LENGTH_SHORT).show();
//
//                        }
                    }
                });
            }
        });


    }

}
