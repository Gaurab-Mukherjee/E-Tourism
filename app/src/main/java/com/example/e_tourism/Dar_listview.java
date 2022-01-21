package com.example.e_tourism;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

class MyAdapter extends ArrayAdapter<String> {

    Context context;
    String rTitle[];
    String rStar[];
    String rReview[];
    String rDescription[];
    String rPrice[];
    int rImgs[];

    MyAdapter (Context c, String title[], String star[],String review[], String description[],String price[], int imgs[]){
        super(c, R.layout.dar_listview_row, R.id.text_view_1, title);
        this.context = c;
        this.rTitle = title;
        this.rStar = star;
        this.rReview = review;
        this.rDescription=description;
        this.rPrice = price;
        this.rImgs = imgs;
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.dar_listview_row, parent,false);
        ImageView images = row.findViewById(R.id.image_1);
        TextView myTitle = row.findViewById(R.id.text_view_1);
        TextView myStar = row.findViewById(R.id.text_view_2);
        TextView myReview = row.findViewById(R.id.text_view_3);
        TextView myDescription = row.findViewById(R.id.text_view_4);
        TextView myPrice = row.findViewById(R.id.text_view_5);

        //  set resources on views

        images.setImageResource(rImgs[position]);
        myTitle.setText(rTitle[position]);
        myStar.setText(rStar[position]);
        myReview.setText(rReview[position]);
        myDescription.setText(rDescription[position]);
        myPrice.setText(rPrice[position]);
        return row;
    }
}