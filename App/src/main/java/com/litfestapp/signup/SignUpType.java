package com.litfestapp.signup;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.material.snackbar.Snackbar;
import com.litfestapp.litfest.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SignUpType#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SignUpType extends Fragment {

    RadioButton student , organiser ;
    Button next ;

    public SignUpType() {
        // Required empty public constructor
    }

    public static SignUpType newInstance() {
        SignUpType fragment = new SignUpType();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_up_type, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        student = view.findViewById( R.id.Login_Sign_Up_Type_Student ) ;
        organiser = view.findViewById( R.id.Login_Sign_Up_Type_Organiser ) ;
        next = view.findViewById( R.id.Login_Sign_Up_Button ) ;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( student.isChecked() ) {
                    getActivity().getSupportFragmentManager().beginTransaction().replace(
                            R.id.container, SignUpDataStudent.newInstance()).commitNow();
                }
                else if( organiser.isChecked() ){
                    getActivity().getSupportFragmentManager().beginTransaction().replace(
                            R.id.container, SignUpDataOrganiser.newInstance()).commitNow();
                }
                else{
                    Snackbar.make( getView() , "Select An Option" , Snackbar.LENGTH_SHORT ).show();
                }
            }
        });
    }
}