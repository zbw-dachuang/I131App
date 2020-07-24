package com.example.i131app.activity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.i131app.R;

public class Process4Activity extends Activity  {

    private LinearLayout itemDetail4;
    private TextView processTital4;
    private TextView processText1;
    private TextView processText2;
    private TextView processText3;
    private TextView processText4;
    private TextView processText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process4);

        itemDetail4 = (LinearLayout) findViewById(R.id.item_detail_4);
        processTital4 = (TextView) findViewById(R.id.ProcessTital4);
        processText1 = (TextView) findViewById(R.id.ProcessText1);
        processText2 = (TextView) findViewById(R.id.ProcessText2);
        processText3 = (TextView) findViewById(R.id.ProcessText3);
        processText4 = (TextView) findViewById(R.id.ProcessText4);
        processText5 = (TextView) findViewById(R.id.ProcessText5);
    }

}
