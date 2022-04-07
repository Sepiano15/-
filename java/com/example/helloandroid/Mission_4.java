package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

public class Mission_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Mission 4");
        setContentView(R.layout.activity_mission_4);
        EditText text_box = (EditText) findViewById(R.id.text_box);
        Button btn_send = (Button) findViewById(R.id.btn_send);
        Button btn_close = (Button) findViewById(R.id.btn_close);
        TextView bites = (TextView) findViewById(R.id.bites);
        
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = text_box.getText().toString();
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
            }
        });

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                byte[] bytes = null;
                try {
                    bytes = charSequence.toString().getBytes("KSC5601"); // 한글 완성형 표준
                    int strCount = bytes.length;
                    bites.setText(strCount + " / 80바이트");
                } catch(UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str = bites.getText().toString();
                if(str.equals("80 / 80바이트")){
                    Toast.makeText(getApplicationContext(), "80바이트 초과", Toast.LENGTH_SHORT).show();
                }
            }
        };
        text_box.addTextChangedListener(textWatcher);
    }
}