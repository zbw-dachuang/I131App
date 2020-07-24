package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;

public class Beforehospitalquestion4Activity extends Activity  {

    private TextView beforeHospitalQ1Tital4;
    private ImageView beforeHospitalQ4Image;
    private TextView beforeHospitalQ4Text1;
    private TextView beforeHospitalQ4Text2;
    private TextView beforeHospitalQ4Text3;
    private TextView beforeHospitalQ4Text4;
    private TextView beforeHospitalQ4Text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beforehospitalquestion4);

        beforeHospitalQ1Tital4 = (TextView) findViewById(R.id.BeforeHospitalQ1Tital4);
        beforeHospitalQ4Image = (ImageView) findViewById(R.id.BeforeHospitalQ4Image);
        beforeHospitalQ4Text1 = (TextView) findViewById(R.id.BeforeHospitalQ4Text1);
        beforeHospitalQ4Text2 = (TextView) findViewById(R.id.BeforeHospitalQ4Text2);
        beforeHospitalQ4Text3 = (TextView) findViewById(R.id.BeforeHospitalQ4Text3);
        beforeHospitalQ4Text4 = (TextView) findViewById(R.id.BeforeHospitalQ4Text4);
        beforeHospitalQ4Text5 = (TextView) findViewById(R.id.BeforeHospitalQ4Text5);
    }

}
