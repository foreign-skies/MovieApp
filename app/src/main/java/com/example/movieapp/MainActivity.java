package com.example.movieapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(), user, authToken, this);
       // ViewPager viewPager = findViewById(R.id.view_pager);
       // viewPager.setAdapter(sectionsPagerAdapter);
     //   TabLayout tabs = findViewById(R.id.tabs);
       // tabs.setupWithViewPager(viewPager);

    }
}
