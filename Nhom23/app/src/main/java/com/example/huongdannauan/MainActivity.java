package com.example.huongdannauan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview;
        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;

        listview = findViewById(R.id.listviewmonan);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("Sườn xào chua ngọt","",R.drawable.suonchuangot));
        arrayList.add(new MonAn("Mì xào gà","",R.drawable.mixao));
        arrayList.add(new MonAn("Chân gà nướng","",R.drawable.changa));

        adapter = new AdapterMonAn(MainActivity.this,R.layout.layout_listds,arrayList);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,SuonChuaNgot.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,MiXao.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,ChanGa.class);
                    startActivity(intent);
                }
            }
        });
    }
}