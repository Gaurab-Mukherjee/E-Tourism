package com.example.e_tourism;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BookingList extends ArrayAdapter<Booking> {
    private hotel_fragment context;
    List<Booking> bookingList;

    public BookingList(hotel_fragment context, List<Booking> bookingList) {
       super(context.getActivity(), R.layout.list_layout_hotel, bookingList);
        this.context = context;
        this.bookingList = bookingList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout_hotel, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.first_name_fetch);
        TextView textViewType = (TextView) listViewItem.findViewById(R.id.hotel_details);
        TextView textViewCheck_in = (TextView) listViewItem.findViewById(R.id.checkin);
        TextView textViewCheck_out = (TextView) listViewItem.findViewById(R.id.checkin2);


        Booking hotel = bookingList.get(position);
        textViewName.setText(hotel.getGuestFullName());
        textViewType.setText(hotel.getGuestSelect());
        textViewCheck_in.setText(hotel.getGuestCheckIn());
        textViewCheck_out.setText(hotel.getGuestCheckOut());

        return listViewItem;
    }


}