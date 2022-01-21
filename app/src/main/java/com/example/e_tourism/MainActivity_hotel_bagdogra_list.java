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

public class MainActivity_hotel_bagdogra_list extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] mTitle = {"Courtyard by Marriott Siliguri", "Barsana Hotel & Resort", "The Loft Hotel", "Hotel Central Plaza"};
    String[] mStar = {"5-star hotel", "5-star hotel", "3-star hotel","3-star hotel"};
    String[] mReview = {"4.5 Reviews", "4.1 Reviews", "4.3 Reviews","2.5 Reviews"};
    String[] mDescription = {"Understated quarters in a laid-back hotel featuring a restaurant, a bar & an outdoor pool.", "Sophisticated hotel offering free Wi-Fi & breakfast, plus 2 restaurants, a cafe/bar & a bakery.","Unfussy rooms in a laid-back property featuring a casual restaurant & free breakfast.","Restaurant is good for people who dont like spicy food."};
    String[] mPrice = {"₹5,755", "₹2,600", "₹2,796","1,367"};
    int[] images = {R.drawable.courtyrard_suliduri_hotel, R.drawable.barsana_suliguri_hotel, R.drawable.lofr_suliguri_hotel,R.drawable.cetral_plaza_suliguri_hotel};

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

                    Intent appInfo = new Intent(MainActivity_hotel_bagdogra_list.this, siliguri_marriote_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(MainActivity_hotel_bagdogra_list.this, siliguri_barsana_hotel.class);
                    startActivity(appInfo);
                }

                else if(position == 2) {

                    Intent appInfo = new Intent(MainActivity_hotel_bagdogra_list.this, siliguri_loft_hotel.class);
                    startActivity(appInfo);
                }
                else if(position == 3) {

                    Intent appInfo = new Intent(MainActivity_hotel_bagdogra_list.this, siliguri_central_hotel.class);
                    startActivity(appInfo);
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