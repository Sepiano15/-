package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Project4_1 extends AppCompatActivity {
    EditText edt1,edt2;
    Button btn_Add, btn_Sub, btn_Mul, btn_Div;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project4_1);
        setTitle("초간단 계산기");

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        textResult = (TextView) findViewById(R.id.text_Result);

        btn_Add.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산결과 : " + result.toString());
                return false;
            }
        });

        btn_Sub.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산결과 : " + result.toString());
                return false;
            }
        });

        btn_Mul.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산결과 : " + result.toString());
                return false;
            }
        });

        btn_Div.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산결과 : " + result.toString());
                return false;
            }
        });

    }
}