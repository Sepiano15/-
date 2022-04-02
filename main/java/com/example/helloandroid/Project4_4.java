package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class Project4_4 extends AppCompatActivity {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch check1;
    TextView text1,text2;
    RadioGroup radioGroup;
    RadioButton rbtn1,rbtn2,rbtn3;
    Button btn_Exit, btn_Re;
    ImageView image;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project4_4);
        setTitle("안드로이드 사진보기");
        check1 = (Switch) findViewById(R.id.check1);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton)findViewById(R.id.rbtn2);
        rbtn3 = (RadioButton)findViewById(R.id.rbtn3);
        btn_Exit = (Button) findViewById(R.id.btn_Exit);
        btn_Re = (Button) findViewById(R.id.btn_Re);
        image = (ImageView) findViewById(R.id.image);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.rbtn1) {
                    image.setImageResource(R.drawable.q1);
                } else if(i == R.id.rbtn2) {
                    image.setImageResource(R.drawable.r1);
                } else {
                    image.setImageResource(R.drawable.s1);
                }
            }
        });

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if(checked) {
                    text2.setVisibility(android.view.View.VISIBLE);
                    radioGroup.setVisibility(android.view.View.VISIBLE);
                    btn_Exit.setVisibility(android.view.View.VISIBLE);
                    btn_Re.setVisibility(android.view.View.VISIBLE);
                    image.setVisibility(android.view.View.VISIBLE);
                } else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    radioGroup.setVisibility(android.view.View.INVISIBLE);
                    btn_Exit.setVisibility(android.view.View.INVISIBLE);
                    btn_Re.setVisibility(android.view.View.INVISIBLE);
                    image.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });


        btn_Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true); // 태스크를 백그라운드로 이동
                finishAndRemoveTask(); // 액티비티 종료 + 태스크 리스트에서 지우기

                System.exit(0);
            }
        });

        btn_Re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2.setVisibility(android.view.View.INVISIBLE);
                radioGroup.setVisibility(android.view.View.INVISIBLE);
                btn_Exit.setVisibility(android.view.View.INVISIBLE);
                btn_Re.setVisibility(android.view.View.INVISIBLE);
                image.setVisibility(android.view.View.INVISIBLE);
                check1.setChecked(false);
            }
        });
    }
}


