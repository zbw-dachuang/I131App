package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;

public class Beforehospitalquestion2Activity extends Activity  {

    private TextView beforeHospitalQ1Tital2;
    private ImageView beforeHospitalQ2Image;
    private TextView beforeHospitalQ2Text1;
    private TextView beforeHospitalQ2Text2;
    private TextView beforeHospitalQ2Text3;
    private TextView beforeHospitalQ2Text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beforehospitalquestion2);

        beforeHospitalQ1Tital2 = (TextView) findViewById(R.id.BeforeHospitalQ1Tital2);
        beforeHospitalQ2Image = (ImageView) findViewById(R.id.BeforeHospitalQ2Image);
        beforeHospitalQ2Text1 = (TextView) findViewById(R.id.BeforeHospitalQ2Text1);
        beforeHospitalQ2Text2 = (TextView) findViewById(R.id.BeforeHospitalQ2Text2);
        beforeHospitalQ2Text3 = (TextView) findViewById(R.id.BeforeHospitalQ2Text3);
        beforeHospitalQ2Text4 = (TextView) findViewById(R.id.BeforeHospitalQ2Text4);
    }

}
