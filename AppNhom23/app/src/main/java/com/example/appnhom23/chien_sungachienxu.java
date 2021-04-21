package com.example.appnhom23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class chien_sungachienxu extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.chien_sungachienxu);
            ImageView hsgcx =findViewById(R.id.hsgcx);
            TextView sgcx1 = findViewById(R.id.sgcx1);
            TextView sgcx2 = findViewById(R.id.sgcx2);
            TextView sgcx3 = findViewById(R.id.sgcx3);
            Button bt2 = findViewById(R.id.btback2);
            bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
}
