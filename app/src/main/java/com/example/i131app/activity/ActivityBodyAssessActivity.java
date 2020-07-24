package com.example.i131app.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;

import com.example.i131app.R;

public class ActivityBodyAssessActivity extends Activity implements View.OnClickListener {

    private RadioGroup r1;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioGroup r2;
    private RadioButton rb4;
    private RadioButton rb5;
    private RadioGroup r3;
    private RadioButton rb6;
    private RadioButton rb7;
    private RadioGroup r4;
    private RadioButton rb8;
    private RadioButton rb9;
    private RadioButton rb10;
    private RadioGroup r5;
    private RadioButton rb11;
    private RadioButton rb12;
    private RadioButton rb13;
    private RadioGroup r6;
    private RadioButton rb14;
    private RadioButton rb15;
    private RadioButton rb16;
    private RadioGroup r7;
    private RadioButton rb17;
    private RadioButton rb18;
    private RadioButton rb19;
    private RadioGroup r8;
    private RadioButton rb20;
    private RadioButton rb21;
    private RadioButton rb22;
    private RadioButton rb23;
    private RadioGroup r9;
    private RadioButton rb24;
    private RadioButton rb25;
    private RadioButton rb26;
    private RadioButton rb27;
    private RadioGroup r10;
    private RadioButton rb28;
    private RadioButton rb29;
    private RadioButton rb30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_assess);

        r1 = (RadioGroup) findViewById(R.id.r1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        r2 = (RadioGroup) findViewById(R.id.r2);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        r3 = (RadioGroup) findViewById(R.id.r3);
        rb6 = (RadioButton) findViewById(R.id.rb6);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        r4 = (RadioGroup) findViewById(R.id.r4);
        rb8 = (RadioButton) findViewById(R.id.rb8);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rb10 = (RadioButton) findViewById(R.id.rb10);
        r5 = (RadioGroup) findViewById(R.id.r5);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rb12 = (RadioButton) findViewById(R.id.rb12);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        r6 = (RadioGroup) findViewById(R.id.r6);
        rb14 = (RadioButton) findViewById(R.id.rb14);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb16 = (RadioButton) findViewById(R.id.rb16);
        r7 = (RadioGroup) findViewById(R.id.r7);
        rb17 = (RadioButton) findViewById(R.id.rb17);
        rb18 = (RadioButton) findViewById(R.id.rb18);
        rb19 = (RadioButton) findViewById(R.id.rb19);
        r8 = (RadioGroup) findViewById(R.id.r8);
        rb20 = (RadioButton) findViewById(R.id.rb20);
        rb21 = (RadioButton) findViewById(R.id.rb21);
        rb22 = (RadioButton) findViewById(R.id.rb22);
        rb23 = (RadioButton) findViewById(R.id.rb23);
        r9 = (RadioGroup) findViewById(R.id.r9);
        rb24 = (RadioButton) findViewById(R.id.rb24);
        rb25 = (RadioButton) findViewById(R.id.rb25);
        rb26 = (RadioButton) findViewById(R.id.rb26);
        rb27 = (RadioButton) findViewById(R.id.rb27);
        r10 = (RadioGroup) findViewById(R.id.r10);
        rb28 = (RadioButton) findViewById(R.id.rb28);
        rb29 = (RadioButton) findViewById(R.id.rb29);
        rb30 = (RadioButton) findViewById(R.id.rb30);
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
