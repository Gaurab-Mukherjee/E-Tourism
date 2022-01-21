package com.example.e_tourism;

import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.preference.PreferenceManager;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.mancj.materialsearchbar.adapter.SuggestionsAdapter;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class home_MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
        FirebaseAuth mAuth;
        FirebaseUser currentUser;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.nav_host_fragment, new fragment_home());
        fragmentTransaction.commit();
        //init

        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();


        setContentView(R.layout.activity_home__main3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_gallery, R.id.nav_calender,
                R.id.nav_note, R.id.nav_service, R.id.nav_helpline, R.id.nav_about_us
                , R.id.nav_home, R.id.navigation_map, R.id.navigation_cab, R.id.navigation_Hotel)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        BottomNavigationView navView = findViewById(R.id.nav_bottom);
        navView.setItemIconTintList(null);


        NavigationUI.setupWithNavController(navView, navController);

        updateNavHeader();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home__main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.logout:
                logoutUser();
                return true;
            case R.id.translate:
                translate();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }



    public void logoutUser()
    {

        SharedPreferences preferences =getSharedPreferences("sharedPrefs",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();
        startActivity(new Intent(getApplicationContext(),login.class));
        Toast.makeText(home_MainActivity.this, "Logout Successfully...", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void translate()
    {
        startActivity(new Intent(getApplicationContext(), TextTranslationActivity.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this,R.style.DatePicker)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        home_MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void updateNavHeader (){
        NavigationView navigationView = findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);
        //TextView navUserName = headerView.findViewById(R.id.name_display);
        TextView navUserEmail = headerView.findViewById(R.id.textViewEmail);
       // ImageView navUserPhoto = headerView.findViewById(R.id.imagePhoto);

        navUserEmail.setText(currentUser.getEmail());
       // navUserName.setText(currentUser.getDisplayName());

       // Glide.with(this).load(currentUser.getPhotoUrl()).into(navUserPhoto);
    }


}