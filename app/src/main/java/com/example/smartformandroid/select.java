package com.example.smartformandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ImageButton btn = (ImageButton)findViewById(R.id.banner);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(select.this, MainActivity.class));
            }
        });
        ImageButton btn2 = (ImageButton)findViewById(R.id.banner2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(select.this, MainActivity.class));
            }
        });
        ImageButton btn3 = (ImageButton)findViewById(R.id.banner3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(select.this, MainActivity.class));
            }
        });
    }
}