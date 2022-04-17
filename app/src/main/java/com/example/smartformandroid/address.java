package com.example.smartformandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class address extends AppCompatActivity {

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

        setContentView(R.layout.activity_address);

        LottieAnimationView btn = (LottieAnimationView) findViewById(R.id.loading);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(address.this, address_confirm.class));
            }
        });
    }

    CountDownTimer countDownTimer = new CountDownTimer(300000, 1000) {
        public void onTick(long millisUntilFinished) {
            //TODO: Do something every second
        }
        public void onFinish() {
            //finish();
            startActivity(new Intent(address.this, language.class));
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