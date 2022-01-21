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

public class MainActivity_hotel_kol_list extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] mTitle = {"Novotel Kolkata - Hotel & Residences", "Hyatt Regency, Kolkata", "The LaLiT Great Eastern Kolkata", "The Park Hotel", "The Pride Hotel"};
    String[] mStar = {"5-star hotel", "5-star hotel", "5-star hotel", "5-star hotel", "5-star hotel"};
    String[] mReview = {"4.6 Reviews", "4.5 Reviews", "4.4 Reviews", "4.4 Reviews", "4.2 Reviews"};
    String[] mDescription = {"Polished quarters in an upmarket hotel with 2 restaurants, a spa & an outdoor pool.", "Upmarket hotel offering refined quarters & Italian dining, plus an outdoor pool, 2 bars & a spa.", "Polished rooms and suites in an elegant venue offering refined dining, a spa & an outdoor pool.", "Low-key hotel with warm rooms, plus an outdoor pool, a gym & a vegetarian restaurant.", "Informal business hotel with an outdoor pool, a spa & 24-hour buffet dining."};
    String[] mPrice = {"₹6,720", "₹6,406", "₹6,967", "₹4,695", "₹4,690"};
    int[] images = {R.drawable.novotel_kol, R.drawable.hyatt_kol, R.drawable.lalit_kol, R.drawable.park_kol, R.drawable.pride_kol,};

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

        kol_listview adapter = new kol_listview(this, mTitle, mStar, mReview, mDescription, mPrice,images);
        listView.setAdapter(adapter);
        //set item click on list view

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {
                    //code specific to first list item
                    // Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();

                    Intent appInfo = new Intent(MainActivity_hotel_kol_list.this, kolkata_Novotel_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(MainActivity_hotel_kol_list.this, kolkata_hyatt_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 2) {

                    Intent appInfo = new Intent(MainActivity_hotel_kol_list.this, kolkata_lalit_hotel.class);
                    startActivity(appInfo);
                }
                else if(position == 3) {

                    Intent appInfo = new Intent(MainActivity_hotel_kol_list.this, kolkata_park_hotel.class);
                    startActivity(appInfo);
                }
                else if(position == 4) {

                    Intent appInfo = new Intent(MainActivity_hotel_kol_list.this, kolkata_pride_hotel.class);
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