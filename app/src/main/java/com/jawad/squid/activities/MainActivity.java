package com.jawad.squid.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.jawad.squid.R;
import com.jawad.squid.Views.MainViewPager;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.main_pager);
        tabLayout = findViewById(R.id.tab_pager);
        MainViewPager adapter = new MainViewPager(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}