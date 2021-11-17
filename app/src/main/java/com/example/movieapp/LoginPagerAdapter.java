package com.example.movieapp;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginPagerAdapter extends FragmentPagerAdapter {

    public LoginPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch(position)
        {
            case 0:
                fragment = new SigninFragment();
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position)
        {
            case 0:
                return "Sign In";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 1 total pages.
        return 1;
    }
}