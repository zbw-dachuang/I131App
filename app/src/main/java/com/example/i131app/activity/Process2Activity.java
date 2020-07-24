package com.example.i131app.activity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

import com.example.i131app.R;

public class Process2Activity extends Activity  {

    private LinearLayout itemDetail2;
    private TextView processTital2;
    private TextView process2Text1;
    private TextView process2Text2;
    private TextView process2Text3;
    private TextView process2Text4;
    private TextView process2Text5;
    private TextView process2Text6;
    private TextView process2Text7;
    private ImageView process2Image1;
    private TextView process2Text8;
    private ImageView process2Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process2);

        itemDetail2 = (LinearLayout) findViewById(R.id.item_detail_2);
        processTital2 = (TextView) findViewById(R.id.ProcessTital2);
        process2Text1 = (TextView) findViewById(R.id.Process2Text1);
        process2Text2 = (TextView) findViewById(R.id.Process2Text2);
        process2Text3 = (TextView) findViewById(R.id.Process2Text3);
        process2Text4 = (TextView) findViewById(R.id.Process2Text4);
        process2Text5 = (TextView) findViewById(R.id.Process2Text5);
        process2Text6 = (TextView) findViewById(R.id.Process2Text6);
        process2Text7 = (TextView) findViewById(R.id.Process2Text7);
        process2Image1 = (ImageView) findViewById(R.id.Process2Image1);
        process2Text8 = (TextView) findViewById(R.id.Process2Text8);
        process2Image2 = (ImageView) findViewById(R.id.Process2Image2);
    }

}
