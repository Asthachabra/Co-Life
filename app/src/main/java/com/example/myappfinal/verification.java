package com.example.myappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class verification extends AppCompatActivity {
public Button button_thankyou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        button_thankyou=(Button)findViewById(R.id.button5);
        button_thankyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(verification.this,thankyou.class);
                startActivity(intent);
            }
        });
    }
}