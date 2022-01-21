package com.example.e_tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity_hotel_digha_list extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] mTitle = {"Hotel Blue Waves", "Hotel Rohini International", "Hotel Seagull, Digha"};
    String[] mStar = {"5-star hotel", "5-star hotel", "3-star hotel"};
    String[] mReview = {"4.5 Reviews", "4.1 Reviews", "3.9 Reviews"};
    String[] mDescription = {"Neat and clean room....very good ambience...good room service", "Bright rooms with sea views in a low-key hotel offering a restaurant & an outdoor pool.","Simply furnished rooms in an unassuming hotel offering a restaurant with a terrace."};
    String[] mPrice = {"₹3,755", "₹3,600", "₹4,796"};
    int[] images = {R.drawable.blue_digha_hotel, R.drawable.rohini_digha_hotel, R.drawable.saedull_digha_hotel};

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
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {
                    //code specific to first list item
                    // Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();

                    Intent appInfo = new Intent(MainActivity_hotel_digha_list.this, digha_blue_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(MainActivity_hotel_digha_list.this, digha_rohini_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 2) {

                    Intent appInfo = new Intent(MainActivity_hotel_digha_list.this, digha_seagull_hotel.class);
                    startActivity(appInfo);
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
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