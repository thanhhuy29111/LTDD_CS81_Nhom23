package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kho_cakhoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Kho_cakhoto);
        TextView ckt1 = findViewById(R.id.ckt1);
        TextView ckt2 = findViewById(R.id.ckt2);
        TextView ckt3 = findViewById(R.id.ckt3);
        ImageView ckt = findViewById(R.id.ckt);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}