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

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

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
                countDownTimer.cancel();
                finish();
                startActivity(new Intent(question_option.this, question_text.class));
            }
        });

        TextView backBtn = (TextView) findViewById(R.id.back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                finish();
                startActivity(new Intent(question_option.this, question_mc.class));
            }
        });

        int total_resource = 6;
        for (int i=0; i<total_resource; i++) {
            // Retrieve ID dynamically
            int id = getResources().getIdentifier("answer_option"+i, "id", getPackageName());
            Button thisObj = (Button) findViewById(id); // Get the element

            // Set event to the element
            thisObj.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (thisObj.getTag() == null) {
                        // Disable all options
                        for (int i=0; i<total_resource; i++) {
                            int id = getResources().getIdentifier("answer_option"+i, "id", getPackageName());
                            Button obj = (Button) findViewById(id);
                            obj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                            obj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                            obj.setTag(0);
                        }

                        // Color the clicked option
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                        thisObj.setTag(1);
                    } else {
                        int tag = (Integer) thisObj.getTag();
                        if (tag == 0){
                            // Disable all options
                            for (int i=0; i<total_resource; i++) {
                                int id = getResources().getIdentifier("answer_option"+i, "id", getPackageName());
                                Button obj = (Button) findViewById(id);
                                obj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                                obj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
                                obj.setTag(0);
                            }

                            // Color the clicked option
                            thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.secondaryColor));
                            thisObj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.primaryTextColor));
                            thisObj.setTag(1);
                        } else {
                            // Disable all options
                            for (int i=0; i<total_resource; i++) {
                                int id = getResources().getIdentifier("answer_option"+i, "id", getPackageName());
                                Button obj = (Button) findViewById(id);
                                obj.setBackgroundTintList(ContextCompat.getColorStateList(question_option.this, R.color.disableColor));
                                obj.setTextColor(ContextCompat.getColorStateList(question_option.this, R.color.secondaryTextColor));
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