package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kho_catramkhorieng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Kho_catramkhorieng);
        TextView ctkr1 = findViewById(R.id.ctkr1);
        TextView ctkr2 = findViewById(R.id.ctkr2);
        TextView ctkr3 = findViewById(R.id.ctkr3);
        ImageView ctkr = findViewById(R.id.ctkr);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}