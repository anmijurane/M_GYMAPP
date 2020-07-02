package com.montzandres.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user, password;
    AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.etM_User);
        password = findViewById(R.id.etM_Password);
    }

    public void RegisterBtn(View v){
        //Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
    }

    public void LoginSession(View v){
        SQLiteDatabase bd = admin.getWritableDatabase();
        Cursor fila = bd.rawQuery("SELECT * FROM User WHERE idUser = \'" +user.getText().toString() +
                                "\' AND password=\'"+password.getText().toString()+"\'", null);
        while(fila.moveToNext()){
            Log.i("LoginSesion: " , fila.getString(0));
            Log.i("LoginSesion: " , fila.getString(1));
            Log.i("LoginSesion: " , fila.getString(2));
        }
        if (fila.moveToFirst()){
            Toast.makeText(this, "WELCOME " +fila.getString(1),Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), test_weight.class));
        }else{
            Toast.makeText(this, "user does not exist",Toast.LENGTH_SHORT).show();
        }
    }
}

//create table User(idUser varchar(50), name varchar(50), password varchar(50))