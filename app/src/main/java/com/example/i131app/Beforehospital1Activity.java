package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;

public class Beforehospital1Activity extends Activity  {

    private TextView beforeHospitalTital01;
    private ImageView beforeHospitalImage01;
    private TextView beforeHospitalText1_1;
    private TextView beforeHospitalText1_2;
    private TextView beforeHospitalText1_3;
    private TextView beforeHospitalText1_4;
    private TextView beforeHospitalText1_5;
    private TextView beforeHospitalText1_6;
    private TextView beforeHospitalText1_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beforehospital1);

        beforeHospitalTital01 = (TextView) findViewById(R.id.BeforeHospitalTital01);
        beforeHospitalImage01 = (ImageView) findViewById(R.id.BeforeHospitalImage01);
        beforeHospitalText1_1 = (TextView) findViewById(R.id.BeforeHospitalText1_1);
        beforeHospitalText1_2 = (TextView) findViewById(R.id.BeforeHospitalText1_2);
        beforeHospitalText1_3 = (TextView) findViewById(R.id.BeforeHospitalText1_3);
        beforeHospitalText1_4 = (TextView) findViewById(R.id.BeforeHospitalText1_4);
        beforeHospitalText1_5 = (TextView) findViewById(R.id.BeforeHospitalText1_5);
        beforeHospitalText1_6 = (TextView) findViewById(R.id.BeforeHospitalText1_6);
        beforeHospitalText1_7 = (TextView) findViewById(R.id.BeforeHospitalText1_7);
    }

}
