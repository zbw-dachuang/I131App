package com.example.i131app;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

    public static void main(String []arg){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd");
        Date date = new Date(System.currentTimeMillis());
        String tempTime = formatter.format(date);
        System.out.println(tempTime.subSequence(0,4));

    }
}
