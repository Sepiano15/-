package com.example.helloandroid;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Mission8_Custom extends AppCompatActivity {


    Button cmenuButton;
    Button cloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission8_custom);

        cmenuButton = findViewById(R.id.cmenuButton);
        cloginButton = findViewById(R.id.cloginButton);

        cmenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission8_Menu.class);
                startActivity(intent);
                finish();
            }
        });

        cloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission8_Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}