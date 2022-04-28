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
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class select extends AppCompatActivity {

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

        setContentView(R.layout.activity_select);

        Button btn = (Button) findViewById(R.id.confirm_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isChecked = false;
                // Array List
                //ArrayList<String> arrayList = new ArrayList<>();
                //arrayList.add("anArrayItem");
                //arrayList.addAll(arrayList2);
                //arrayList.remove("anArrayItem");
                //arrayList.removeAll(arrayList2);
                //arrayList.clear();
                //arrayList.get(0) // Return "anArrayItem"
                //int a = arrayList.indexOf("anArrayItem"); // Return 0
                //int i = arrayList.size();
                //boolean b = arrayList.contains("anArrayItem"); // b = true
                //boolean empty = arrayList.isEmpty(); // empty = false
                // Array
                String[] arrayList = new String[] {
                        "select_checkbox_gov",
                        "select_checkbox_gov2",
                        "select_checkbox_ngo",
                        "select_checkbox_cha",
                        "select_checkbox_gov_gov",
                        "select_checkbox_gov_gov2",
                        "select_checkbox_ngo_ngo",
                        "select_checkbox_cha_cha"
                };
                ArrayList<String> arrayList2 = new ArrayList<>();
                // Adding an Array into an Array List
                arrayList2.addAll(Arrays.asList(arrayList));
                for (String size: arrayList2) {
                    int ID = getResources().getIdentifier(size, "id", getPackageName());
                    if (((CheckBox) findViewById(ID)).isChecked()) {
                        isChecked = true;
                        System.out.println("isChecked ok"); // Or log.t("TAG", "MSG")
                        break;
                    }
                }

                if (isChecked) {
                    countDownTimer.cancel();
                    startActivity(new Intent(select.this, selected.class));
                } else {
                    Toast.makeText(select.this, "Please select form(s)", Toast.LENGTH_SHORT).show();
                }
            }
        });

        int total_resource = 4;
        for (int i=0; i<total_resource; i++) {
            String category = "";
            if (i == 0){
                category = "all";
            } else if (i == 1){
                category = "gov";
            } else if (i == 2){
                category = "ngo";
            } else if (i == 3){
                category = "cha";
            }

            int id_btn = getResources().getIdentifier(category + "_form", "id", getPackageName());
            Button thisBtn = (Button) findViewById(id_btn);
            int id_form = getResources().getIdentifier("scroll_view_" + category, "id", getPackageName());
            ScrollView thisForm = (ScrollView) findViewById(id_form);

            thisBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int i=0; i<total_resource; i++) {
                        String category = "";
                        if (i == 0){
                            category = "all";
                        } else if (i == 1){
                            category = "gov";
                        } else if (i == 2){
                            category = "ngo";
                        } else if (i == 3){
                            category = "cha";
                        }

                        int id_btn = getResources().getIdentifier(category + "_form", "id", getPackageName());
                        Button otherBtns = (Button) findViewById(id_btn);

                        otherBtns.setBackgroundTintList(ContextCompat.getColorStateList(select.this, R.color.disableColor));
                        otherBtns.setTextColor(ContextCompat.getColorStateList(select.this, R.color.secondaryTextColor));
                    }

                    thisBtn.setBackgroundTintList(ContextCompat.getColorStateList(select.this, R.color.secondaryColor));
                    thisBtn.setTextColor(ContextCompat.getColorStateList(select.this, R.color.primaryTextColor));

                    for (int i=0; i<total_resource; i++) {
                        String category = "";
                        if (i == 0){
                            category = "all";
                        } else if (i == 1){
                            category = "gov";
                        } else if (i == 2){
                            category = "ngo";
                        } else if (i == 3){
                            category = "cha";
                        }

                        int id_form = getResources().getIdentifier("scroll_view_" + category, "id", getPackageName());
                        ScrollView otherForms = (ScrollView) findViewById(id_form);

                        otherForms.setVisibility(View.INVISIBLE);
                    }

                    thisForm.setVisibility(View.VISIBLE);
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