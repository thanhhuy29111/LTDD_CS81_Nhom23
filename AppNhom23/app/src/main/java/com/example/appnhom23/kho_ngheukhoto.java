package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kho_ngheukhoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Kho_ngheukhoto);
        TextView nkt1 = findViewById(R.id.nkt1);
        TextView nkt2 = findViewById(R.id.nkt2);
        TextView nkt3 = findViewById(R.id.nkt3);
        ImageView nkt = findViewById(R.id.nkt);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}