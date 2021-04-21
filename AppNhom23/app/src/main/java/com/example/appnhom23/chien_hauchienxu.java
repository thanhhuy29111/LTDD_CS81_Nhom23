package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class chien_hauchienxu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chien_hauchienxu);
        ImageView hhcx =findViewById(R.id.hhcx);
        TextView hcx1 = findViewById(R.id.hcx1);
        TextView hcx2 = findViewById(R.id.hcx2);
        TextView hcx3 = findViewById(R.id.hcx3);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
