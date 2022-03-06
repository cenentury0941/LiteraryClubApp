package com.litfestapp.litfest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.litfestapp.signup.SignUp;

public class MainActivity extends AppCompatActivity {

    Button signin , signup ;
    EditText emailid , password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(Color.BLACK );
        getWindow().setNavigationBarColor( Color.BLACK );

        signup = findViewById( R.id.Login_Sign_Up_Button ) ;
        signin = findViewById( R.id.Login_Sign_In_Button ) ;

        emailid = findViewById( R.id.Login_Sign_In_Email ) ;
        password = findViewById( R.id.Login_Sign_In_Password ) ;

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupintent = new Intent( getApplicationContext() , SignUp.class );
                startActivity( signupintent );
                finish();
            }
        });

    }
}