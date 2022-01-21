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

public class MainActivity_hotel_coch_beher extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] mTitle = {"Hotel Dooars Mountain", "Pal Lodge", "Hotel B.D"};
    String[] mStar = {"4-star hotel", "3-star hotel", "3-star hotel"};
    String[] mReview = {"3.0 Reviews", "3.5 Reviews", "3.5 Reviews"};
    String[] mDescription = {"Casual rooms & suites in a straightforward hotel featuring a bar & an international restaurant.", "No-frills rooms with cable TV in a functional property offering a restaurant & event space.","Specially foods are delicious with resonable price."};
    String[] mPrice = {"₹3,086", "₹5,600", "₹5,796"};
    int[] images = {R.drawable.dooars_hotel_coochbehar, R.drawable.pal_hotel_cooch_behar, R.drawable.hotel_bd_cochbehar};

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

                    Intent appInfo = new Intent(MainActivity_hotel_coch_beher.this, dooars_coch.class);
                    startActivity(appInfo);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(MainActivity_hotel_coch_beher.this, pal_coch.class);
                    startActivity(appInfo);
                }

                else if(position == 2) {

                    Intent appInfo = new Intent(MainActivity_hotel_coch_beher.this, bd_coch.class);
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