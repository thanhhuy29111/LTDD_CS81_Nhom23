package com.example.huongdannauan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MiXao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_xao);
        TextView mx1 = findViewById(R.id.mx1);
        TextView mx2 = findViewById(R.id.mx2);
        TextView mx3 = findViewById(R.id.mx3);
        TextView mx4 = findViewById(R.id.mx4);
        TextView mx5 = findViewById(R.id.mx5);
        TextView mx6 = findViewById(R.id.mx6);
        TextView mx7 = findViewById(R.id.mx7);
        TextView mx8 = findViewById(R.id.mx8);
        TextView mx9 = findViewById(R.id.mx9);
        TextView mx10 = findViewById(R.id.mx10);
        TextView mx11 = findViewById(R.id.mx11);
        TextView mx12 = findViewById(R.id.mx12);
        TextView mx13 = findViewById(R.id.mx13);
        TextView mx14 = findViewById(R.id.mx14);
        TextView mx15 = findViewById(R.id.mx15);
        TextView mx16 = findViewById(R.id.mx16);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}