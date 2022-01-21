package com.example.e_tourism;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class fragment_cab extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cab, container, false);


        Button button = (Button) view.findViewById(R.id.btn_ola);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity().getApplicationContext(),"Make Sure Data Connection On",Toast.LENGTH_SHORT).show();
                Intent launchIntent = getActivity().getPackageManager().getLaunchIntentForPackage("com.olacabs.customer");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }else
                {
                    Uri uri = Uri.parse("market://details?id=com.olacabs.customer");
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=com.olacabs.customer")));
                    }
                }
            }
        });
        Button btn = (Button) view.findViewById(R.id.btn_uber);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity().getApplicationContext(),"Make Sure Data Connection On",Toast.LENGTH_SHORT).show();
                Intent launchIntent = getActivity().getPackageManager().getLaunchIntentForPackage("com.ubercab");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }else
                {
                    Uri uri = Uri.parse("market://details?id=com.ubercab");
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=com.ubercab")));
                    }
                }
            }
        });
        return view;
    }


}
