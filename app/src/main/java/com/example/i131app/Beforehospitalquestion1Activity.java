package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;

public class Beforehospitalquestion1Activity extends Activity  {

    private TextView beforeHospitalQ1Tital1;
    private ImageView beforeHospitalQ1Image;
    private TextView beforeHospitalQ1Text1;
    private TextView beforeHospitalQ1Text2;
    private TextView beforeHospitalQ1Text3;
    private TextView beforeHospitalQ1Text4;
    private TextView beforeHospitalQ1Text5;
    private TextView beforeHospitalQ1Text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beforehospitalquestion1);

        beforeHospitalQ1Tital1 = (TextView) findViewById(R.id.BeforeHospitalQ1Tital1);
        beforeHospitalQ1Image = (ImageView) findViewById(R.id.BeforeHospitalQ1Image);
        beforeHospitalQ1Text1 = (TextView) findViewById(R.id.BeforeHospitalQ1Text1);
        beforeHospitalQ1Text2 = (TextView) findViewById(R.id.BeforeHospitalQ1Text2);
        beforeHospitalQ1Text3 = (TextView) findViewById(R.id.BeforeHospitalQ1Text3);
        beforeHospitalQ1Text4 = (TextView) findViewById(R.id.BeforeHospitalQ1Text4);
        beforeHospitalQ1Text5 = (TextView) findViewById(R.id.BeforeHospitalQ1Text5);
        beforeHospitalQ1Text6 = (TextView) findViewById(R.id.BeforeHospitalQ1Text6);
    }

}
