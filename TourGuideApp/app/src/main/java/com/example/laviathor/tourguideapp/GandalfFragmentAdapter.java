package com.example.laviathor.tourguideapp;

/**
 * Created by LAViATHoR on 7/2/2016.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class GandalfFragmentAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTiles[] = new String[] {"Shire", "Rohan", "Gondor", "Mordor"};
    private Context context;

    public GandalfFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ShireFragment();
            case 1:
                return new RohanFragment();
            case 2:
                return new GondorFragment();
            case 3:
                return new MordorFragment();
            default:
                return new ShireFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTiles[position];
    }
}