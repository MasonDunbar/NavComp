package com.example.navcomp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudyPage extends Fragment {

    public StudyPage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        class flashCard {
            private int id;
            private String name;
            private String image;
            private String sound;
        }


        return inflater.inflate(R.layout.fragment_study_page, container, false);





    }
}