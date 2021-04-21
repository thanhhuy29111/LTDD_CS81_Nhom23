package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class xao_mixao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xao_mixao);
        TextView mx1 = findViewById(R.id.mx1);
        TextView mx2 = findViewById(R.id.mx2);
        TextView mx3 = findViewById(R.id.mx3);
        ImageView mixao = findViewById(R.id.mixao);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}