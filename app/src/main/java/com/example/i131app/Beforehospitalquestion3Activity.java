package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;

public class Beforehospitalquestion3Activity extends Activity  {

    private TextView beforeHospitalQ1Tital3;
    private ImageView beforeHospitalQ3Image;
    private TextView beforeHospitalQ3Text1;
    private TextView beforeHospitalQ3Text2;
    private TextView beforeHospitalQ3Text3;
    private TextView beforeHospitalQ3Text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beforehospitalquestion3);

        beforeHospitalQ1Tital3 = (TextView) findViewById(R.id.BeforeHospitalQ1Tital3);
        beforeHospitalQ3Image = (ImageView) findViewById(R.id.BeforeHospitalQ3Image);
        beforeHospitalQ3Text1 = (TextView) findViewById(R.id.BeforeHospitalQ3Text1);
        beforeHospitalQ3Text2 = (TextView) findViewById(R.id.BeforeHospitalQ3Text2);
        beforeHospitalQ3Text3 = (TextView) findViewById(R.id.BeforeHospitalQ3Text3);
        beforeHospitalQ3Text4 = (TextView) findViewById(R.id.BeforeHospitalQ3Text4);
    }

}
