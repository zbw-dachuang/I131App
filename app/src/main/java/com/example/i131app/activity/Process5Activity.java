package com.example.i131app.activity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.bin.david.form.annotation.ColumnType;
import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.core.SmartTable;
import com.bin.david.form.data.CellInfo;
import com.bin.david.form.data.column.Column;
import com.bin.david.form.data.table.TableData;
import com.example.i131app.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Util.Neccessity;

public class Process5Activity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process5);
        SmartTable<Neccessity> table = findViewById(R.id.neccessity);
        List<Neccessity> neccessityList = new ArrayList<>();
        neccessityList.add(1, new Neccessity(1,"牙膏","1支","无"));
        neccessityList.add(2, new Neccessity(2,"牙刷","1把","无"));
        neccessityList.add(3, new Neccessity(3,"水杯","3个","无"));
        neccessityList.add(4, new Neccessity(4,"盆","3个","无"));
        neccessityList.add(5, new Neccessity(5,"毛巾","3条","无"));
        neccessityList.add(6, new Neccessity(6,"内衣裤","3条","无"));
        neccessityList.add(7, new Neccessity(7,"碱性肥皂","1个","无"));
        neccessityList.add(8, new Neccessity(8,"微波炉专用碗","3个","注意！！！"));
        neccessityList.add(9, new Neccessity(9,"洗洁精","1瓶","洗碗使用"));
        neccessityList.add(10, new Neccessity(10,"电动剃须刀","1个","男士可备"));
        neccessityList.add(11, new Neccessity(11,"防滑拖鞋","1双","洗澡、生活用"));
        neccessityList.add(12, new Neccessity(12,"换洗衣物","3套","含衣架"));
        neccessityList.add(13, new Neccessity(13,"电子血压计","一套","有血压问题患者需要准备"));
        neccessityList.add(14, new Neccessity(14,"血糖仪、血糖试纸","一套","有血糖问题的患者需要准备"));
        neccessityList.add(15, new Neccessity(15,"娱乐产品","若干","电脑、手机、书籍等均可"));
        neccessityList.add(16, new Neccessity(16,"水溶性卫生纸","若干","由于封闭式治疗，并且存在放射性，务必使用水溶性纸巾"));
        table.setData(neccessityList);

    }

}

