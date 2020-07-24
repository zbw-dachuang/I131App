package com.example.i131app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

import com.example.i131app.AfterhospitalActivity;
import com.example.i131app.BeforehospitalActivity;
import com.example.i131app.R;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundRelativeLayout;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LearnActivity extends Activity implements View.OnClickListener {

    private QMUIRoundRelativeLayout container;
    private ImageView beforeHospitalImage;
    private ImageView inHospitalImage;
    private ImageView afterHospitalImage;
    private ImageView answerQuestionImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        container = (QMUIRoundRelativeLayout) findViewById(R.id.container);
        findViewById(R.id.BeforeHospitalButton).setOnClickListener(this);
        findViewById(R.id.InHospitalButton).setOnClickListener(this);
        findViewById(R.id.AfterHospitalButton).setOnClickListener(this);
        findViewById(R.id.AnswerQuestionButton).setOnClickListener(this);
        beforeHospitalImage = (ImageView) findViewById(R.id.BeforeHospitalImage);
        inHospitalImage = (ImageView) findViewById(R.id.InHospitalImage);
        afterHospitalImage = (ImageView) findViewById(R.id.AfterHospitalImage);
        answerQuestionImage = (ImageView) findViewById(R.id.AnswerQuestionImage);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.BeforeHospitalButton:
                //TODO implement
                intent = new Intent(LearnActivity.this, BeforehospitalActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.InHospitalButton:
                //TODO implement
                break;
            case R.id.AfterHospitalButton:
                //TODO implement
                intent = new Intent(LearnActivity.this, AfterhospitalActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.AnswerQuestionButton:
                //TODO implement
                break;
        }
    }
}
