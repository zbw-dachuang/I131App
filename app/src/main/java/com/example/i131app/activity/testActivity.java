package com.example.i131app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.i131app.R;

import com.example.i131app.sqlDatabase.DBManager;
import com.example.i131app.sqlDatabase.patientManager;
import com.example.i131app.sqlDatabase.user.patient;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

public class testActivity extends AppCompatActivity implements View.OnClickListener {

    private Button insert;
    private Button delete;
    private patient patient = new patient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        insert = findViewById(R.id.insert);
        delete = findViewById(R.id.delete);
        insert.setOnClickListener(this);
        delete.setOnClickListener(this);
        patient.setNname("zbw");
        patient.setUsername("15603131068");
        patient.setType("甲状腺癌");
        patient.setState(0);
        patient.setPassword("123");
      //  dh = new DBHelper(getApplicationContext(),"patient.db",null,1);
      //  SQLiteDatabase sqLiteDatabase =(new DBHelper(getApplicationContext())).getWritableDatabase();
     //   recordTH = new recordTH(new Date(2020,02,22),22,33,11,22,3434);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.insert:
                new QMUIDialog.MessageDialogBuilder(testActivity.this).setMessage("个人注册信息")
                        .setTitle("您确定要提交注册信息吗？")
                        .addAction("取消", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                            }
                        })
                        .addAction("确定",new QMUIDialogAction.ActionListener(){
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                 new loginThread().start();
                            }
                        })
                        .create().show();
                break;
            case R.id.delete:
                break;


        }
    }
    private class loginThread extends Thread{
        private DBManager dbManager = DBManager.getInstance(testActivity.this);

        @Override
        public void run() {
            super.run();
           patientManager patientManager = dbManager.getStudentManager();
           patientManager.insert(patient);
        }
    }
}
