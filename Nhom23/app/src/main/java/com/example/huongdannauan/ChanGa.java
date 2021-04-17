package com.example.huongdannauan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChanGa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chan_ga);
        TextView c1 = findViewById(R.id.c1);
        TextView c2 = findViewById(R.id.c2);
        TextView c3 = findViewById(R.id.c3);
        TextView c4 = findViewById(R.id.c4);
        TextView c5 = findViewById(R.id.c5);
        TextView c6 = findViewById(R.id.c6);
        TextView c7 = findViewById(R.id.c7);
        TextView c8 = findViewById(R.id.c8);
        TextView c9 = findViewById(R.id.c9);
        TextView c10 = findViewById(R.id.c10);
        TextView c11 = findViewById(R.id.c11);
        Button bt3 = findViewById(R.id.btback3);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}