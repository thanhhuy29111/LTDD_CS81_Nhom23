package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // dm
        ListView listView;
        ArrayList<DanhMuc> arrayList;
        AdapterDanhMuc adapter;
        // dm
        listView = findViewById(R.id.listviewMA);
        arrayList = new ArrayList<>();

        //dm
        arrayList.add(new DanhMuc("MÓN XÀO",R.drawable.monxao));
        arrayList.add(new DanhMuc("MÓN CHIÊN",R.drawable.monchien));
        arrayList.add(new DanhMuc("MÓN KHO",R.drawable.kho));
        arrayList.add(new DanhMuc("MÓN CHAY",R.drawable.monchay));
        arrayList.add(new DanhMuc("MÓN TRÁNG MIỆNG",R.drawable.montrangmieng));
        adapter = new AdapterDanhMuc(MainActivity.this,R.layout.layout_danhmuc,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,MonXao.class);
                    startActivity(intent);
                }
            }
        });
    }
}