package com.example.e_tourism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Objects;

public class CreateNote extends AppCompatActivity {
    EditText createNOTEdb;
    Spinner selectDOP;
    Spinner selectYEAR;
    ImageButton SaveNOTEdb;
    //String getDop;
    //String getYear;
   // DataBaseHelper notemyDB;
   // FirebaseUser userid;
    //String uid;
    Toolbar toolbar;
    private FirebaseFirestore db;
    static String [] dop = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
    static  String [] year ={"2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        toolbar = findViewById(R.id.toolbar_Note_taking);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Note");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        db = FirebaseFirestore.getInstance();

        createNOTEdb=(EditText)findViewById(R.id.noteedit);
        selectDOP=(Spinner)findViewById(R.id.dopsp);
        selectYEAR=(Spinner)findViewById(R.id.yearsp);
        SaveNOTEdb=(ImageButton)findViewById(R.id.notesave23);
       // notemyDB = new DataBaseHelper(this);

        //Get User Id For Perticuler Cradential From NOTE Activity
       // userid = FirebaseAuth.getInstance().getCurrentUser();
        //uid = userid.getUid();


       // //Using Array Adapter to take array item and insert in Spinner
       ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dop);
        selectDOP.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, year);
        selectYEAR.setAdapter(adapter2);

       // //Get Item Info And Strore In String  from Spinner



        SaveNOTEdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnotes();
            }
        });

    }


    public void addnotes(){

        String notes = createNOTEdb.getText().toString().trim();
        String week_days = selectDOP.getSelectedItem().toString();
        String year_t = selectYEAR.getSelectedItem().toString();
        if(!TextUtils.isEmpty(notes))
        {
            CollectionReference dbNotes = db.collection("notes");
            Notes_db notes_db = new Notes_db(
                    notes,
                    week_days,
                    year_t
            );
            dbNotes.add(notes_db)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(CreateNote.this,"Note Successfully Added", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(CreateNote.this,e.getMessage(), Toast.LENGTH_SHORT).show();

                }
            });

        }
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
