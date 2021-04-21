package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class xao_raumuongxaotoi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xao_raumuongxaotoi);
        TextView rmxt1 = findViewById(R.id.rmxt1);
        TextView rmxt2 = findViewById(R.id.rmxt2);
        TextView rmxt3 = findViewById(R.id.rmxt3);
        ImageView raumuonxaotoi = findViewById(R.id.raumuongxaotoi);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
