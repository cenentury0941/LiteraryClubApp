package com.litfestapp.organiser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.litfestapp.litfest.CustomRecyclerAdapter;
import com.litfestapp.litfest.Event_Information;
import com.litfestapp.litfest.R;

public class Organiser_ViewPastEvents extends AppCompatActivity {
    RecyclerView recyclerView ;
    View.OnClickListener onClickListener ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_view_past_events);
        recyclerView = findViewById( R.id.recycler_view );
        recyclerView.setLayoutManager( new LinearLayoutManager( getApplicationContext() , RecyclerView.VERTICAL , false ));
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventdetailsintent = new Intent( getApplicationContext() , Event_Information.class );
                eventdetailsintent.putExtra( "EditEnabled" , true ) ;
                startActivity( eventdetailsintent );
            }
        };
        recyclerView.setAdapter( new CustomRecyclerAdapter( onClickListener ) );
    }
}