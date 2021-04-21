package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kho_thitkhotau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Kho_thitkhotau);
        TextView tkt1 = findViewById(R.id.tkt1);
        TextView tkt2 = findViewById(R.id.tkt2);
        TextView tkt3 = findViewById(R.id.tkt3);
        ImageView tkt = findViewById(R.id.tkt);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}