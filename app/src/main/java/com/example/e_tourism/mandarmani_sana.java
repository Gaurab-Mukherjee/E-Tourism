package com.example.e_tourism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class mandarmani_sana extends AppCompatActivity {
    private Button btn,button;
    Toolbar toolbar;
    SliderLayout sliderLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandarmani_sana);

        toolbar = findViewById(R.id.toolbar_sana_city_hotel);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hotels");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        sliderLayout = findViewById(R.id.img_sana_city_hotel);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(3);

        setSliderViews();

        button = (Button) findViewById(R.id.booking_btn_sana_city);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openbooking_page();
            }
        });
        btn = (Button) findViewById(R.id.web_site_btn_sana_city);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("http://www.mandarmonihotels.com/");
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
        for (int i = 0; i <= 7; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.sana_mandar);
                    sliderView.setDescription("Welcome to our Hotel");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.bigstockphoto.com%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAJ");
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.sana_mandar1);
                    sliderView.setDescription("Beautiful Design");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fhelpx.adobe.com%2Fstock%2Fhow-to%2Fvisual-reverse-image-search.html&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAV");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.sana_mandar2);
                    sliderView.setDescription("Top class Restaurant");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fanalyticsindiamag.com%2Flearn-image-classification-using-cnn-in-keras-with-code%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAb");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.sana_mandar3);
                    sliderView.setDescription("Best bed view");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.sana_mandar4);
                    sliderView.setDescription("Lovely view's");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 5:
                    sliderView.setImageDrawable(R.drawable.sana_mandar5);
                    sliderView.setDescription("Biggest Restaurant");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 6:
                    sliderView.setImageDrawable(R.drawable.sana_mandar6);
                    sliderView.setDescription("Most clean hotel");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 7:
                    sliderView.setImageDrawable(R.drawable.sana_mandar7);
                    sliderView.setDescription("Most clean hotel");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            // sliderView.setDescription("setDescription " + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(mandarmani_sana.this, "This is slider" + (finalI + 1), Toast.LENGTH_SHORT).show();

                }
            });
            sliderLayout.addSliderView(sliderView);
        }
    }


}