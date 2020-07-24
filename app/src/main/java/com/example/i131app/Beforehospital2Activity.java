package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class Beforehospital2Activity extends Activity  {

    private TextView beforeHospitalTital02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beforehospital2);

        beforeHospitalTital02 = (TextView) findViewById(R.id.BeforeHospitalTital02);
    }

}
