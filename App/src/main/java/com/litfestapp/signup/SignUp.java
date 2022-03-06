package com.litfestapp.signup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import com.litfestapp.litfest.R;

public class SignUp extends AppCompatActivity {

    Button signup ;
    FrameLayout intentframe ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, SignUpFragment.newInstance())
                .commitNow();
        }
        //SignUpType.
    }
}