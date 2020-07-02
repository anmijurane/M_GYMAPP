package com.montzandres.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class test_weight extends AppCompatActivity {
    private EditText sex, weight, age, height, current, regular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_weight);
        sex = findViewById(R.id.etT_sex);
        weight = findViewById(R.id.etT_Weight);
        age = findViewById(R.id.etT_Height);
        current = findViewById(R.id.etT_CuActivity);
        regular = findViewById(R.id.etT_ReActivity);

    }

    public void NextWindows(View v){
        if (true){
        startActivity(new Intent(this, meta_activity.class));
        }else{
        Toast.makeText(this,"Fill all the fields", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean ValidET(){
        return (sex.getText().toString().equals("") |
        weight.getText().toString().equals("") |
        age.getText().toString().equals("")    |
        height.getText().toString().equals("") |
        current.getText().toString().equals("")|
        regular.getText().toString().equals(""));

    }

}