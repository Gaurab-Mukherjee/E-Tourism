package com.example.e_tourism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity_hotel_sundarbans_list extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] mTitle = {"Sunderban Tiger Camp- Wildlife Resort", "Sundarban Residency", "Solitary Nook (Resort & Tourism)"};
    String[] mStar = {"4-star hotel", "3-star hotel", "3-star hotel"};
    String[] mReview = {"4.4 Reviews", "4.1 Reviews", "4.3 Reviews"};
    String[] mDescription = {"Remote resort with rustic accommodations, a bar & a game room, plus included meals & snacks.", "Simple quarters, a dining hall & birdwatching in a low-key resort within Sundarban National Park.", "Simply decorated bungalows in a down-to-earth, all-inclusive resort along a river."};
    String[] mPrice = {"₹6,010", "₹2,600", "₹3,285"};
    int[] images = {R.drawable.wildlife_resort, R.drawable.residency_hotel, R.drawable.nook_hotel};

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

                    Intent appInfo = new Intent(MainActivity_hotel_sundarbans_list.this, sundarban_tigercamp_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(MainActivity_hotel_sundarbans_list.this, sundarban_residency_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 2) {

                    Intent appInfo = new Intent(MainActivity_hotel_sundarbans_list.this, sundarban_nook_hotel.class);
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
