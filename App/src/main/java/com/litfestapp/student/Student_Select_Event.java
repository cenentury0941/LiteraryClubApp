package com.litfestapp.student;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.litfestapp.litfest.CustomRecyclerAdapter;
import com.litfestapp.litfest.Event_Information;
import com.litfestapp.litfest.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Student_Select_Event#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Student_Select_Event extends Fragment {

    RecyclerView recyclerView ;
    View.OnClickListener onClickListener ;

    public Student_Select_Event() {
        // Required empty public constructor
    }

    public static Student_Select_Event newInstance() {
        Student_Select_Event fragment = new Student_Select_Event();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student__select__event, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById( R.id.recycler_view );
        recyclerView.setLayoutManager( new LinearLayoutManager( getContext() , RecyclerView.VERTICAL , false ));
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventdetailsintent = new Intent( getContext() , Event_Information.class );
                eventdetailsintent.putExtra( "EditEnabled" , false );
                startActivity( eventdetailsintent );
            }
        };
        recyclerView.setAdapter( new CustomRecyclerAdapter( onClickListener ) );
    }
}