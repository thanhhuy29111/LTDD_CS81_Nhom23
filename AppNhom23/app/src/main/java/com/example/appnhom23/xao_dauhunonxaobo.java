package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class xao_dauhunonxaobo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xao_dauhunonxaobo);
        TextView dhnxb1 = findViewById(R.id.dhnxb1);
        TextView dhnxb2 = findViewById(R.id.dhnxb2);
        TextView dhnxb3 = findViewById(R.id.dhnxb3);
        ImageView dauhunonxaobo = findViewById(R.id.dauhunonxaobo);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

