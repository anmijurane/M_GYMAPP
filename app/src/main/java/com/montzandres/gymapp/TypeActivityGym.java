package com.montzandres.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class TypeActivityGym extends AppCompatActivity {
    private EditText title;
    private String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_gym);

        title = findViewById(R.id.etT_Title);
        Bundle data = this.getIntent().getExtras();
        if (data != null){
            type = data.getString("ARMView");
            title.setText(type);
            setImage();
        }
    }

    public void setImage(){
        switch (type){
            case "ARM":

            break;
        }
    }
}