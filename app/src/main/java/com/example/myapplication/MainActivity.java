package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (TextView)findViewById(R.id.login);
        signup = (TextView)findViewById(R.id.signup);


        login.setOnClickListener(new View.OnClickListener() {
            Drawable drawable = login.getBackground();
            @Override
            public void onClick(View v) {
            login.setBackgroundResource(R.drawable.button_selection);
            signup.setBackgroundResource(R.drawable.button_selection_b);
                FragmentManager fm =getSupportFragmentManager();
                LoginFrag loginFrag = new LoginFrag();
                fm.beginTransaction().replace(R.id.frameone,loginFrag).commit();
                }
        });
        signup.setOnClickListener(new View.OnClickListener(){
            Drawable drawable = signup.getBackground();
            @Override
            public void onClick(View v){
                signup.setBackgroundResource(R.drawable.button_selection);
                login.setBackgroundResource(R.drawable.button_selection_b);
                FragmentManager fm = getSupportFragmentManager();
                SignupFrag signupFrag = new SignupFrag();
                fm.beginTransaction().replace(R.id.frameone,signupFrag).commit();
            }
        });
FragmentManager fm = getSupportFragmentManager();
LoginFrag loginFrag = new LoginFrag();
fm.beginTransaction().replace(R.id.frameone,loginFrag).commit();
    }
}