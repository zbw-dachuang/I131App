package com.example.i131app.sqlDatabase.user;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import static android.content.ContentValues.TAG;

public class patientContact {
    public static final String tableName = "patientInformation";
    private static final String tableColumn[] = {
            patientColumn.Username,
            patientColumn.Password,
            patientColumn.Name,
            patientColumn.Nname,
            patientColumn.IDcard,
            patientColumn.Sex,
            patientColumn.State,
            patientColumn.Time,
            patientColumn.Type,
            patientColumn.Mark,
            patientColumn.Plan
    };

    //创建表
    public static final String create_table = "create table if not exists "+tableName+" ( "
                                               + patientColumn.Username+" char(11) primary key, "
                                               + patientColumn.Password+" varchar(16) not null, "
                                               + patientColumn.Name+" varchar(10), "
                                               + patientColumn.Nname+" varchar(10), "
                                               + patientColumn.IDcard+" char(18), "
                                               + patientColumn.Sex+" bit, "
                                               + patientColumn.State+" int, "
                                               + patientColumn.Time+" Date, "
                                               + patientColumn.Type+" varchar(20) , "
                                               + patientColumn.Mark+" int default(0), "
                                               + patientColumn.Plan+" text "
                                               +")";

    //删除表
    public static final String drop_table = "DROP TABLE IF EXISTS " + tableName;

    //判断下所请求的字段是否都存在，分支出现操作的字段不存在的错误
    private static void checkColumns(String[] projection)
    {
        if (projection != null)
        {
            HashSet<String> requestedColumns = new HashSet<String>(Arrays.asList(projection));
            HashSet<String> availableColumns = new HashSet<String>(Arrays.asList(tableColumn));
            if (!availableColumns.containsAll(requestedColumns))
            {
                throw new IllegalArgumentException(TAG + "checkColumns()-> Unknown columns in projection");
            }
        }
    }

    //记录是否存在
    public static boolean isExist(SQLiteOpenHelper helper, String patientUsername)
    {
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor = db.query(tableName, tableColumn,  patientColumn.Username + " =? ", new String[] {patientUsername}, null, null, null);
        if (cursor.moveToFirst())
        {
            Log.d(TAG, "患者存在");
            cursor.close();
            return true;
        }
        else
        {
            Log.d(TAG, "患者不存在");
            cursor.close();
            return false;
        }
    }

    //查询患者信息
    public static patient query(SQLiteOpenHelper helper, String patientUsername)
    {
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor = db.query(tableName, tableColumn, patientColumn.Username + " =? ", new String[] {patientUsername}, null, null, null, null);
        patient patient = null;
        if (cursor != null)
        {
            cursor.moveToFirst();
            patient = getStudentFromCursor(cursor);
        }
        return patient;
    }

    /**
     * 更新学生对象
     * */
    public static void update(SQLiteOpenHelper helper, patient patient)
    {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.update(tableName, toContentValues(patient), patientColumn.Username + " =? ", new String[] {patient.getUsername()});
    }

    /**
     * 插入新数据
     * */
    public static void insert(SQLiteOpenHelper helper, patient patient)
    {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.insert(tableName, null, toContentValues(patient));
    }

    /**
     * 插入新数据，如果已经存在就替换
     * */
    public static void insertOrReplace(SQLiteOpenHelper helper, patient patient)
    {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.insertWithOnConflict(tableName, null, toContentValues(patient), SQLiteDatabase.CONFLICT_REPLACE);
    }

    /**
     * 删除某条记录
     * */
    public static void delete(SQLiteOpenHelper helper, String patientUsername)
    {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.delete(tableName, patientColumn.Username + " =? ", new String[] {patientUsername});
    }

    /**
     * 清空患者表
     */
    public static void clear(SQLiteOpenHelper helper)
    {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.delete(tableName, null, null);
    }

    /**
     * 将对象保证成ContentValues
     * */
    private static ContentValues toContentValues(patient patient)
    {
        ContentValues contentValues = new ContentValues();

        contentValues.put(patientColumn.Username, patient.getUsername());
        contentValues.put(patientColumn.Password, patient.getPassword());
        contentValues.put(patientColumn.Nname, patient.getNname());
        contentValues.put(patientColumn.Name, patient.getName());
        contentValues.put(patientColumn.IDcard, patient.getIDcard());
        contentValues.put(patientColumn.State, patient.getState());
        contentValues.put(patientColumn.Sex, patient.isSex());
        contentValues.put(patientColumn.Time, patient.getTime().toString());
        contentValues.put(patientColumn.Type, patient.getType());
        contentValues.put(patientColumn.Mark, patient.getMark());
        contentValues.put(patientColumn.Plan, patient.getPlan());



        return contentValues;
    }

    /**
     * 将学生对象从Cursor中取出
     * */
    private static patient getStudentFromCursor(Cursor cursor) {
        patient patient = new patient();
        String dateString;
        Date date  = new Date();
        patient.setUsername(cursor.getString(cursor.getColumnIndex(patientColumn.Username)));
        patient.setPassword(cursor.getString(cursor.getColumnIndex(patientColumn.Password)));
        patient.setName(cursor.getString(cursor.getColumnIndex(patientColumn.Name)));
        patient.setNname(cursor.getString(cursor.getColumnIndex(patientColumn.Nname)));
        patient.setIDcard(cursor.getString(cursor.getColumnIndex(patientColumn.IDcard)));
        dateString = cursor.getString(cursor.getColumnIndex(patientColumn.Time));
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
        try {
             date = sf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        patient.setTime(date);
        patient.setType(cursor.getString(cursor.getColumnIndex(patientColumn.Type)));
        String sexString = cursor.getString(cursor.getColumnIndex(patientColumn.Sex));
        patient.setSex(Boolean.parseBoolean(sexString));
        patient.setState(cursor.getInt(cursor.getColumnIndex(patientColumn.State)));
        patient.setMark(cursor.getInt(cursor.getColumnIndex(patientColumn.Mark)));
        patient.setPlan(cursor.getString(cursor.getColumnIndex(patientColumn.Plan)));
        return patient;
    }
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