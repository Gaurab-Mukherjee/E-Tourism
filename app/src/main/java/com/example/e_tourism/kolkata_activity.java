package com.example.e_tourism;

import androidx.annotation.DrawableRes;
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

public class kolkata_activity extends AppCompatActivity {
    Button Things_to_do_1_kolkata;
    Button Things_to_do_2_kolkata;
    Button Things_to_do_3_kolkata;
    Button Things_to_do_4_kolkata;
    Button Things_to_do_5_kolkata;
    Button g_btn_map_kolkata;
    Button hotel_btn_kolkata;
    Toolbar toolbar;
    SliderLayout sliderLayout;

    //SliderLayout sliderLayout2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kolkata_activity);


        Things_to_do_1_kolkata = (Button) findViewById(R.id.Things_to_do_1_kolkata);
        Things_to_do_2_kolkata = (Button) findViewById(R.id.Things_to_do_2_kolkata);
        Things_to_do_3_kolkata = (Button) findViewById(R.id.Things_to_do_3_kolkata);
        Things_to_do_4_kolkata = (Button) findViewById(R.id.Things_to_do_4_kolkata);
        Things_to_do_5_kolkata = (Button) findViewById(R.id.Things_to_do_5_kolkata);
        g_btn_map_kolkata = (Button) findViewById(R.id.plan_a_map_kolkata);
        hotel_btn_kolkata = (Button) findViewById(R.id.hotel_btn_kolkata);
        toolbar = findViewById(R.id.toolbar_kolkata);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Kolkata");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        sliderLayout = findViewById(R.id.img_kolkata);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();

        Things_to_do_1_kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Victoria_Memorial,_Kolkata");
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


        Things_to_do_2_kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Howrah_Bridge");
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

        Things_to_do_3_kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Dakshineswar_Kali_Temple");
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

        Things_to_do_4_kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://indianmuseumkolkata.org/");
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

        Things_to_do_5_kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.irctc.train");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Kalighat");
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


        hotel_btn_kolkata.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                open_hotel_list();
            }
        });

        //
        g_btn_map_kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Make Sure Data Connection On", Toast.LENGTH_SHORT).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.maps.android");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    Uri uri = Uri.parse("geo:27.031509,88.250941");
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
        Intent intent = new Intent(this, MainActivity_hotel_kol_list.class);
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
        for (int i = 0; i <= 16; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.kol_1);
                    sliderView.setDescription("Picture One");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.bigstockphoto.com%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAJ");
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.kol_2);
                    sliderView.setDescription("Picture Two");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fhelpx.adobe.com%2Fstock%2Fhow-to%2Fvisual-reverse-image-search.html&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAV");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.kol_3);
                    sliderView.setDescription("Picture Three");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fanalyticsindiamag.com%2Flearn-image-classification-using-cnn-in-keras-with-code%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAb");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.kol_4);
                    sliderView.setDescription("Picture Four");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.kol_5);
                    sliderView.setDescription("Picture Five");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 5:
                    sliderView.setImageDrawable(R.drawable.kol_6);
                    sliderView.setDescription("Picture Six");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 6:
                    sliderView.setImageDrawable(R.drawable.kol_7);
                    sliderView.setDescription("Picture Seven");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 7:
                    sliderView.setImageDrawable(R.drawable.kol_8);
                    sliderView.setDescription("Picture Eight");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 8:
                    sliderView.setImageDrawable(R.drawable.kol_9);
                    sliderView.setDescription("Picture Nine");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 9:
                    sliderView.setImageDrawable(R.drawable.kol_10);
                    sliderView.setDescription("Picture Ten");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 10:
                    sliderView.setImageDrawable(R.drawable.kol_11);
                    sliderView.setDescription("Picture Eleven");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 11:
                    sliderView.setImageDrawable(R.drawable.kol_12);
                    sliderView.setDescription("Picture 12");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 12:
                    sliderView.setImageDrawable(R.drawable.kol_13);
                    sliderView.setDescription("Picture 13");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 13:
                    sliderView.setImageDrawable(R.drawable.kol_14);
                    sliderView.setDescription("Picture 14");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 14:
                    sliderView.setImageDrawable(R.drawable.kol_15);
                    sliderView.setDescription("Picture 15");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 15:
                    sliderView.setImageDrawable(R.drawable.kol_15);
                    sliderView.setDescription("Picture 16");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
                case 16:
                    sliderView.setImageDrawable(R.drawable.kol_16);
                    sliderView.setDescription("Picture 17");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            // sliderView.setDescription("setDescription " + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(kolkata_activity.this, "This is slider" + (finalI + 1), Toast.LENGTH_SHORT).show();

                }
            });

            sliderLayout.addSliderView(sliderView);


        }
    }
}
