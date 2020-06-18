package com.jawad.squid.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.jawad.squid.R;

public class MeetUps extends Fragment {
    public static MeetUps newInstance(){
        return new  MeetUps();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.meetups, container, false);
        return rootView;
    }

}
