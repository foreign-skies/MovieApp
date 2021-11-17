package com.example.movieapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class NewMoviesFragment extends Fragment {
    public static NewMoviesFragment newInstance() {
        NewMoviesFragment fragment = new NewMoviesFragment();

        Bundle args = new Bundle(2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_movies_fragment, container, false);

        return view;
    }
}
