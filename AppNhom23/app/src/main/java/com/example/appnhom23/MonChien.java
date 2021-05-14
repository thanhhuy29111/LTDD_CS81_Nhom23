package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MonChien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_chien);

        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;
        ListView listView = findViewById(R.id.listviewDM);
        arrayList = new ArrayList<>();

        arrayList.add(new MonAn("Tôm chiên xù ",R.drawable.chien_tomchienxu));
        arrayList.add(new MonAn("Thịt cuộn phô mai chiên xù",R.drawable.chien_thitcuonchienxu));
        arrayList.add(new MonAn("Hàu chiên xù",R.drawable.chien_hauchienxu));
        arrayList.add(new MonAn("Cá nạc chiên xù",R.drawable.chien_naccachienxu));
        arrayList.add(new MonAn("Sụn gà chiên xù",R.drawable.chien_sungachienxu));
        adapter = new AdapterMonAn(MonChien.this, R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MonChien.this, Chien_tomchienxu.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MonChien.this, Chien_thitcuonchienxu.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MonChien.this, Chien_hauchienxu.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent();
                    intent.setClass(MonChien.this, Chien_naccachienxu.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent();
                    intent.setClass(MonChien.this, Chien_sungachienxu.class);
                    startActivity(intent);
                }
            }
        });
    }
}