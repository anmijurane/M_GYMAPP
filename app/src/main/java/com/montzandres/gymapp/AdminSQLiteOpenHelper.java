package com.montzandres.gymapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    private SQLiteDatabase db;
    private int oldVersion;
    private int newVersion;
    private static final String DB_NAME = "gymhome.sqlite";
    private static final int DB_VERSION = 1;
    public AdminSQLiteOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        db.execSQL("CREATE TABLE User(idUser varchar(50), name varchar(50), password varchar(50)) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        this.db = db;
        this.oldVersion = oldVersion;
        this.newVersion = newVersion;
    }

}
