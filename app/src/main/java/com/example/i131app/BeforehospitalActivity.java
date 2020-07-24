package com.example.i131app;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BeforehospitalActivity extends Activity implements View.OnClickListener {

    private ImageView imageView;
    private TextView beforeHospitalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beforehospital);

        imageView = (ImageView) findViewById(R.id.imageView);
        findViewById(R.id.BeforeHospitalButtonI1).setOnClickListener(this);
        findViewById(R.id.BeforeHospitalButtonI2).setOnClickListener(this);
        findViewById(R.id.BeforeHospitalButtonI3).setOnClickListener(this);
        beforeHospitalTextView = (TextView) findViewById(R.id.BeforeHospitalTextView);
        findViewById(R.id.BeforeHospitalQ1).setOnClickListener(this);
        findViewById(R.id.BeforeHospitalQ2).setOnClickListener(this);
        findViewById(R.id.BeforeHospitalQ3).setOnClickListener(this);
        findViewById(R.id.BeforeHospitalQ4).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.BeforeHospitalButtonI1:
                //TODO implement
                intent = new Intent(BeforehospitalActivity.this, Beforehospital1Activity.class);
                startActivity(intent);
                break;
            case R.id.BeforeHospitalButtonI2:
                //TODO implement
                intent = new Intent(BeforehospitalActivity.this,Beforehospital2Activity.class);
                startActivity(intent);
                break;
            case R.id.BeforeHospitalButtonI3:
                //TODO implement
                intent = new Intent(BeforehospitalActivity.this,Beforehospital3Activity.class);
                startActivity(intent);
                break;
            case R.id.BeforeHospitalQ1:
                //TODO implement
                intent = new Intent(BeforehospitalActivity.this,Beforehospitalquestion1Activity.class);
                startActivity(intent);
                break;
            case R.id.BeforeHospitalQ2:
                //TODO implement
                intent = new Intent(BeforehospitalActivity.this,Beforehospitalquestion2Activity.class);
                startActivity(intent);
                break;
            case R.id.BeforeHospitalQ3:
                //TODO implement
                intent = new Intent(BeforehospitalActivity.this,Beforehospitalquestion3Activity.class);
                startActivity(intent);
                break;
            case R.id.BeforeHospitalQ4:
                //TODO implement
                intent = new Intent(BeforehospitalActivity.this,Beforehospitalquestion4Activity.class);
                startActivity(intent);
                break;
        }
    }
}
