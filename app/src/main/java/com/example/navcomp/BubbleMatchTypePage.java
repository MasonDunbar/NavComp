package com.example.navcomp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class BubbleMatchTypePage extends Fragment {

    public BubbleMatchTypePage() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Set default view to display the home screen fragment
        View view = inflater.inflate(R.layout.fragment_bubble_match_type_page, container, false);


        ImageButton kana = view.findViewById(R.id.bubble_kana);
        kana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_bubbleMatchTypePage_to_bubbleMatchGamePage2);
            }
        });

        return view;
    }

}