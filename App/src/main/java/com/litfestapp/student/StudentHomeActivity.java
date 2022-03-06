package com.litfestapp.student;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.litfestapp.litfest.R;

public class StudentHomeActivity extends AppCompatActivity {

    NavigationView navigationView ;
    DrawerLayout drawerLayout ;
    Button register , registeredevents , pastevents ;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor( Color.BLACK );
        getWindow().setStatusBarColor( Color.BLACK );
        setContentView(R.layout.activity_student_home);
        FloatingActionButton fab = findViewById(R.id.fab);
        navigationView = findViewById( R.id.nav_view );
        drawerLayout = findViewById( R.id.drawer_layout ) ;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
                drawerLayout.open();
            }
        });
        register = findViewById( R.id.Student_Home_Register );
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent( getApplicationContext() , Student_RegisterToEvent.class );
                startActivity( registerIntent );
            }
        });

        registeredevents = findViewById( R.id.Student_Home_Registered_Events );
        registeredevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent( getApplicationContext() , Student_RegisteredEvents.class );
                startActivity( registerIntent );
            }
        });


        pastevents = findViewById( R.id.Student_Home_Past_Events );
        pastevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent( getApplicationContext() , Student_ViewPastEvents.class );
                startActivity( registerIntent );
            }
        });


    }

}