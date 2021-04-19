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

        ListView listView;
        ArrayList<DanhMuc> arrayList;
        AdapterDanhMuc adapter;

        listView = findViewById(R.id.listviewDM);
        arrayList = new ArrayList<>();

        arrayList.add(new DanhMuc("MÓN XÀO",R.drawable.monxao));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.monchien));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.kho));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.monchay));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        arrayList.add(new DanhMuc("Món chiên",R.drawable.montrangmieng));
        adapter = new AdapterDanhMuc(MainActivity.this,R.layout.layout_danhmuc,arrayList);
        listView.setAdapter(adapter);
    }
}