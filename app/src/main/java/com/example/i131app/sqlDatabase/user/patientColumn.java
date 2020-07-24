package com.example.i131app.sqlDatabase.user;

import android.provider.BaseColumns;

public interface patientColumn extends BaseColumns {
    String Username = "username" ;
    String Password = "password";
    String Name = "name";
    String Nname = "nname";
    String IDcard ="idcard";
    String Sex = "sex";
    String State = "state";
    String Time = "time";
    String Type = "type";
    String Mark = "mark";
    String Plan = "plan";
}

/*
 ( username char(11) PRIMARY key,\n" +
            " password varchar(16) not null,\n" +
            " name varchar(10),\n" +
            " Nname VARCHAR(10),\n" +
            " IDcard char(18),\n" +
            " sex bit,\n" +
            " state int,\n" +
            " time Date,\n" +
            " type varchar(20),\n" +
            " mark int DEFAULT(0),\n" +
            " plan text)";
 */