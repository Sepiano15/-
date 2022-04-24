package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Mission8_Md extends AppCompatActivity {



    Button mmenuButton;
    Button mloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission8_md);

        mmenuButton = findViewById(R.id.mmenuButton);
        mloginButton = findViewById(R.id.mloginButton);

        mmenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission8_Menu.class);
                startActivity(intent);
                finish();
            }
        });

        mloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission8_Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}