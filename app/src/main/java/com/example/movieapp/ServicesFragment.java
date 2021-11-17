package com.example.movieapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

public class ServicesFragment extends Fragment {
    ImageView netflixImage;
    ImageView huluImage;
    Button add_service;
    int counter = 1;
    public static ServicesFragment newInstance() {
        ServicesFragment fragment = new ServicesFragment();

        Bundle args = new Bundle(2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.services_fragment, container, false);
        netflixImage = view.findViewById(R.id.imageNetflix);
        netflixImage.setVisibility(View.INVISIBLE);
        huluImage = view.findViewById(R.id.imageHulu);
        huluImage.setVisibility(View.INVISIBLE);
        add_service = view.findViewById(R.id.AddServiceButton);
        add_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == 1)
                    netflixImage.setVisibility(View.VISIBLE);
                if (counter == 2)
                    huluImage.setVisibility(View.VISIBLE);
                counter++;
            }
        });


        return view;
    }
}
