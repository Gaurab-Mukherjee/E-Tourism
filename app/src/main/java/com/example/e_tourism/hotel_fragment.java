package com.example.e_tourism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class hotel_fragment extends Fragment {
    SliderLayout sliderLayout;
    ListView listView;
    List<Booking> bookingList;
    //private ProgressBar progressBar;
    //FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseAuth user;
    //String uid;
    private ProgressBar progressBar;
    //String uid;
   // FirebaseAuth auth;
  //  FirebaseUser user;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);
        listView = (ListView)view.findViewById(R.id.hotel_listview);
        progressBar = view.findViewById(R.id.progressbar_hotel);
        user = FirebaseAuth.getInstance();
       // uid = user.getUid();
        //rootNode = FirebaseDatabase.getInstance();
        reference = FirebaseDatabase.getInstance().getReference().child("Bookings");//.child(uid);
        bookingList = new ArrayList<>();
        sliderLayout = view.findViewById(R.id.img_slider_hotel);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(3);

        setSliderViews();
        return view;



    }

    @Override
    public void onStart() {
        super.onStart();
        //attaching value event listener
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                progressBar.setVisibility(View.GONE);
                //clearing the previous artist list
                bookingList.clear();

                //iterating through all the nodes
                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    //getting artist
                    Booking hotel = ds.getValue(Booking.class);
                    //adding artist to the list
                    bookingList.add(hotel);

                }
                //creating adapter
                BookingList bookingAdapter = new BookingList(hotel_fragment.this, bookingList);
                //attaching adapter to the listview
                listView.setAdapter(bookingAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void setSliderViews() {
        for (int i = 0; i <= 3; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(getActivity().getApplicationContext());

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.off_1);
                    sliderView.setDescription("70% Off on Your First Booking.");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.bigstockphoto.com%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAJ");
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.off_2);
                    sliderView.setDescription("Up to 5000/- Cash Back.");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fhelpx.adobe.com%2Fstock%2Fhow-to%2Fvisual-reverse-image-search.html&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAV");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.off_3);
                    sliderView.setDescription("Easy to Use App.");
                    // sliderView.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fanalyticsindiamag.com%2Flearn-image-classification-using-cnn-in-keras-with-code%2F&psig=AOvVaw20qbPQI8DvjjFKJEp9LdSR&ust=1583901320418000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC8ibCKj-gCFQAAAAAdAAAAABAb");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.off_4);
                    sliderView.setDescription("Thank You");
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