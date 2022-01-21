package com.example.e_tourism;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

public class help_adapter extends ArrayAdapter {

    Context context;
    String sname[];
    String sphone[];
    ImageButton callbt;

    help_adapter(Context c, String name[], String phone[], ImageButton call) {
        super(c, R.layout.help_customlayout, R.id.SOSname, name);

        this.context = c;
        this.sname = name;
        this.sphone = phone;
        this.callbt = call;
    }

    @NonNull
    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.help_customlayout, parent, false);
        ImageButton btn = (ImageButton) row.findViewById(R.id.call_btn);
        TextView myname = row.findViewById(R.id.SOSname);
        TextView myphone = row.findViewById(R.id.SOSphone);




        //For Calling To Click On Item{List Of The Contact]

       row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    Toast.makeText(getContext(),"Please Grant Permission",Toast.LENGTH_LONG);

                    return;
                }
                else {
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + sphone[position]));
                    getContext().startActivity(intent);
                }

            }
        });

        //For Calling to Click On Button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + sphone[position]));
                if (ActivityCompat.checkSelfPermission(getContext(),Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    Toast.makeText(getContext(),"Please Grant Permission",Toast.LENGTH_LONG);
                    return;
                }
                getContext().startActivity(intent);
            }
        });

        myname.setText(sname[position]);
        myphone.setText(sphone[position]);

        return row;
    }

}