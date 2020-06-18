package com.jawad.squid.Views;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.jawad.squid.fragments.AboutUs;
import com.jawad.squid.fragments.MeetUps;
import com.jawad.squid.fragments.Rush;

public class MainViewPager extends FragmentStatePagerAdapter {
    public MainViewPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public MainViewPager(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment returnFragment;
        switch (position){
            case 0: returnFragment = AboutUs.newInstance();
                break;
            case 1: returnFragment = Rush.newInstance();
                break;
            case 2 : returnFragment = MeetUps.newInstance();
                break;
            default: return null;
        }
        return returnFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        switch (position){
            case 0 : title ="About Us";
                break;
            case 1: title = " News Feed";
                break;
            case 2 : title = "Meet Ups";
                break;
            default: return null;

        }
        return title;
    }
}
