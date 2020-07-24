package com.example.i131app.sqlDatabase;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.i131app.sqlDatabase.user.patientContact;

public class DBHelper extends SQLiteOpenHelper {
    private static final String dbName = "patient.db";//数据库名称
    private static final int Version = 1;

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, dbName, factory, Version);
    }

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, dbName, factory, Version, errorHandler);
    }

    public DBHelper(@Nullable Context context, @Nullable String name, int version, @NonNull SQLiteDatabase.OpenParams openParams) {
        super(context, dbName, Version, openParams);
    }
    public DBHelper(@Nullable Context context){
        super(context, dbName,null, Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(patientContact.create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
