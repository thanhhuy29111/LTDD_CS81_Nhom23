package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class chien_thitcuonphomai extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chien_sungachienxu);
        ImageView htccx =findViewById(R.id.htccx);
        TextView tccx1 = findViewById(R.id.tccx1);
        TextView tccx2 = findViewById(R.id.tccx2);
        TextView tccx3 = findViewById(R.id.tccx3);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
