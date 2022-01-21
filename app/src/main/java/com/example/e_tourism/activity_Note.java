package com.example.e_tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class activity_Note extends AppCompatActivity {
    Toolbar toolbar;
    ImageButton read;
    ImageButton write;
    String userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        toolbar = findViewById(R.id.toolbar_Note);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Note");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        userid= Objects.requireNonNull(getIntent().getExtras()).getString("Pujahoppinh");

        read=(ImageButton) findViewById(R.id.noteread);
        write=(ImageButton) findViewById(R.id.notecrate);

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent gotoread = new Intent(getApplicationContext(),ListNote.class);
                gotoread.putExtra("note2read",userid);
                startActivity(gotoread);

            }
        });

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent gotocreate = new Intent(getApplicationContext(),CreateNote.class);
                gotocreate.putExtra("note2Create",userid);
                startActivity(gotocreate);
            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() ==android.R.id.home);
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
