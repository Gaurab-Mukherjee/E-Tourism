package com.example.e_tourism;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.Snackbar;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class Helpline extends AppCompatActivity {
    public String [] name = {"Police","Fire Brigade","Ambulance"," Lalbazar Police Station","West Bengal Control Room","Traffic Control Room","Central Blood Bank","Hemophilia Society Blood Bank","Calcutta Medical College"," SSKM Hospital","FIRE STATION HEAD OFFICE","Chief Minister of West Bengal Office:","Kolkata Municiapal Corporation","Kolkata Electricity Department","Water Department","General Post Office (G.P.O)","Dead animals Removal","Woman Helpline","Sinor Citizen Helplinw"};
    public String [] phone = {"100","101","102","03322143230","03322215486","03322143644","03323510619","03324163739","03322414904","03322236026","03322440101","03322145555","1600333375","03322373161","03322373161","03322201451","03322445112","1091","9830088884"};
    ImageButton callbutt;
    ListView lvforhelp;
    ImageButton info;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);

        info = findViewById(R.id.inforhelp);

//Extranel permission
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PERMISSION_GRANTED)
        {
            Toast.makeText(this,"Please Grant the permission to call",Toast.LENGTH_LONG).show();
            requestPermissions();

        }

        lvforhelp= (ListView) findViewById(R.id.lvhelpline);

        help_adapter adapter = new help_adapter(this,name,phone,callbutt);
        lvforhelp.setAdapter(adapter);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(v, "If Your Call Not Place : Goto > Setting > Trun on The Permission", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }

    private void requestPermissions()
    {
        ActivityCompat.requestPermissions(Helpline.this, new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
    }
}
