package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String LOG_TAG = "LoginActivity";

    private Toast loginInToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginPagerAdapter sectionsPagerAdapter = new LoginPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

      //  TabLayout tabs = findViewById(R.id.tabs);

    }

    public void loginUser()
    {
        loginInToast = Toast.makeText(LoginActivity.this, "Logging In", Toast.LENGTH_LONG);
        loginInToast.show();

        Intent intent = new Intent(this, MainActivity.class);
        loginInToast.cancel();
        try {
            startActivity(intent);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
