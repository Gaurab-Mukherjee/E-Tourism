package com.example.e_tourism;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class manjusa_hotel extends AppCompatActivity {
    private Button button;
    private Button btn;
    Toolbar toolbar;
    SliderLayout sliderLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_munjusa_hotel);

        toolbar = findViewById(R.id.toolbar_manjusa_hotel);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hotels");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        sliderLayout = findViewById(R.id.img_manjusa_hotel);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(3);

        setSliderViews();

        button = (Button) findViewById(R.id.booking_btn_manjusa);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openbooking_page();
            }
        });
        btn = (Button) findViewById(R.id.web_site_btn_manjusa);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://www.google.com/travel/hotels/Murshidabad/entity/ChcIi-SJ5pqco7dLGgsvZy8xdjZwMnB0eBAB/overview?g2lb=2502548%2C4258168%2C4260007%2C4270442%2C4274032%2C4305595%2C4306835%2C4317915%2C4328159%2C4329288%2C4364504%2C4366684%2C4371334%2C4373849%2C4381263%2C4385383%2C4386665%2C4395397%2C4395402%2C4395589%2C4270859%2C4284970%2C4291517%2C4316256%2C4356900&hl=en&gl=in&un=1&rp=CjMqFgoHCOQPEAcYBxIHCOQPEAcYCxgEIAGaARgKCS9tLzAzeDlubhILTXVyc2hpZGFiYWQ4AQ&ictx=1&hotel_mode=1&sa=X&utm_campaign=sharing&utm_medium=link&utm_source=htls&hrf=CgUI6hcQACIDSU5SKhYKBwjkDxAHGAcSBwjkDxAHGAsYBCABOASwAQBYAWgBmgEYCgkvbS8wM3g5bm4SC011cnNoaWRhYmFkogEYCgkvbS8wM3g5bm4SC011cnNoaWRhYmFkqgELCgMI4QISAghjGAGSAQIgAQ&ap=MAFadAoFCOoXEAAiA0lOUioWCgcI5A8QBxgHEgcI5A8QBxgLGAQgAbABAFgBaAGaARgKCS9tLzAzeDlubhILTXVyc2hpZGFiYWSiARgKCS9tLzAzeDlubhILTXVyc2hpZGFiYWSqAQsKAwjhAhICCGMYAZIBAiAB");
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=cris.org.in.prs.ima&hl=en_IN")));
                    }
                }
            }
        });
    }

    public void openbooking_page() {
        Intent intent = new Intent(this, booking_hotel_MainActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() ==android.R.id.home);
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void setSliderViews() {
        for (int i = 0; i <= 3; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.manjusa_hotel1);
                    sliderView.setDescription("Picture One");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.bigstockphoto.com%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAJ");
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.manjusa_hotel2);
                    sliderView.setDescription("Picture Two");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fhelpx.adobe.com%2Fstock%2Fhow-to%2Fvisual-reverse-image-search.html&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAV");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.manjusa_hotel3);
                    sliderView.setDescription("Picture Three");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fanalyticsindiamag.com%2Flearn-image-classification-using-cnn-in-keras-with-code%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAb");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.manjusa_hotel_murshidabad);
                    sliderView.setDescription("Picture Four");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            // sliderView.setDescription("setDescription " + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(manjusa_hotel.this, "This is slider" + (finalI + 1), Toast.LENGTH_SHORT).show();

                }
            });
            sliderLayout.addSliderView(sliderView);
        }
    }


}