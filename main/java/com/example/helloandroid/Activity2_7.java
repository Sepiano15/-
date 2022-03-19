package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity2_7 extends AppCompatActivity {
    EditText edit;
    Button btn2, btn3;
    RadioGroup rg;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_7);

        edit = (EditText) findViewById(R.id.editText);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        img = (ImageView) findViewById(R.id.imageView);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edit.getText().toString();
                Toast.makeText(getApplicationContext(), text,
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edit.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(text));
                startActivity(intent);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                String result;
                if(checkedId == R.id.radioButton){
                    img.setImageResource(R.drawable.num1);
                }
                else if(checkedId == R.id.radioButton2){
                    img.setImageResource(R.drawable.num2);
                }
            }
        });
    }
}