package com.example.navcomp;

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
public class BubbleMatchPage extends Fragment {

    public BubbleMatchPage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bubble_match_page, container, false);

        Button bubbleback = view.findViewById(R.id.bubbleback);
        bubbleback.setOnClickListener(new View.OnClickListener() {

            //study.setBackgroundDrawable(R.drawable.)
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_bubbleMatchPage_to_homePage);
            }
        });

        Button bubbleromaji = view.findViewById(R.id.bubbleromaji);
        bubbleromaji.setOnClickListener(new View.OnClickListener() {

            //study.setBackgroundDrawable(R.drawable.)
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_bubbleMatchPage_to_bubbleMatchGamePageR);
            }
        });

        Button bubblekana = view.findViewById(R.id.bubblekana);
        bubblekana.setOnClickListener(new View.OnClickListener() {

            //study.setBackgroundDrawable(R.drawable.)
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_bubbleMatchPage_to_bubbleMatchGamePageK);
            }
        });

        return view;
    }
}