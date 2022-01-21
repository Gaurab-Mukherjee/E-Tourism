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

public class MainActivity_hotel_mirik extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] mTitle = {"Allita Hotels & Resorts", "Chamong Chiabari - Mountain Retreat & Spa", "The Cochrane Place"};
    String[] mStar = {"4-star hotel", "3-star hotel", "3-star hotel"};
    String[] mReview = {"4.9 Reviews", "4.1 Reviews", "4.2 Reviews"};
    String[] mDescription = {"Airy quarters, some with mountain views, in a relaxed hotel featuring a restaurant, a cafe & a spa.", "Behavior, service, food quality and room too good","Warm rooms in a quaint hotel at the foot of the Himalayas, plus a restaurant & a spa."};
    String[] mPrice = {"₹5,880", "₹13,600", "₹4,796","1,367"};
    int[] images = {R.drawable.allita_hotel_mirik, R.drawable.chamong_hotel_mirik, R.drawable.cochrane_hotel_mirik};

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

                    Intent appInfo = new Intent(MainActivity_hotel_mirik.this, mirik_allite.class);
                    startActivity(appInfo);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(MainActivity_hotel_mirik.this, mirik_chamong_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 2) {

                    Intent appInfo = new Intent(MainActivity_hotel_mirik.this, mirik_palace_hotel.class);
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