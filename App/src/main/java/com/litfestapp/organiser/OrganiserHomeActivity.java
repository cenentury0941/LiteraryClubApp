package com.litfestapp.organiser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.litfestapp.litfest.R;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class OrganiserHomeActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    Button pastevents ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organiser_home);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        pastevents = findViewById(R.id.Organiser_Home_Past_Events) ;
        pastevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasteventsintent = new Intent( getApplicationContext() , Organiser_ViewPastEvents.class ) ;
                startActivity( pasteventsintent );
            }
        });
    }
}