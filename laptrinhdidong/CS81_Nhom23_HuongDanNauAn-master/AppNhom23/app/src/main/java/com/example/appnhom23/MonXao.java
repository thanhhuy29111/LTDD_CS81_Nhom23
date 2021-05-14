package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MonXao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_xao);

        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;
        ListView listView = findViewById(R.id.listviewDM);
        arrayList = new ArrayList<>();

        arrayList.add(new MonAn("Mực xào rau củ",R.drawable.xao_mucxaoraucu));
        arrayList.add(new MonAn("Rau muống xào tỏi",R.drawable.xao_raumuongxaotoi));
        arrayList.add(new MonAn("Thịt bò xào đậu hũ",R.drawable.xao_thitboxaodauhu));
        arrayList.add(new MonAn("Thịt heo xào bông cải",R.drawable.xao_thitheoxaobaocai));
        adapter = new AdapterMonAn(MonXao.this, R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MonXao.this, Xao_mucxaoraucu.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MonXao.this, Xao_raumuongxaotoi.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MonXao.this, Xao_Thitboxaodauhu.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent();
                    intent.setClass(MonXao.this, Xao_thitheoxaobongcai.class);
                    startActivity(intent);
                }
            }
        });
    }
}