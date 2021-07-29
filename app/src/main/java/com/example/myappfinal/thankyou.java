package com.example.myappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class thankyou extends AppCompatActivity {
public Button button_thankyou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);

        button_thankyou=(Button)findViewById(R.id.button3);
        button_thankyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(thankyou.this,welcome.class);
                startActivity(intent);
            }
        });

    }
}