package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class PersonInformationActivity extends Activity  {

    private TextView name;
    private TextView nameText;
    private TextView date;
    private TextView phone;
    private TextView password;
    private TextView mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_information);

        name = (TextView) findViewById(R.id.Name);
        nameText = (TextView) findViewById(R.id.nameText);
        date = (TextView) findViewById(R.id.Date);
        date = (TextView) findViewById(R.id.date);
        phone = (TextView) findViewById(R.id.Phone);
        phone = (TextView) findViewById(R.id.phone);
        password = (TextView) findViewById(R.id.Password);
        password = (TextView) findViewById(R.id.password);
        mark = (TextView) findViewById(R.id.Mark);
        mark = (TextView) findViewById(R.id.mark);
    }

}
