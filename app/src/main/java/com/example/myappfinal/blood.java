package com.example.myappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class blood extends AppCompatActivity {
    public Button button_dbblooddonor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);

        button_dbblooddonor=(Button)findViewById(R.id.proceed);
        button_dbblooddonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(blood.this,blooddbdonors.class);
                startActivity(intent);
            }
        });
    }
}