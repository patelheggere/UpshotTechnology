package com.example.admin.upshothelloworld;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    // Table Name
    public static final String TABLE_NAME = "CONTACTS";

    // Table columns
    public static final String _ID = "_id";
    public static final String NAME = "name";
    public static final String PHONE = "phone";
    public static final String EMAIL = "email";

    // Database Information
    static final String DB_NAME = "CONT.DB";

    // database version
    static final int DB_VERSION = 1;

    // Creating table query
    private static final String sql = "create table contact_tbl ( id INTEGER AUTOINCREMENT, name TEXT, phone TEXT, email TEXT);";
    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" + _ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + " TEXT NOT NULL, " + PHONE + " TEXT, "+EMAIL+" TEXT);";


    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
