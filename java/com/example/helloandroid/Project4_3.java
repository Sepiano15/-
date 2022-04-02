package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Project4_3 extends AppCompatActivity {
    EditText edt1,edt2;
    Button btn_Add, btn_Sub, btn_Mul, btn_Div, btn_Rest;
    TextView textResult;
    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project4_3);
        setTitle("초간단 계산기");

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Rest = (Button) findViewById(R.id.btn_Rest);
        textResult = (TextView) findViewById(R.id.text_Result);

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                if(num1.equals("") | num2.equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }

            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                if(num1.equals("") | num2.equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                if(num1.equals("") | num2.equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                if(num1.equals("") | num2.equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else if(num2.equals("0")){
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });

        btn_Rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                if(num1.equals("") | num2.equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });

    }
}