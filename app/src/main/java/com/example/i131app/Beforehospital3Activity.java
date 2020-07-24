package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;

public class Beforehospital3Activity extends Activity  {

    private TextView beforeHospitalTital03;
    private ImageView beforeHospitalImage03;
    private TextView beforeHospitalText3_1;
    private TextView beforeHospitalText3_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beforehospital3);

        beforeHospitalTital03 = (TextView) findViewById(R.id.BeforeHospitalTital03);
        beforeHospitalImage03 = (ImageView) findViewById(R.id.BeforeHospitalImage03);
        beforeHospitalText3_1 = (TextView) findViewById(R.id.BeforeHospitalText3_1);
        beforeHospitalText3_2 = (TextView) findViewById(R.id.BeforeHospitalText3_2);
    }

}
