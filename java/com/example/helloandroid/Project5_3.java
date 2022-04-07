package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Project5_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project5_3);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout,params);

        EditText edt = new EditText(this);
        baseLayout.addView(edt);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);

        TextView text_view = new TextView(this);
        text_view.setTextColor(Color.MAGENTA);
        text_view.setTextSize(40);
        baseLayout.addView(text_view);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                String str;
                str=edt.getText().toString();
                text_view.setText(str);
            }
        });
    }
}