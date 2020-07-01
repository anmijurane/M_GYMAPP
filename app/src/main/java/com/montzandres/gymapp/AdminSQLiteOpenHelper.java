package com.montzandres.gymapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    private SQLiteDatabase db;
    private int oldVersion;
    private int newVersion;

    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable
            SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        db.execSQL("create table User(idUser varchar(50), name varchar(50), password varchar(50)) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        this.db = db;
        this.oldVersion = oldVersion;
        this.newVersion = newVersion;
    }

}
