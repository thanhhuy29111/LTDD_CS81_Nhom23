package com.example.appnhom23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class AdapterDanhMuc extends BaseAdapter {
    private Context context;
    private int layout;
    private List<DanhMuc> arraylist;

    public AdapterDanhMuc(Context context, int layout, List<DanhMuc> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout,null);

        DanhMuc danhMuc= arraylist.get(position);

        // anh xa
        ImageView imageV = convertView.findViewById(R.id.imageHinhDM);


        imageV.setImageResource(danhMuc.getHinh());

        return convertView;
    }
}
