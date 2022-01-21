package com.example.e_tourism;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class booking_hotel_MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText etDate;
    EditText tvDate;
    EditText editName;
    EditText editemail;
    EditText editAddress;
    EditText editDob;
    Spinner coloredSpinner;
    Button btncontinue;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseUser user;
    String uid;

    // DatePickerDialog setListener;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_hotel_main);



        this.etDate = (EditText) findViewById(R.id.txt_checkin);
        this.tvDate = (EditText) findViewById(R.id.txt_checkout);
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(1);
        final int month = calendar.get(2);
        final int day = calendar.get(5);

        this.etDate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(booking_hotel_MainActivity.this,R.style.DatePicker, new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        int month2 = month + 1;
                        StringBuilder sb = new StringBuilder();
                        sb.append(day);
                        sb.append("/");
                        sb.append(month2);
                        sb.append("/");
                        sb.append(year);
                        booking_hotel_MainActivity.this.etDate.setText(sb.toString());
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        //

        Calendar calendar1 = Calendar.getInstance();
        final int year1 = calendar1.get(1);
        final int month1 = calendar1.get(2);
        final int day1 = calendar1.get(5);

        this.tvDate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(booking_hotel_MainActivity.this,R.style.DatePicker, new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker view, int year1, int month1, int day1) {
                        int month2 = month1 + 1;
                        StringBuilder sb = new StringBuilder();
                        sb.append(day1);
                        sb.append("/");
                        sb.append(month2);
                        sb.append("/");
                        sb.append(year1);
                        booking_hotel_MainActivity.this.tvDate.setText(sb.toString());
                    }
                }, year1, month1, day1);
                datePickerDialog.show();
            }
        });


        //

        coloredSpinner = findViewById(R.id.select);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                R.array.Spinner_items,
                R.layout.color_spinner_layout
        );
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        coloredSpinner.setAdapter(adapter);


        //

        toolbar = findViewById(R.id.toolbar_darjeeling_jain_hotel);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Enter yours booking details");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editName = (EditText) findViewById(R.id.txt_name);
        editemail = (EditText) findViewById(R.id.txt_name1);
        editAddress = (EditText) findViewById(R.id.txt_name2);
        editDob = (EditText) findViewById(R.id.txt_name3);
        btncontinue = (Button)findViewById(R.id.angry_booking);

        user = FirebaseAuth.getInstance().getCurrentUser();
        uid = user.getUid();
        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("Bookings");

        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reference.setValue("Store");
                addbooking();
            }
        });

    }



    private  void addbooking(){
        String first_name = editName.getText().toString().trim();
        String email = editemail.getText().toString().trim();
        String address = editAddress.getText().toString().trim();
        String dob = editDob.getText().toString().trim();
        String select = coloredSpinner.getSelectedItem().toString();
        String check_in = etDate.getText().toString().trim();
        String check_out = tvDate.getText().toString().trim();

       if(!TextUtils.isEmpty(first_name)){
               // String uid = reference.push().getKey();

                Booking booking = new Booking(uid, first_name, email, address,dob,select,check_in,check_out);

           reference.child(uid).setValue(booking);

                Toast.makeText(this, "Your Booking is Confirmed", Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(this,"You should enter a Full Name",Toast.LENGTH_SHORT).show();
        }

        if(!TextUtils.isEmpty(email)){

        }else {
            Toast.makeText(this,"You should enter a Email",Toast.LENGTH_SHORT).show();
        }

        if(!TextUtils.isEmpty(address)){

        }else {
            Toast.makeText(this,"You should enter your Address",Toast.LENGTH_SHORT).show();
        }

        if(!TextUtils.isEmpty(dob)){

        }else {
            Toast.makeText(this,"You should enter your Date of Birth",Toast.LENGTH_SHORT).show();
        }

        if(!TextUtils.isEmpty(check_in)){

        }else {
            Toast.makeText(this,"You should enter your Check-in Date",Toast.LENGTH_SHORT).show();
        }
        if(!TextUtils.isEmpty(check_out)){

        }else {
            Toast.makeText(this,"You should enter your Check-out Date",Toast.LENGTH_SHORT).show();
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
