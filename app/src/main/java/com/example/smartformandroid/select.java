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
import android.widget.ScrollView;

public class select extends AppCompatActivity {

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

        setContentView(R.layout.activity_select);

        Button btn = (Button) findViewById(R.id.confirm_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                finish();
                startActivity(new Intent(select.this, question_mc.class));
            }
        });

        Button btn_gov = (Button) findViewById(R.id.gov_form);
        Button btn_com = (Button) findViewById(R.id.com_form);
        ScrollView gov_form = (ScrollView) findViewById(R.id.scroll_view_gov);
        ScrollView com_form = (ScrollView) findViewById(R.id.scroll_view_com);
        btn_gov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_gov.setBackgroundTintList(ContextCompat.getColorStateList(select.this, R.color.secondaryColor));
                btn_gov.setTextColor(ContextCompat.getColorStateList(select.this, R.color.primaryTextColor));
                btn_com.setBackgroundTintList(ContextCompat.getColorStateList(select.this, R.color.disableColor));
                btn_com.setTextColor(ContextCompat.getColorStateList(select.this, R.color.secondaryTextColor));

                gov_form.setVisibility(View.VISIBLE);
                com_form.setVisibility(View.INVISIBLE);
            }
        });
        btn_com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_gov.setBackgroundTintList(ContextCompat.getColorStateList(select.this, R.color.disableColor));
                btn_gov.setTextColor(ContextCompat.getColorStateList(select.this, R.color.secondaryTextColor));
                btn_com.setBackgroundTintList(ContextCompat.getColorStateList(select.this, R.color.secondaryColor));
                btn_com.setTextColor(ContextCompat.getColorStateList(select.this, R.color.primaryTextColor));

                gov_form.setVisibility(View.INVISIBLE);
                com_form.setVisibility(View.VISIBLE);
            }
        });
    }

    CountDownTimer countDownTimer = new CountDownTimer(600000, 1000) {
        public void onTick(long millisUntilFinished) {
            //TODO: Do something every second
        }
        public void onFinish() {
            countDownTimer.cancel();
            finish();
            startActivity(new Intent(select.this, language.class));
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