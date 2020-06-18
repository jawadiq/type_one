package com.jawad.squid.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.jawad.squid.R;

public class AboutUs  extends Fragment {
    public static AboutUs newInstance(){
        return new AboutUs();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.about_us, container, false);
        return rootView;
    }
}
