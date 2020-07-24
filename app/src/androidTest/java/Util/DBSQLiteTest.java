package Util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.i131app.sqlDatabase.DBHelper;

import org.junit.Before;
import org.junit.Test;

public class DBSQLiteTest{
    DBHelper dbsqLite = null;
    SQLiteDatabase sqLiteDatabase = null;
    private Context mContent;
    @Before
    public void setUp() throws Exception {
        dbsqLite = new DBHelper(mContent,"patient.db",null,1);
        sqLiteDatabase = dbsqLite.getWritableDatabase();
    }

    @Test
    public void onCreate() {
        dbsqLite.onCreate(sqLiteDatabase);

    }
}