package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class xao_mucxaoraucu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xao_mucxaoraucu);
        TextView mxrc1 = findViewById(R.id.mxrc1);
        TextView mxrc2 = findViewById(R.id.mxrc2);
        TextView mxrc3 = findViewById(R.id.mxrc3);
        ImageView mucxaoraucu = findViewById(R.id.mucxaoraucu);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
