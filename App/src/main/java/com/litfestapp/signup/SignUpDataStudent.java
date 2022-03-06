package com.litfestapp.signup;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.litfestapp.litfest.R;
import com.litfestapp.student.StudentHomeActivity;

public class SignUpDataStudent extends Fragment {

    Button signup ;

    public SignUpDataStudent() {
        // Required empty public constructor
    }

    public static SignUpDataStudent newInstance() {
        SignUpDataStudent fragment = new SignUpDataStudent();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_up_data_student, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        signup = view.findViewById( R.id.Login_Sign_Up_Button ) ;
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent studenthomeintent = new Intent( getActivity().getApplicationContext() , StudentHomeActivity.class );
                startActivity( studenthomeintent );
                getActivity().finish();
            }
        });
    }
}