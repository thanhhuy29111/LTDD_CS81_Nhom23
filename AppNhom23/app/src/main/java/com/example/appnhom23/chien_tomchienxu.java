package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class chien_tomchienxu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chien_tomchienxu);
        ImageView htcx =findViewById(R.id.htcx);
        TextView tcx1 = findViewById(R.id.tcx1);
        TextView tcx2 = findViewById(R.id.tcx2);
        TextView tcx3 = findViewById(R.id.tcx3);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
