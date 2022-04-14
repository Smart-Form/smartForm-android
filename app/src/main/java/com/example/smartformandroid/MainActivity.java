package com.example.smartformandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent; // buttonOnclickNewIntent
import android.os.Bundle;
import android.view.View; // buttonOnclickNewIntent
import android.view.Window; // removeTitleBar
import android.view.WindowManager; // removeTitleBar
import android.widget.Button; // buttonOnclickNewIntent

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // removeTitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // removeTitleBar end

        setContentView(R.layout.activity_main);

        // buttonOnclickNewIntent 2
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, language.class));
            }
        });
        // buttonOnclickNewIntent 2 end

    }
}