package com.example.e_tourism;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

import static com.android.volley.VolleyLog.TAG;

public class fragment_home extends Fragment {
    // ViewGroup rootViewA;
    // private ImageButton home_darjeeling;

    SliderLayout sliderLayout;
    ListView listView1;
    //ArrayList<String> stringArrayList = new ArrayList<>();
   // ArrayAdapter<String> adapter1;
    MyAdapter_home adapter1;
    String[] nTitle = {"Darjeeling", "Kolkata", "Sundarbans", "Kalimpong", "Siliguri", "Bagdogra","Digha","Mirik","Mandarmani","Purulia","Cooch Behar","Murshidabad"};
    String[] nStar = {"Indian hill town known for tea plantations, Himalayan views & \"Toy Train\" narrow-gauge railway.", "West Bengal capital home to Mother Teresa's tomb, British-colonial architecture & art galleries.", "Huge forest & nature reserve with tigers", "Durpin Monastery & MacFarlane Church", "Northeast Indian city known for Surya Sen Park, North Bengal Science Centre & Salugara Monastery","27 Aug – 3 Sep suggested for good value","Coastal Indian resort town, with Old Digha Beach, MARC aquarium & the Chandaneswar Shiv Temple.","Lakes, orchards, monasteries, and gardens","Beaches and seaside resorts","Forests, ecotourism, lakes, and temples","Palaces, history, and architecture","History, tombs, palaces, gardens, and temples"};
    int[] imag = {R.drawable.darjeeling_1, R.drawable.kol_1, R.drawable.sundarbans_1, R.drawable.kalimpong__1, R.drawable.siliguri_1, R.drawable.bagdogra_1, R.drawable.digha_1,R.drawable.mirik_1,R.drawable.mandarmani_1,R.drawable.purulia_2,R.drawable.cooch_behar_1,R.drawable.murshidabad_1};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //


        sliderLayout = view.findViewById(R.id.img_slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();


        listView1 = view.findViewById(R.id.home_listview);

        adapter1 = new MyAdapter_home(getContext(), nTitle, nStar, imag);
        listView1.setAdapter(adapter1);
        //set item click on list view


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    //code specific to first list item
                    // Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();

                    Intent appInfo = new Intent(getContext(), Darjeeling_activity.class);
                    startActivity(appInfo);
                } else if (position == 1) {
                    //code specific to 2nd list item
                    Intent appInfo = new Intent(getContext(), kolkata_activity.class);
                    startActivity(appInfo);
                } else if (position == 2) {

                    //code specific to 3nd list item
                    Intent appInfo = new Intent(getContext(), sundarbans_acitivity.class);
                    startActivity(appInfo);
                } else if (position == 3) {

                    Intent appInfo = new Intent(getContext(), kalimpong_acitivity.class);
                    startActivity(appInfo);
                } else if (position == 4) {

                    Intent appInfo = new Intent(getContext(), siliguri_activity.class);
                    startActivity(appInfo);
                }

                else if (position == 5) {

                    Intent appInfo = new Intent(getContext(), bagdogra_activity.class);
                    startActivity(appInfo);
                }

                else if (position == 6) {

                    Intent appInfo = new Intent(getContext(), Digha_activity.class);
                    startActivity(appInfo);
                }
                else if (position == 7) {

                    Intent appInfo = new Intent(getContext(), mirik_acitivity.class);
                    startActivity(appInfo);
                }
                else if (position == 8) {

                    Intent appInfo = new Intent(getContext(), mandarmani_acitivity.class);
                    startActivity(appInfo);
                }

                else if (position == 9) {

                    Intent appInfo = new Intent(getContext(), purulia_activity.class);
                    startActivity(appInfo);
                }
                else if (position == 10) {

                    Intent appInfo = new Intent(getContext(), cooch_behar_acitivity.class);
                    startActivity(appInfo);
                }
                else if (position == 11) {

                    Intent appInfo = new Intent(getContext(), murshidabad_activity.class);
                    startActivity(appInfo);
                }

            }
        });

        return view;
    }



    public void onCreateOptionsMenu (Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.home__main, menu);
        // Associate searchable configuration with the SearchView
        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type here to Search");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter1.getFilter().filter(newText);
                return true;
            }
        });
        super.onCreateOptionsMenu(menu, inflater);
    }



    private void setSliderViews () {
            for (int i = 0; i <= 3; i++) {
                DefaultSliderView sliderView = new DefaultSliderView(getActivity().getApplicationContext());

                switch (i) {
                    case 0:
                        sliderView.setImageDrawable(R.drawable.pic_1);
                        sliderView.setDescription("Beauty Of West Bengal");
                        // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.bigstockphoto.com%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAJ");
                        break;
                    case 1:
                        sliderView.setImageDrawable(R.drawable.pic_2);
                        sliderView.setDescription("Dakshineswar kali Temple");
                        // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fhelpx.adobe.com%2Fstock%2Fhow-to%2Fvisual-reverse-image-search.html&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAV");
                        break;
                    case 2:
                        sliderView.setImageDrawable(R.drawable.pic_3);
                        sliderView.setDescription("Pure Nature");
                        // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fanalyticsindiamag.com%2Flearn-image-classification-using-cnn-in-keras-with-code%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAb");
                        break;
                    case 3:
                        sliderView.setImageDrawable(R.drawable.pic_5);
                        sliderView.setDescription("Howrah Bridge");
                        // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAm");
                        break;
                }
                sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
                // sliderView.setDescription("setDescription " + (i + 1));
                final int finalI = i;
                sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                    @Override
                    public void onSliderClick(SliderView sliderView) {
                        Toast.makeText(getActivity().getApplicationContext(), "This is slider" + (finalI + 1), Toast.LENGTH_SHORT).show();

                    }
                });

                sliderLayout.addSliderView(sliderView);
            }

        }

    }
