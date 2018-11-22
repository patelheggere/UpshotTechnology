package com.example.admin.upshothelloworld.activities;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.admin.upshothelloworld.DBHelper;

public class DBManager {
    private static final String TAG = "DBManager";
    private DBHelper dbHelper;

    private Context context;

    private SQLiteDatabase database;

    public DBManager(Context c) {
        context = c;
    }

    public DBManager open() throws SQLException {
        dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
       // database = dbHelper.getReadableDatabase();
        return this;
    }

    public void close() {
        dbHelper.close();
    }

    public long insert(String name, String phone, String email) {
        ContentValues contentValue = new ContentValues();
        contentValue.put(DBHelper.NAME, name);
        contentValue.put(DBHelper.PHONE, phone);
        contentValue.put(DBHelper.EMAIL, email);
        return database.insert(DBHelper.TABLE_NAME, null, contentValue);
    }

    public Cursor fetch() {
        String[] columns = new String[] { DBHelper.NAME, DBHelper.PHONE, DBHelper.EMAIL };
        Cursor cursor = database.query(DBHelper.TABLE_NAME, columns, null, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }

    public int update(String _id, String name, String Phone, String email) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBHelper.NAME, name);
        contentValues.put(DBHelper.PHONE, Phone);
        contentValues.put(DBHelper.EMAIL, email);
        int i = database.update(DBHelper.TABLE_NAME, contentValues, DBHelper.PHONE + " = " + _id, null);
        return i;
    }

    public int delete(String phone) {
        Log.d(TAG, "delete: ");
        return database.delete(DBHelper.TABLE_NAME, DBHelper.PHONE + "=" + phone, null);
    }

}