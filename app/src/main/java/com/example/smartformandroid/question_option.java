package com.example.smartformandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class question_option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        setContentView(R.layout.activity_question_option);

        Button btn = (Button) findViewById(R.id.loading);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(question_option.this, question_text.class));
            }
        });

        TextView backBtn = (TextView) findViewById(R.id.back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button thisObj = (Button) findViewById(R.id.answer_option0);
        Button thisObj2 = (Button) findViewById(R.id.answer_option1);
        Button thisObj3 = (Button) findViewById(R.id.answer_option2);
        Button thisObj4 = (Button) findViewById(R.id.answer_option3);
        Button thisObj5 = (Button) findViewById(R.id.answer_option4);
        Button thisObj6 = (Button) findViewById(R.id.answer_option5);
        thisObj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObj.getTag() == null) {
                    thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                    thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                    thisObj.setTag(1);
                    // Disable other options
                    thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj2.setTag(0);
                    thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj3.setTag(0);
                    thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj4.setTag(0);
                    thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj5.setTag(0);
                    thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj6.setTag(0);
                } else {
                    int tag = (Integer) thisObj.getTag();
                    if (tag == 0){
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                        thisObj.setTag(1);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    } else {
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    }
                }
            }
        });
        thisObj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObj2.getTag() == null) {
                    thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                    thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                    thisObj2.setTag(1);
                    // Disable other options
                    thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj.setTag(0);
                    thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj3.setTag(0);
                    thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj4.setTag(0);
                    thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj5.setTag(0);
                    thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj6.setTag(0);
                } else {
                    int tag = (Integer) thisObj2.getTag();
                    if (tag == 0){
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                        thisObj2.setTag(1);
                        // Disable other options
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    } else {
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        // Disable other options
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    }
                }
            }
        });
        thisObj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObj3.getTag() == null) {
                    thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                    thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                    thisObj3.setTag(1);
                    // Disable other options
                    thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj2.setTag(0);
                    thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj.setTag(0);
                    thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj4.setTag(0);
                    thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj5.setTag(0);
                    thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj6.setTag(0);
                } else {
                    int tag = (Integer) thisObj3.getTag();
                    if (tag == 0){
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                        thisObj3.setTag(1);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    } else {
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    }
                }
            }
        });
        thisObj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObj4.getTag() == null) {
                    thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                    thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                    thisObj4.setTag(1);
                    // Disable other options
                    thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj2.setTag(0);
                    thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj3.setTag(0);
                    thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj.setTag(0);
                    thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj5.setTag(0);
                    thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj6.setTag(0);
                } else {
                    int tag = (Integer) thisObj4.getTag();
                    if (tag == 0){
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                        thisObj4.setTag(1);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    } else {
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    }
                }
            }
        });
        thisObj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObj5.getTag() == null) {
                    thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                    thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                    thisObj5.setTag(1);
                    // Disable other options
                    thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj2.setTag(0);
                    thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj3.setTag(0);
                    thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj4.setTag(0);
                    thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj.setTag(0);
                    thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj6.setTag(0);
                } else {
                    int tag = (Integer) thisObj5.getTag();
                    if (tag == 0){
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                        thisObj5.setTag(1);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    } else {
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                    }
                }
            }
        });
        thisObj6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObj6.getTag() == null) {
                    thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                    thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                    thisObj6.setTag(1);
                    // Disable other options
                    thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj2.setTag(0);
                    thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj3.setTag(0);
                    thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj4.setTag(0);
                    thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj5.setTag(0);
                    thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                    thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                    thisObj.setTag(0);
                } else {
                    int tag = (Integer) thisObj6.getTag();
                    if (tag == 0){
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                        thisObj6.setTag(1);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                    } else {
                        thisObj6.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj6.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj6.setTag(0);
                        // Disable other options
                        thisObj2.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj2.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj2.setTag(0);
                        thisObj3.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj3.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj3.setTag(0);
                        thisObj4.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj4.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj4.setTag(0);
                        thisObj5.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj5.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj5.setTag(0);
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                        thisObj.setTag(0);
                    }
                }
            }
        });
    }

    CountDownTimer countDownTimer = new CountDownTimer(600000, 1000) {
        public void onTick(long millisUntilFinished) {
            //TODO: Do something every second
        }
        public void onFinish() {
            //finish();
            startActivity(new Intent(question_option.this, language.class));
        }
    }.start();
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            countDownTimer.cancel();
            countDownTimer.start();
        }
        return super.onTouchEvent(event);
    }
}