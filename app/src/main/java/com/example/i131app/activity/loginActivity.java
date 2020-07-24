package com.example.i131app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.i131app.R;

import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import com.example.i131app.sqlDatabase.user.patient;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class loginActivity extends Activity implements View.OnClickListener {

    private LinearLayoutCompat loginActivity;
    final Intent intent = new Intent(this,MainActivity.class);
    private  String username;
    private  String password;
    private EditText usernameText;
    private EditText passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameText = findViewById(R.id.username);
        passwordText = findViewById(R.id.password);
        username = getUsername().toString();
        password = getPassword().toString();
        findViewById(R.id.login).setOnClickListener(this);
        Handler handler = new Handler(){
            @Override
            public void handleMessage(@NonNull final Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case 0:
                        //用户名不存在
                        Toast.makeText(getApplicationContext(),"用户名不存在，请马上进行注册",Toast.LENGTH_LONG);
                        break;
                    case 1:
                        //用户名存在，且两者匹配
                        Toast.makeText(getApplicationContext(),"恭喜您登录成功,2秒钟后跳转到主界面",Toast.LENGTH_SHORT);
                        Timer timer = new Timer();
                        TimerTask timerTask = new TimerTask() {
                            @Override
                            public void run() {
                                patient patient = new patient();
                                patient = (patient)msg.obj;

                                startActivity(intent);

                            }
                        };
                        timer.schedule(timerTask,2);
                        break;
                    case 2:
                        //用户名存在，但密码错误
                        Toast.makeText(getApplicationContext(),"用户名或密码错误，请重新输入",Toast.LENGTH_SHORT);
                        usernameText.setText("");
                        passwordText.setText("");
                        break;
                        default:
                            //消息出错
                            Toast.makeText(getApplicationContext(),"消息出错了",Toast.LENGTH_LONG);

                }
            }
        };

    }

    private EditText getUsername(){
        return (EditText) findViewById(R.id.username);
    }

    private EditText getPassword(){
        return (EditText) findViewById(R.id.password);
    }

    @Override
    public void onClick(View view) {
        loginThread login = new loginThread();
        login.start();
    }

    class loginThread extends Thread{//登录副线程
        @Override
        public void run(){
            try{
                FormBody formBody = new FormBody.Builder()
                        .add("username", username)
                        .add("password",password)
                        .build();
                URL url = new URL("http://127.0.0.1:8888/login/paitent");
                OkHttpClient client = new OkHttpClient();
                final Request request = new Request.Builder()
                        .url(url)
                        .post(formBody)
                        .build();

                 try{
                     Response response = client.newCall(request).execute();
                     if(response.isSuccessful()){
                         //请求成功
                         System.out.println("success");
                     }
                     else{
                          throw new IOException("unsuccess code"+ response);
                     }
                }catch (Exception m){
                     m.fillInStackTrace();
                 }
            }catch (Exception e){
                e.fillInStackTrace();
            }
        }

    }
}
