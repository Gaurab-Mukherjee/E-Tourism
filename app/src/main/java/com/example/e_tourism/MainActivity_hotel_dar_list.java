package com.example.e_tourism;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_hotel_dar_list extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] mTitle = {"Jain Group Sanderling Resort & Spa", "Summit Hermon Hotel & Spa, Darjeeling", "Sterling Darjeeling - Resorts and Hotels", "Ramada Darjeeling Gandhi Road", "The Elgin, Darjeeling"};
    String[] mStar = {"4-star hotel", "4-star hotel", "4-star hotel", "4-star hotel", "4-star hotel"};
    String[] mReview = {"4.4 Reviews", "4.1 Reviews", "4.3 Reviews", "4.0 Reviews", "4.5 Reviews"};
    String[] mDescription = {"", "Cosy quarters in a relaxed hotel with mountain views, a spa & a restaurant, plus free Wi-Fi.", "Contemporary quarters in a refined hilltop hotel with a restaurant, plus free breakfast & Wi-Fi.", "Low-key hotel with warm rooms, plus an outdoor pool, a gym & a vegetarian restaurant.", "Upmarket hotel in a stately 19th-century venue offering a restaurant, a bar & a spa."};
    String[] mPrice = {"₹6,010", "₹1,997", "₹3,285", "₹4,007", "₹8,400"};
    int[] images = {R.drawable.jain_dar, R.drawable.summit_dar, R.drawable.starling_dar, R.drawable.ramda_dar, R.drawable.eligin_dar,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hotel_dar_list);

        toolbar = findViewById(R.id.toolbar_darjeeling_list);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hotel List");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.darjeeling_listview);

        MyAdapter adapter = new MyAdapter(this, mTitle, mStar, mReview, mDescription, mPrice,images);
        listView.setAdapter(adapter);
        //set item click on list view

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
 @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

                if(position == 0) {
                    //code specific to first list item
                   // Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();

                    Intent appInfo = new Intent(MainActivity_hotel_dar_list.this, darjeeling_jain_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(MainActivity_hotel_dar_list.this, darjeeling_summit_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 2) {

                    Intent appInfo = new Intent(MainActivity_hotel_dar_list.this, darjeeling_sterling_hotel.class);
                    startActivity(appInfo);
                }
                else if(position == 3) {

                    Intent appInfo = new Intent(MainActivity_hotel_dar_list.this, darjeeling_ramda_hotel.class);
                    startActivity(appInfo);
                }
                else if(position == 4) {

                    Intent appInfo = new Intent(MainActivity_hotel_dar_list.this, darjeeling_elgin_hotel.class);
                    startActivity(appInfo);
                }
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) ;
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
