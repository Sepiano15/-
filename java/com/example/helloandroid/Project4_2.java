package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Project4_2 extends AppCompatActivity {
    CheckBox check1;
    TextView text1,text2;
    RadioGroup radioGroup;
    RadioButton rbtn1,rbtn2,rbtn3;
    Button btn1;
    ImageView image;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project4_2);
        setTitle("애완동물 사진보기");
        check1 = (CheckBox) findViewById(R.id.check1);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton)findViewById(R.id.rbtn2);
        rbtn3 = (RadioButton)findViewById(R.id.rbtn3);
        btn1 = (Button) findViewById(R.id.btn1);
        image = (ImageView) findViewById(R.id.image);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                switch(radioGroup.getCheckedRadioButtonId()) {
                    case R.id.rbtn1 :
                        image.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rbtn2 :
                        image.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rbtn3 :
                        image.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(check1.isChecked() == true) {
                    text2.setVisibility(android.view.View.VISIBLE);
                    radioGroup.setVisibility(android.view.View.VISIBLE);
                    btn1.setVisibility(android.view.View.VISIBLE);
                    image.setVisibility(android.view.View.VISIBLE);
                } else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    radioGroup.setVisibility(android.view.View.INVISIBLE);
                    btn1.setVisibility(android.view.View.INVISIBLE);
                    image.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });
    }
}


