package com.example.i131app.activity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

import com.example.i131app.R;

public class Process1Activity extends Activity  {

    private RelativeLayout itemDetail1;
    private TextView processTital1;
    private ImageView imageview1;
    private TextView textView02;
    private ImageView imageView2;
    private TextView textView03;
    private TextView textView04;
    private TextView textView05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process1);

        itemDetail1 = (RelativeLayout) findViewById(R.id.item_detail_1);
        processTital1 = (TextView) findViewById(R.id.ProcessTital1);
        imageview1 = (ImageView) findViewById(R.id.Imageview1);
        textView02 = (TextView) findViewById(R.id.textView02);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        textView03 = (TextView) findViewById(R.id.textView03);
        textView04 = (TextView) findViewById(R.id.textView04);
        textView05 = (TextView) findViewById(R.id.textView05);
    }

}
