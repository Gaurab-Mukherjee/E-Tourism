package com.example.e_tourism;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

class MyAdapter_home extends ArrayAdapter<String> {

    Context context;
    String sTitle[];
    String sStar[];
    int sImgs[];

    MyAdapter_home(Context c, String title[], String star[], int imgs[]){
        super(c, R.layout.home_listview_row, R.id.text_view_1, title);
        this.context = c;
        this.sTitle = title;
        this.sStar = star;
        this.sImgs = imgs;
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.home_listview_row, parent,false);
        ImageView images = row.findViewById(R.id.image_1_0);
        TextView myTitle = row.findViewById(R.id.text_view_1_0);
        TextView myStar = row.findViewById(R.id.text_view_2_0);

        //  set resources on views

        images.setImageResource(sImgs[position]);
        myTitle.setText(sTitle[position]);
        myStar.setText(sStar[position]);
        return row;
    }

}