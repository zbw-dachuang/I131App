package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Button;

public class QuestionActivity extends Activity implements View.OnClickListener {

    private RadioGroup question1;
    private TextView title1;
    private RadioButton answerA1;
    private RadioButton answerB1;
    private RadioButton answerC1;
    private RadioButton answerD1;
    private RadioGroup question2;
    private TextView title2;
    private RadioButton answerA2;
    private RadioButton answerB2;
    private RadioButton answerC2;
    private RadioButton answerD2;
    private RadioGroup question3;
    private TextView title3;
    private RadioButton answerA3;
    private RadioButton answerB3;
    private RadioButton answerC3;
    private RadioButton answerD3;
    private RadioGroup question4;
    private TextView title4;
    private RadioButton answerA4;
    private RadioButton answerB4;
    private RadioButton answerC4;
    private RadioButton answerD4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        question1 = (RadioGroup) findViewById(R.id.question1);
        title1 = (TextView) findViewById(R.id.title1);
        answerA1 = (RadioButton) findViewById(R.id.answerA1);
        answerB1 = (RadioButton) findViewById(R.id.answerB1);
        answerC1 = (RadioButton) findViewById(R.id.answerC1);
        answerD1 = (RadioButton) findViewById(R.id.answerD1);
        question2 = (RadioGroup) findViewById(R.id.question2);
        title2 = (TextView) findViewById(R.id.title2);
        answerA2 = (RadioButton) findViewById(R.id.answerA2);
        answerB2 = (RadioButton) findViewById(R.id.answerB2);
        answerC2 = (RadioButton) findViewById(R.id.answerC2);
        answerD2 = (RadioButton) findViewById(R.id.answerD2);
        question3 = (RadioGroup) findViewById(R.id.question3);
        title3 = (TextView) findViewById(R.id.title3);
        answerA3 = (RadioButton) findViewById(R.id.answerA3);
        answerB3 = (RadioButton) findViewById(R.id.answerB3);
        answerC3 = (RadioButton) findViewById(R.id.answerC3);
        answerD3 = (RadioButton) findViewById(R.id.answerD3);
        question4 = (RadioGroup) findViewById(R.id.question4);
        title4 = (TextView) findViewById(R.id.title4);
        answerA4 = (RadioButton) findViewById(R.id.answerA4);
        answerB4 = (RadioButton) findViewById(R.id.answerB4);
        answerC4 = (RadioButton) findViewById(R.id.answerC4);
        answerD4 = (RadioButton) findViewById(R.id.answerD4);
        findViewById(R.id.loginAnswer).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loginAnswer:
                //TODO implement
                break;
        }
    }
}
