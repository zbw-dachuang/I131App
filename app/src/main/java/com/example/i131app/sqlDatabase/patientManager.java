package com.example.i131app.sqlDatabase;

import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

import com.example.i131app.sqlDatabase.user.patient;
import com.example.i131app.sqlDatabase.user.patientContact;

public class patientManager {

    private SQLiteOpenHelper dbHelper;

    public patientManager(SQLiteOpenHelper dbHelper)
    {
        this.dbHelper = dbHelper;
    }

    /**
     * 记录是否存在
     * */
    public boolean isExist(String patientUsername)
    {
        if(TextUtils.isEmpty(patientUsername))
        {
            return false;
        }
        return patientContact.isExist(dbHelper, patientUsername);
    }

    /**
     * 查询某个患者
     * */
    public patient query(String patientUsername)
    {
        if(TextUtils.isEmpty(patientUsername))
        {
            return null;
        }
        return patientContact.query(dbHelper, patientUsername);
    }

    /**
     * 插入一条数据
     * */
    public void insert(patient patient)
    {
        if(patient == null)
        {
            return;
        }
        patientContact.insert(dbHelper, patient);
    }

    /**
     * 插入某条记录，如果已经存在就覆盖
     * */
    public void insertOrReplace(patient patient)
    {
        if(patient == null)
        {
            return;
        }
        patientContact.insertOrReplace(dbHelper, patient);
    }

    /**
     * 更新某条记录
     * */
    public void update(patient patient)
    {
        if(patient == null)
        {
            return;
        }
        patientContact.update(dbHelper, patient);
    }

    /**
     * 删除某条记录
     * */
    public void delete(String patientUsername)
    {
        if(TextUtils.isEmpty(patientUsername))
        {
            return;
        }
        patientContact.delete(dbHelper, patientUsername);
    }

    /**
     * 清空表
     * */
    public void clear()
    {
        patientContact.clear(dbHelper);
    }
}
