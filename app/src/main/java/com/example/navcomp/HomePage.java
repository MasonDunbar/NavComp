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
public class HomePage extends Fragment {

    public HomePage() {
        // Required empty public constructor
    }

    //Declare the buttons
    ImageButton study;
    ImageButton vocab;
    ImageButton magic;
    ImageButton bubble;
    ImageButton kana;
    ImageButton info;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_page, container, false);

        ImageButton study = view.findViewById(R.id.study);
        study.setOnClickListener(new View.OnClickListener() {

            //study.setBackgroundDrawable(R.drawable.)
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_studyPage);
            }
        });

        ImageButton vocab = view.findViewById(R.id.vocab);
        vocab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_vocabConfusionPage);
            }
        });

        ImageButton magic = view.findViewById(R.id.magic);
        magic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_magicTroublePage);
            }
        });

        ImageButton bubble = view.findViewById(R.id.bubble);
        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_bubbleMatchPage);
            }
        });


        ImageButton kana = view.findViewById(R.id.kana);
        kana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_kanaChallengePage);
            }
        });

        ImageButton info = view.findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_informationPage);
            }
        });
        return view;
    }
}