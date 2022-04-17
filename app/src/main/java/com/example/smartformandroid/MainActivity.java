package com.example.smartformandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent; // buttonOnclickNewIntent
import android.os.Bundle;
import android.view.View; // buttonOnclickNewIntent
import android.view.Window; // removeTitleBar
import android.view.WindowManager; // removeTitleBar
import android.widget.Button; // buttonOnclickNewIntent
import android.widget.TextView; // backBTN

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // removeTitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // removeTitleBar end

        // hideTheNavigationBar
        View decorView = getWindow().getDecorView();
        // Hide both the navigation bar and the status bar.
        // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
        // a general rule, you should design your app to hide the status bar whenever you
        // hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        // hideTheNavigationBar end

        setContentView(R.layout.activity_main);

        // buttonOnclickNewIntent 2
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, id_card.class));
            }
        });
        // buttonOnclickNewIntent 2 end

        // backBTN 2
        TextView backBtn = (TextView) findViewById(R.id.back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        // backBTN 2 end
    }
}