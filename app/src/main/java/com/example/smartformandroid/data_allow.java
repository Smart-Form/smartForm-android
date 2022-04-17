package com.example.smartformandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class data_allow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_allow);

        ImageButton btn = (ImageButton)findViewById(R.id.yes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(data_allow.this, type.class));
            }
        });
        ImageButton btn2 = (ImageButton)findViewById(R.id.no);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(data_allow.this, type.class));
            }
        });
    }
}