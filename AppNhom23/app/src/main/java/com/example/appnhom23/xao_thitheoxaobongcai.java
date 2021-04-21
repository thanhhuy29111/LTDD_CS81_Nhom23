package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class xao_thitheoxaobongcai extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xao_thitheoxaobongcai);
        TextView thxbc1 = findViewById(R.id.thxbc1);
        TextView thxbc2 = findViewById(R.id.thxbc2);
        TextView thxbc3 = findViewById(R.id.thxbc3);
        ImageView thitheoxaobongcai = findViewById(R.id.thitheoxaobongcai);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

