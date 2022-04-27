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
    int nextPageID = 4; // Default
    Class nextPageName;

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

        setContentView(R.layout.activity_question_mc);

        // Here nextPageID is changed by data received from DB
        // ...
        // Find next page when new nextPageID is received from DB
        if (nextPageID == 0){
            nextPageName = question_binary.class;
        } else if (nextPageID == 1){
            nextPageName = question_date.class;
        } else if (nextPageID == 2){
            nextPageName = question_daterange.class;
        } else if (nextPageID == 3){
            nextPageName = question_mc.class;
        } else if (nextPageID == 4){
            nextPageName = question_option.class;
        } else if (nextPageID == 5){
            nextPageName = question_text.class;
        } else if (nextPageID == 6){
            nextPageName = signature.class;
        } else if (nextPageID == 7){
            nextPageName = bye.class;
        }
        // The page for testing only
        if (nextPageID == 99){
            nextPageName = question_option2.class;
        } else if (nextPageID == 98) {
            nextPageName = question_option3.class;
        }

        Button btn = (Button) findViewById(R.id.loading);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                finish();
                startActivity(new Intent(question_mc.this, nextPageName));
            }
        });

        TextView backBtn = (TextView) findViewById(R.id.back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                finish();
                startActivity(new Intent(question_mc.this, question_daterange.class));
            }
        });

        int total_resource = 6;
        for (int i=0; i<total_resource; i++) {
            int id = getResources().getIdentifier("answer" + i, "id", getPackageName());
            Button thisObj = (Button) findViewById(id);

            thisObj.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (thisObj.getTag() == null) {
                        thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                        thisObj.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                        thisObj.setTag(1);
                    } else {
                        int tag = (Integer) thisObj.getTag();
                        if (tag == 0){
                            thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryColor));
                            thisObj.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.primaryTextColor));
                            thisObj.setTag(1);
                        } else {
                            thisObj.setBackgroundTintList(ContextCompat.getColorStateList(question_mc.this, R.color.disableColor));
                            thisObj.setTextColor(ContextCompat.getColorStateList(question_mc.this, R.color.secondaryTextColor));
                            thisObj.setTag(0);
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