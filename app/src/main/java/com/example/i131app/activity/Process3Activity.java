package com.example.i131app.activity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.i131app.R;

public class Process3Activity extends Activity  {

    private ScrollView itemDetail3;
    private TextView processTital3;
    private TextView process3Text1;
    private TextView process3Text2;
    private TextView process3Text3;
    private TextView process3Text4;
    private TextView process3Text5;
    private TextView process3Text6;
    private TextView process3Text7;
    private TextView process3Text8;
    private TextView process3Text9;
    private TextView process3Text10;
    private TextView process3Text11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process3);

        itemDetail3 = (ScrollView) findViewById(R.id.item_detail_3);
        processTital3 = (TextView) findViewById(R.id.ProcessTital3);
        process3Text1 = (TextView) findViewById(R.id.Process3Text1);
        process3Text2 = (TextView) findViewById(R.id.Process3Text2);
        process3Text3 = (TextView) findViewById(R.id.Process3Text3);
        process3Text4 = (TextView) findViewById(R.id.Process3Text4);
        process3Text5 = (TextView) findViewById(R.id.Process3Text5);
        process3Text6 = (TextView) findViewById(R.id.Process3Text6);
        process3Text7 = (TextView) findViewById(R.id.Process3Text7);
        process3Text8 = (TextView) findViewById(R.id.Process3Text8);
        process3Text9 = (TextView) findViewById(R.id.Process3Text9);
        process3Text10 = (TextView) findViewById(R.id.Process3Text10);
        process3Text11 = (TextView) findViewById(R.id.Process3Text11);
    }

}
