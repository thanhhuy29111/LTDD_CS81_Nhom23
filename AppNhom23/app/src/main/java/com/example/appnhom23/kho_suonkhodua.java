package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kho_suonkhodua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Kho_suonkhodua);
        TextView skd1 = findViewById(R.id.skd1);
        TextView skd2 = findViewById(R.id.skd2);
        TextView skd3 = findViewById(R.id.skd3);
        ImageView skd = findViewById(R.id.skd);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}