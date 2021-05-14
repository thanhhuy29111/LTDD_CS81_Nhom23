package com.example.appnhom23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TrangMieng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_mieng);

        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;
        ListView listView = findViewById(R.id.listviewDM);
        arrayList = new ArrayList<>();

        arrayList.add(new MonAn("Bí đỏ hầm đường",R.drawable.trangmieng_bidohamduong));
        arrayList.add(new MonAn("Dừa hấp tuyết yến",R.drawable.trangmieng_duahaptuyetyen));
        arrayList.add(new MonAn("Hoa quả tráng miệng",R.drawable.trangmieng_hoaquatrangmieng));
        arrayList.add(new MonAn("Kem chuối",R.drawable.trangmieng_kemchuoi));
        arrayList.add(new MonAn("Yaourt bơ trái cây",R.drawable.trangmieng_yaourtbotraicay));
        adapter = new AdapterMonAn(TrangMieng.this, R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(TrangMieng.this, TrangMieng_bidohamduong.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(TrangMieng.this, TrangMieng_duahaptuyetyen.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(TrangMieng.this, TrangMieng_hoaquatrangmieng.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent();
                    intent.setClass(TrangMieng.this, TrangMieng_kemchuoi.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent();
                    intent.setClass(TrangMieng.this,TrangMieng_yaourtbotraicay.class);
                    startActivity(intent);
                }
            }
        });
    }
}