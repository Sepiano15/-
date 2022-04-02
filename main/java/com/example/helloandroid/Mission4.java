package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mission4 extends AppCompatActivity {
    Button btn_Up, btn_Down;
    ImageView img_Up, img_Down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission4);
        setTitle("미션4");
        btn_Up = (Button) findViewById(R.id.btn_Up);
        btn_Down = (Button) findViewById(R.id.btn_Down);
        img_Up = (ImageView) findViewById(R.id.img_Up);
        img_Down = (ImageView) findViewById(R.id.img_Down);
        img_Up.setImageResource(R.drawable.me);
        img_Down.setImageResource(R.drawable.me);

        btn_Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img_Up.setVisibility(View.VISIBLE);
                img_Down.setVisibility(View.INVISIBLE);
            }
        });

        btn_Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img_Down.setVisibility(View.VISIBLE);
                img_Up.setVisibility(View.INVISIBLE);
            }
        });
    }


}