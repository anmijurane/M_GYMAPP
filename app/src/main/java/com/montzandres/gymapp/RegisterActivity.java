package com.montzandres.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Logger;

public class RegisterActivity extends AppCompatActivity {
    private EditText idUser, nameUser, passUser, confPassUser;
    AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        idUser = findViewById(R.id.etR_IdUser);
        nameUser = findViewById(R.id.etR_NameUser);
        passUser = findViewById(R.id.etR_Pass);
        confPassUser = findViewById(R.id.etR_ConfPass);

    }

    public void AddUser(View v){
        Log.i("pass1", passUser.getText().toString());
        Log.i("pass2", confPassUser.getText().toString());
        if (passUser.getText().toString().equals(confPassUser.getText().toString())){
            SQLiteDatabase bd = admin.getWritableDatabase();
            ContentValues registro = new ContentValues();
            registro.put("idUser", idUser.getText().toString());
            registro.put("name", nameUser.getText().toString());
            registro.put("password",passUser.getText().toString());
            bd.insert("User", null, registro);
            bd.close();
            Toast.makeText(this, "data up ok", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }else{
            Toast.makeText(this, "Password's not is equals", Toast.LENGTH_SHORT).show();
        }
    }

}

//create table User(idUser varchar(50), name varchar(50), password varchar(50))