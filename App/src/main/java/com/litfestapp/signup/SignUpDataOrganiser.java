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

import com.litfestapp.organiser.OrganiserHomeActivity;
import com.litfestapp.litfest.R;

public class SignUpDataOrganiser extends Fragment {

    Button signup ;

    public SignUpDataOrganiser() {

    }

    public static SignUpDataOrganiser newInstance() {
        SignUpDataOrganiser fragment = new SignUpDataOrganiser();
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
        return inflater.inflate(R.layout.fragment_sign_up_data_organiser, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        signup = view.findViewById( R.id.Login_Sign_Up_Button ) ;
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent organiserhomeintent = new Intent( getActivity().getApplicationContext() , OrganiserHomeActivity.class );
                startActivity( organiserhomeintent );
                getActivity().finish();
            }
        });
    }
}