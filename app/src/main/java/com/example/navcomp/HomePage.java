package com.example.navcomp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePage extends Fragment {

    public HomePage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_page, container, false);

        Button study = view.findViewById(R.id.study);
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_studyPage);
            }
        });

        Button vocab = view.findViewById(R.id.vocab);
        vocab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_vocabConfusionPage);
            }
        });

        Button magic = view.findViewById(R.id.magic);
        magic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_magicTroublePage);
            }
        });

        Button bubble = view.findViewById(R.id.bubble);
        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_bubbleMatchPage);
            }
        });


        Button kana = view.findViewById(R.id.kana);
        kana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_kanaChallengePage);
            }
        });

        Button info = view.findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_informationPage);
            }
        });
        return view;
    }
}