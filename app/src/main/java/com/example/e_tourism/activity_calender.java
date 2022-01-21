package com.example.e_tourism;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class activity_calender extends AppCompatActivity {


    String ofnewyear;
    int twoenddate;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calander);


        toolbar =  findViewById(R.id.toolbar_calender);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Calender");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


            CalendarView calendarView=(CalendarView)findViewById(R.id.cal_cv);
            final TextView textView=(TextView)findViewById(R.id.cal_tv);
            final  TextView textView1 = (TextView)findViewById(R.id.reminder);



            Toast.makeText(getApplicationContext(),"----Tap On Pink Circle----",Toast.LENGTH_SHORT).show();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy");
            String date = simpleDateFormat.format(new Date());
            textView.setText(date);



            calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                @Override
                public void onSelectedDayChange(@NonNull CalendarView view, int i, int i1, int i2)
                {
                    String date= i2 + "/" + (i1 + 1)  + "/" + i ;

                    String dateStr = date;

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date date1 = sdf.parse(dateStr);

//Differance Between two days

                        // System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
                        // textView1.setText("No Of Days Left For Puja : " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
                        int legth = dateStr.length();
                        String sub = dateStr.substring(legth-4,legth);



                        String enddate = "15/10/2018";
                        Date date01 = sdf.parse(enddate);
                        String enddate1 = "03/10/2019";
                        Date date02 = sdf.parse(enddate1);
                        String enddate2 = "21/10/2020";
                        Date date03 = sdf.parse(enddate1);



                        if( date1.after(date01) == true)
                        {
                            String end = "03/10/2019";
                            Date date2 = sdf.parse(end);
                            long diff = date2.getTime() - date1.getTime();
                            textView1.setText("No Of Days Left For Puja [2019] : " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
                        }
                        else if( date1.after(date02)== true )
                        {
                            String end1 = "21/10/2020";
                            Date date21 = sdf.parse(end1);
                            long difff = date21.getTime() - date1.getTime();
                            textView1.setText("No Of Days Left For Puja [2020] : " + TimeUnit.DAYS.convert(difff, TimeUnit.MILLISECONDS));

                        }
                        else
                        {
                            String end = "15/10/2018";
                            Date date2 = sdf.parse(enddate);
                            long diff = date2.getTime() - date1.getTime();
                            textView1.setText("No Of Days Left For Puja [2018] : " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));

                        }














                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
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
    
