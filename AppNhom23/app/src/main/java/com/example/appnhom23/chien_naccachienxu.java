package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class chien_naccachienxu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chien_canacchienxu);
        ImageView hnccx =findViewById(R.id.hncxc);
        TextView nccx1 = findViewById(R.id.nccx1);
        TextView nccx2 = findViewById(R.id.nccx2);
        TextView nccx3 = findViewById(R.id.nccx3);
        Button bt2 = findViewById(R.id.btback2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
