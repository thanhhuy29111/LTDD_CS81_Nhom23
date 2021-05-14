package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MonChay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_chay);

        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;
        ListView listView = findViewById(R.id.listviewDM);
        arrayList = new ArrayList<>();

        arrayList.add(new MonAn("Đậu hũ non sốt nấm tươi",R.drawable.chay_dauhunonsotnamtuoi));
        arrayList.add(new MonAn("Đậu phụ cuộn lá lốt",R.drawable.chay_dauphucuonlalot));
        arrayList.add(new MonAn("Gỏi cuốn ngũ sắc",R.drawable.chay_goicuonngusac));
        arrayList.add(new MonAn("Nem chay",R.drawable.chay_nemchay));
        arrayList.add(new MonAn("Rau cuộn chay",R.drawable.chay_raucuonchay));
        adapter = new AdapterMonAn(MonChay.this, R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MonChay.this, Chay_dauhunonsotnamtuoi.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MonChay.this, Chay_dauphucuonlalot.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MonChay.this, Chay_goicuonngusac.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent();
                    intent.setClass(MonChay.this, Chay_nemchay.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent();
                    intent.setClass(MonChay.this, Chay_raucuonchay.class);
                    startActivity(intent);
                }
            }
        });
    }
}