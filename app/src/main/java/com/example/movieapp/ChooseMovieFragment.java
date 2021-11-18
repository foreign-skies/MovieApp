package com.example.movieapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ChooseMovieFragment extends Fragment {
    ImageView titanic_image;
    TextView netflix_text;
    Button generate_movie;

    public static ChooseMovieFragment newInstance() {
        ChooseMovieFragment fragment = new ChooseMovieFragment();

        Bundle args = new Bundle(2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choose_movie_fragment, container, false);

        titanic_image = view.findViewById(R.id.titanicImage);
        titanic_image.setVisibility(View.INVISIBLE);
        netflix_text = view.findViewById(R.id.netflixText);
        netflix_text.setVisibility(View.INVISIBLE);
        generate_movie = view.findViewById(R.id.generate);
        generate_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titanic_image.setVisibility(View.VISIBLE);
                netflix_text.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }
}
