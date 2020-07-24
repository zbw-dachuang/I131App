package com.example.i131app.sqlDatabase;

import android.content.Context;

public class DBManager
{/**
 * 单例对象本身
 * */
private static volatile DBManager dbManager;

    private patientManager patientManager;

    /**
     * 单例暴露给外部调用
     * */
    public static DBManager getInstance(Context context)
    {
        synchronized (DBManager.class)
        {
            if(dbManager == null)
            {
                dbManager = new DBManager(context);
            }
        }
        return dbManager;
    }

    private DBManager(Context context)
    {
        DBHelper dbHelper = new DBHelper(context);
        patientManager = new patientManager(dbHelper);
    }

    /**
     * 学生表
     * */
    public patientManager getStudentManager()
    {
        return this.patientManager;
    }
}
