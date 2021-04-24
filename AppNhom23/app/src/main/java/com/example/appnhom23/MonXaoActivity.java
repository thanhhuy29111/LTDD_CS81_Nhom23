package com.example.appnhom23;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MonXaoActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<MonAn> arrayList;
    AdapterMonAn adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AnhXa();
        addMon();
        adapter = new AdapterMonAn(MonXaoActivity.this,R.layout.layout_monan,arrayList);
        listview.setAdapter(adapter);
    }

    private void AnhXa(){
        listview = findViewById(R.id.listMA);
    }
    private void addMon(){
        arrayList.add(new MonAn("a","",R.drawable.xao_mixao));
        arrayList.add(new MonAn("b","",R.drawable.Xao_dauhunonxaobo));
        arrayList.add(new MonAn("c","",R.drawable.Xao_mucxaoraucu));
        arrayList.add(new MonAn("d","",R.drawable.Xao_raumuongxaotoi));
        arrayList.add(new MonAn("e","",R.drawable.Xao_thitheoxaobongcai));
    }
}
