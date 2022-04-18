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

public class question_mc extends AppCompatActivity {

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

        setContentView(R.layout.activity_question_mc);

        Button btn = (Button) findViewById(R.id.loading);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(question_mc.this, question_option.class));
            }
        });

        TextView backBtn = (TextView) findViewById(R.id.back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button thisObject = (Button) findViewById(R.id.answer0);
        thisObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObject.getTag() == null) {
                    thisObject.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                    thisObject.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                    thisObject.setTag(1);
                } else {
                    int tag = (Integer) thisObject.getTag();
                    if (tag == 0){
                        thisObject.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                        thisObject.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                        thisObject.setTag(1);
                    } else {
                        thisObject.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.disableColor));
                        thisObject.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryTextColor));
                        thisObject.setTag(0);
                    }
                }
            }
        });
        Button thisObject2 = (Button) findViewById(R.id.answer1);
        thisObject2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObject2.getTag() == null) {
                    thisObject2.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                    thisObject2.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                    thisObject2.setTag(1);
                } else {
                    int tag = (Integer) thisObject2.getTag();
                    if (tag == 0){
                        thisObject2.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                        thisObject2.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                        thisObject2.setTag(1);
                    } else {
                        thisObject2.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.disableColor));
                        thisObject2.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryTextColor));
                        thisObject2.setTag(0);
                    }
                }
            }
        });
        Button thisObject3 = (Button) findViewById(R.id.answer2);
        thisObject3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObject3.getTag() == null) {
                    thisObject3.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                    thisObject3.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                    thisObject3.setTag(1);
                } else {
                    int tag = (Integer) thisObject3.getTag();
                    if (tag == 0){
                        thisObject3.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                        thisObject3.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                        thisObject3.setTag(1);
                    } else {
                        thisObject3.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.disableColor));
                        thisObject3.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryTextColor));
                        thisObject3.setTag(0);
                    }
                }
            }
        });
        Button thisObject4 = (Button) findViewById(R.id.answer3);
        thisObject4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObject4.getTag() == null) {
                    thisObject4.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                    thisObject4.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                    thisObject4.setTag(1);
                } else {
                    int tag = (Integer) thisObject4.getTag();
                    if (tag == 0){
                        thisObject4.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                        thisObject4.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                        thisObject4.setTag(1);
                    } else {
                        thisObject4.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.disableColor));
                        thisObject4.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryTextColor));
                        thisObject4.setTag(0);
                    }
                }
            }
        });
        Button thisObject5 = (Button) findViewById(R.id.answer4);
        thisObject5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObject5.getTag() == null) {
                    thisObject5.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                    thisObject5.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                    thisObject5.setTag(1);
                } else {
                    int tag = (Integer) thisObject5.getTag();
                    if (tag == 0){
                        thisObject5.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                        thisObject5.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                        thisObject5.setTag(1);
                    } else {
                        thisObject5.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.disableColor));
                        thisObject5.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryTextColor));
                        thisObject5.setTag(0);
                    }
                }
            }
        });
        Button thisObject6 = (Button) findViewById(R.id.answer5);
        thisObject6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisObject6.getTag() == null) {
                    thisObject6.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                    thisObject6.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                    thisObject6.setTag(1);
                } else {
                    int tag = (Integer) thisObject6.getTag();
                    if (tag == 0){
                        thisObject6.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                        thisObject6.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                        thisObject6.setTag(1);
                    } else {
                        thisObject6.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.disableColor));
                        thisObject6.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryTextColor));
                        thisObject6.setTag(0);
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
            startActivity(new Intent(question_mc.this, language.class));
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