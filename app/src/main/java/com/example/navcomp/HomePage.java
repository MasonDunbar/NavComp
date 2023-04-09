package com.example.navcomp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
public class HomePage extends Fragment {
    public HomePage() {
        // Required empty public constructor
    }

    //Declare the various home screen buttons because they are image buttons
    ImageButton study;
    ImageButton vocab;
    ImageButton magic;
    ImageButton bubble;
    ImageButton kana;
    ImageButton info;


    //Oncreate
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Set default view to display the home screen fragment
        View view = inflater.inflate(R.layout.fragment_home_page, container, false);


        //Declare Study button, select by button Id. Set onclick listener to display study page when the button is clicked.
        ImageButton study = view.findViewById(R.id.study);
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_studyPage);
            }
        });

        //Declare vocab button, select by button Id. Set onclick listener to display vocab confusion page when the button is clicked.
        ImageButton vocab = view.findViewById(R.id.vocab);
        vocab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_vocabConfusionPage);
            }
        });

        //Declare magic button, select by button Id. Set onclick listener to display magic trouble page when the button is clicked.
        ImageButton magic = view.findViewById(R.id.magic);
        magic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_magicTroublePage);
            }
        });

        //Declare bubble button, select by button Id. Set onclick listener to display bubble match page when the button is clicked.
        ImageButton bubble = view.findViewById(R.id.bubble);
        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homePage_to_bubbleMatchTypePage);
            }
        });

        //Declare kana button, select by button Id. Set onclick listener to display kana challenge page when the button is clicked.
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