package com.montzandres.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Routine30Days extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine30_days);
    }

    public void goTypeActivityArm(View v){
        Bundle data = new Bundle();
        data.putString("ARMView","ARM");
        Intent go = new Intent(this, TypeActivityGym.class);
        go.putExtras(data);
        startActivity(go);
    }

    public void goTypeActivityButtocks(View v){
        Bundle data = new Bundle();
        data.putString("ARMView","BUTTOCKS");
        Intent go = new Intent(this, TypeActivityGym.class);
        go.putExtras(data);
        startActivity(go);
    }

    public void goTypeActivityAbdomen(View v){
        Bundle data = new Bundle();
        data.putString("ARMView","ABDOMEN");
        Intent go = new Intent(this, TypeActivityGym.class);
        go.putExtras(data);
        startActivity(go);
    }

    public void goTypeActivityLegs(View v){
        Bundle data = new Bundle();
        data.putString("ARMView","LEGS");
        Intent go = new Intent(this, TypeActivityGym.class);
        go.putExtras(data);
        startActivity(go);
    }
}