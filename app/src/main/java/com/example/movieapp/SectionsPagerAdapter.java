package com.example.movieapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private static final int FOLLOWING_FRAGMENT_POSITION = 2;

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.servicesTabTitle,R.string.newMoviesTabTitle,R.string.chooseMovieTabTitle,R.string.recommendationsTabTitle};
    private final Context mContext;
    private final MainActivity main_activity;

    public SectionsPagerAdapter(Context context, FragmentManager fm, MainActivity main_activity) {
        super(fm);
        mContext = context;
        this.main_activity = main_activity;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch(position)
        {
            case 0:
                fragment = ServicesFragment.newInstance();
                main_activity.setServicesFragment((ServicesFragment)fragment);
                return fragment;


            case 1:
                return NewMoviesFragment.newInstance();
            //fragment = new StoryFragment();
            //break;
            case 2:
                return ChooseMovieFragment.newInstance();
            case 3:
                return RecommendationsFragment.newInstance();


        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}
