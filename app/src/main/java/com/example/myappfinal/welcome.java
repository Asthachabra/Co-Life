package com.example.myappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class welcome extends AppCompatActivity {
    public Button button_donor;
    public Button button_resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        button_donor=(Button)findViewById(R.id.donor);
        button_donor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(welcome.this,donor.class);
                startActivity(intent);
            }
        });

        button_resources=(Button)findViewById(R.id.resources);
        button_resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(welcome.this,resources.class);
                startActivity(intent);
            }
        });
    }
}