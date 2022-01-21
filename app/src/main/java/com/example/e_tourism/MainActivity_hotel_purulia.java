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

public class MainActivity_hotel_purulia extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] mTitle = {"Spangle Wings Resort", "Panchet Residency", "Hotel Akash Sarovar"};
    String[] mStar = {"3-star hotel", "3-star hotel", "3-star hotel"};
    String[] mReview = {"4.9 Reviews", "4.1 Reviews", "4.2 Reviews"};
    String[] mDescription = {"No-frills rooms & a basic dorm in a laid-back hotel offering a straightforward restaurant.", "Bright huts & simple cottages on 6 lush hectares offering fishing & hiking, plus hill views.","Simple rooms, some with lake views, in a low-key hotel offering a restaurant, a bar & a coffee shop."};
    String[] mPrice = {"₹4,932", "₹4,410", "₹3,440"};
    int[] images = {R.drawable.spangle_hotel_purulia, R.drawable.panchet_hotel_purulia, R.drawable.akash_hotel_purulia};

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

                    Intent appInfo = new Intent(MainActivity_hotel_purulia.this, sangle_purulia.class);
                    startActivity(appInfo);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(MainActivity_hotel_purulia.this, panchet_purulia.class);
                    startActivity(appInfo);
                }

                else if(position == 2) {

                    Intent appInfo = new Intent(MainActivity_hotel_purulia.this, akash_purulia.class);
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