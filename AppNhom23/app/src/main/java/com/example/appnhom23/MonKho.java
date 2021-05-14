package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MonKho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_kho);

        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;
        ListView listView = findViewById(R.id.listviewDM);
        arrayList = new ArrayList<>();

        arrayList.add(new MonAn("Nghêu kho tộ ",R.drawable.kho_ngheukhoto));
        arrayList.add(new MonAn("Cá kho tộ",R.drawable.kho_cakhoto));
        arrayList.add(new MonAn("Cá trám kho riềng",R.drawable.kho_catramkhorieng));
        arrayList.add(new MonAn("Sườn kho dứa",R.drawable.kho_suonkhodua));
        arrayList.add(new MonAn("Thịt kho tàu",R.drawable.kho_thitkhotau));
        adapter = new AdapterMonAn(MonKho.this, R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MonKho.this, Kho_ngheukhoto.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MonKho.this, Kho_cakhoto.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MonKho.this, Kho_catramkhorieng.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent();
                    intent.setClass(MonKho.this, Kho_suonkhodua.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent();
                    intent.setClass(MonKho.this, Kho_thitkhotau.class);
                    startActivity(intent);
                }
            }
        });
    }
}