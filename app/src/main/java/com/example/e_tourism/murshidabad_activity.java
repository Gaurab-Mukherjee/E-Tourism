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

public class murshidabad_activity extends AppCompatActivity {
    Button Things_to_do_1_digha;
    Button Things_to_do_2_digha;
    Button Things_to_do_3_digha;
    Button Things_to_do_4_digha;
    Button Things_to_do_5_digha;
    Button g_btn_map_digha;
    Button hotel_btn_digha;
    Toolbar toolbar;
    SliderLayout sliderLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.murshidabad_activity);
        Things_to_do_1_digha = (Button) findViewById(R.id.Things_to_do_1_murshidabad);
        Things_to_do_2_digha = (Button) findViewById(R.id.Things_to_do_2_murshidabad);
        Things_to_do_3_digha = (Button) findViewById(R.id.Things_to_do_3_murshidabad);
        Things_to_do_4_digha = (Button) findViewById(R.id.Things_to_do_4_murshidabad);
        Things_to_do_5_digha = (Button) findViewById(R.id.Things_to_do_5_murshidabad);
        g_btn_map_digha = (Button) findViewById(R.id.plan_a_map_murshidabad);
        hotel_btn_digha = (Button) findViewById(R.id.hotel_btn_murshidabad);
        toolbar = findViewById(R.id.toolbar_murshidabad);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Murshidabad");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        sliderLayout = findViewById(R.id.img_murshidabad);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();

        Things_to_do_1_digha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Hazarduari_Palace");
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


        Things_to_do_2_digha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Nizamat_Imambara");
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

        Things_to_do_3_digha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Katra_Masjid");
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

        Things_to_do_4_digha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Motijhil");
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

        Things_to_do_5_digha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://www.tripadvisor.in/Attraction_Review-g2287525-d10256699-Reviews-Motijheel_Park-Murshidabad_Murshidabad_District_West_Bengal.html");
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


        hotel_btn_digha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                open_hotel_list();
            }
        });

        //
        g_btn_map_digha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.maps.android");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("geo:24.174815, 88.279910");
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=com.googlemap.customer")));
                    }
                }
            }
        });

    }

    public void open_hotel_list() {
        Intent intent = new Intent(this, MainActivity_hotel_murshidabad.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) ;
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


    private void setSliderViews() {
        for (int i = 0; i <= 6; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.murshidabad_1);
                    sliderView.setDescription("Picture One");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.bigstockphoto.com%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAJ");
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.murshidabad_2);
                    sliderView.setDescription("Picture Two");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fhelpx.adobe.com%2Fstock%2Fhow-to%2Fvisual-reverse-image-search.html&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAV");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.murshidabad_3);
                    sliderView.setDescription("Picture Three");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fanalyticsindiamag.com%2Flearn-image-classification-using-cnn-in-keras-with-code%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAb");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.murshidabad_4);
                    sliderView.setDescription("Picture Four");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.murshidabad_5);
                    sliderView.setDescription("Picture Five");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 5:
                    sliderView.setImageDrawable(R.drawable.murshidabad_6);
                    sliderView.setDescription("Picture Six");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 6:
                    sliderView.setImageDrawable(R.drawable.murshidabad_7);
                    sliderView.setDescription("Picture Seven");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            // sliderView.setDescription("setDescription " + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(murshidabad_activity.this, "This is slider" + (finalI + 1), Toast.LENGTH_SHORT).show();

                }
            });
            sliderLayout.addSliderView(sliderView);

        }
    }
}