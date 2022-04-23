package com.example.smartformandroid;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class question_binary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        setContentView(R.layout.activity_question_binary);

        Button btn = (Button) findViewById(R.id.loading);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                finish();
                startActivity(new Intent(question_binary.this, question_mc.class));
            }
        });

        TextView backBtn = (TextView) findViewById(R.id.back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                finish();
                startActivity(new Intent(question_binary.this, select.class));
            }
        });

        int total_resource = 2;
        for (int i=0; i<total_resource; i++) {
            // Retrieve ID dynamically
            int id = getResources().getIdentifier("answer_binary"+i, "id", getPackageName());
            Button thisObj = (Button) findViewById(id); // Get the element

            // Set event to the element
            thisObj.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (thisObj.getTag() == null) {
                        // Disable all options
                        for (int i=0; i<total_resource; i++) {
                            int id = getResources().getIdentifier("answer_binary"+i, "id", getPackageName());
                            Button obj = (Button) findViewById(id);
                            obj.setBackgroundTintList(ContextCompat.getColorStateList(question_binary.this, R.color.disableColor));
                            obj.setTextColor(ContextCompat.getColorStateList(question_binary.this, R.color.secondaryTextColor));
                            obj.setTag(0);
                        }

                        // Color the clicked option
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_binary.this, R.color.secondaryColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_binary.this, R.color.primaryTextColor));
                        thisObj.setTag(1);
                    } else {
                        int tag = (Integer) thisObj.getTag();
                        if (tag == 0){
                            // Disable all options
                            for (int i=0; i<total_resource; i++) {
                                int id = getResources().getIdentifier("answer_binary"+i, "id", getPackageName());
                                Button obj = (Button) findViewById(id);
                                obj.setBackgroundTintList(ContextCompat.getColorStateList(question_binary.this, R.color.disableColor));
                                obj.setTextColor(ContextCompat.getColorStateList(question_binary.this, R.color.secondaryTextColor));
                                obj.setTag(0);
                            }

                            // Color the clicked option
                            thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_binary.this, R.color.secondaryColor));
                            thisObj.setTextColor(ContextCompat.getColorStateList(question_binary.this, R.color.primaryTextColor));
                            thisObj.setTag(1);
                        } else {
                            // Disable all options
                            for (int i=0; i<total_resource; i++) {
                                int id = getResources().getIdentifier("answer_binary"+i, "id", getPackageName());
                                Button obj = (Button) findViewById(id);
                                obj.setBackgroundTintList(ContextCompat.getColorStateList(question_binary.this, R.color.disableColor));
                                obj.setTextColor(ContextCompat.getColorStateList(question_binary.this, R.color.secondaryTextColor));
                                obj.setTag(0);
                            }
                        }
                    }
                }
            });
        }
    }

    CountDownTimer countDownTimer = new CountDownTimer(600000, 1000) {
        public void onTick(long millisUntilFinished) {
            //TODO: Do something every second
        }
        public void onFinish() {
            countDownTimer.cancel();
            finish();
            startActivity(new Intent(question_binary.this, language.class));
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