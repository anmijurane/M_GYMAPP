package com.montzandres.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class meta_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meta_activity);
    }

    public void LoseWeight(View v){
        startActivity(new Intent(getApplicationContext(), Routine30Days.class));
    }

    public void EatHabits(View v){
        Toast.makeText(this, "COMING SON", Toast.LENGTH_SHORT).show();
    }
}