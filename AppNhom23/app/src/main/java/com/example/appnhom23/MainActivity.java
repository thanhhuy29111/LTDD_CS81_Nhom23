package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
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
        // mon an
        ListView listViewMA;
        ArrayList<MonAn> arrayListMA;
        AdapterDanhMuc adapterMA;

        // dm
        listView = findViewById(R.id.listviewDM);
        arrayList = new ArrayList<>();

        // mon an
        listViewMA = findViewById(R.id.listviewMonAn);
        arrayListMA = new ArrayList<>();

        //dm
        arrayList.add(new DanhMuc("MÓN XÀO",R.drawable.monxao));
        arrayList.add(new DanhMuc("MÓN CHIÊN",R.drawable.monchien));
        arrayList.add(new DanhMuc("MÓN KHO",R.drawable.kho));
        arrayList.add(new DanhMuc("MÓN CHAY",R.drawable.monchay));
        arrayList.add(new DanhMuc("MÓN TRÁNG MIỆNG",R.drawable.montrangmieng));
        adapter = new AdapterDanhMuc(MainActivity.this,R.layout.layout_danhmuc,arrayList);
        listView.setAdapter(adapter);

        //mon an
    }
}