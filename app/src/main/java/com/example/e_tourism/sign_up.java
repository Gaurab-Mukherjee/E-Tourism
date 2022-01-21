package com.example.e_tourism;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign_up extends AppCompatActivity implements OnClickListener {
    private EditText User_Name;
    private EditText User_Email;
    private EditText User_DOB;
    private EditText User_Phone;
    private EditText User_Password;
    private EditText User_Confirm_Password;
    private Button button;
     Toolbar toolbar;


    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        firebaseAuth = FirebaseAuth.getInstance();



        //---All The Refarences
        User_Name = (EditText) findViewById(R.id.text2_sign_up);
        User_Email = (EditText) findViewById(R.id.text4_sign_up);
        User_DOB = (EditText) findViewById(R.id.text6_sign_up);
        User_Phone = (EditText) findViewById(R.id.text8_sign_up);
        User_Password = (EditText) findViewById(R.id.text10_sign_up);
        User_Confirm_Password = (EditText) findViewById(R.id.text12_sign_up);
        button = (Button) findViewById(R.id.button_sign_up);
        toolbar = findViewById(R.id.toolbar_sign_up);

        button.setOnClickListener(this);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    private void registeruser() {
        String name= User_Name.getText().toString().trim();
        String email= User_Email.getText().toString().trim();
        String dob= User_DOB.getText().toString().trim();
        String phone= User_Phone.getText().toString().trim();
        String password= User_Password.getText().toString().trim();
        String confirm_password= User_Confirm_Password.getText().toString().trim();

        if(TextUtils.isEmpty(name)) {
            // name is empty
            Toast.makeText(this,"Please enter User Name", Toast.LENGTH_LONG).show();
            //stopping the function from executing further
            return;
        }

        if(TextUtils.isEmpty(email)) {
            // email is empty
            Toast.makeText(this,"Please enter Email", Toast.LENGTH_LONG).show();
            //stopping the function from executing further
            return;
        }
        if(TextUtils.isEmpty(dob)) {
            // DOB is empty
            Toast.makeText(this,"Please enter Date of Birth", Toast.LENGTH_LONG).show();
            //stopping the function from executing further
            return;
        }

        if(TextUtils.isEmpty(phone)) {
            // phone is empty
            Toast.makeText(this,"Please enter Phone No.", Toast.LENGTH_LONG).show();
            //stopping the function from executing further
            return;
        }
        if(TextUtils.isEmpty(password)) {
            // password is empty
            Toast.makeText(this,"Please enter Password", Toast.LENGTH_LONG).show();
            //stopping the function from executing further
            return;
        }
        if(TextUtils.isEmpty(confirm_password)) {
            // Con_Pass is empty
            Toast.makeText(this,"Please enter Password Again", Toast.LENGTH_LONG).show();
            //stopping the function from executing further
            return;
        }
        //if validations are ok
        //we will first show a progressbar

        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            Toast.makeText(sign_up.this,"SignUp is completed...", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(),login.class));
                        }
                    }
                });
    }


    @Override
    public void onClick(View v) {
        //openlogin();
        if (v == button) {
            registeruser();
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

  /*  private void openlogin() {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }*/
}




