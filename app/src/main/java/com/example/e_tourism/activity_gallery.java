package com.example.e_tourism;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class activity_gallery extends AppCompatActivity {

    ImageButton button;
    ImageButton btn;
  //  ImageView imageView;
   /* ImageButton photoslid;
    ImageButton takephoto;
    String userid;*/

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        toolbar = findViewById(R.id.toolbar_calender);
        //imageView = (ImageView) findViewById(R.id.viewtakenphoto);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Gallery");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = (ImageButton) findViewById(R.id.camera);
        btn = findViewById(R.id.photogal);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentake_photo();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               open_gall();

            }
        });
    }

    public void open_gall(){
        startActivity(new Intent(getApplicationContext(), MainActivity_gallery_of_phone.class));
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) ;
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


    public void opentake_photo() {
        Intent intent = new Intent(this, TakePhoto.class);
        startActivity(intent);
    }

}

       /* userid= Objects.requireNonNull(getIntent().getExtras()).getString("gallery");

        photoslid=(ImageButton)findViewById(R.id.photogal);

        takephoto=(ImageButton)findViewById(R.id.camera);


//Permission Request Explicty

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)!= PERMISSION_GRANTED)
        {

            ActivityCompat.requestPermissions(activity_gallery.this, new String[]{Manifest.permission.CAMERA}, 1);

        }

        photoslid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go2PHOTOSLIDE = new Intent(getApplicationContext(),ImageShowingpanel.class);
                go2PHOTOSLIDE.putExtra("toslidephoto",userid);
                startActivity(go2PHOTOSLIDE);
            }
        });

        takephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent go2TAKEPHOTO = new Intent(getApplicationContext(),TakePhoto.class);
                go2TAKEPHOTO.putExtra("totakephoto",userid);
                startActivity(go2TAKEPHOTO);

            }
        });



    }*/



