package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Chien_thitcuonchienxu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thitcuonchienxu);
        TextView textView2=findViewById(R.id.tv2);
        TextView textView1=findViewById(R.id.tv1);
        ImageView imageView1=findViewById(R.id.hinh);
        TextView textView10=findViewById(R.id.tv10);

        Button button=findViewById(R.id.btback);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}