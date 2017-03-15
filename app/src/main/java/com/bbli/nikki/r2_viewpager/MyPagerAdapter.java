package com.bbli.nikki.r2_viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nikki on 3/15/2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FirstFragment.newInstance(0, "Page # 1");
            case 1:
                return FirstFragment.newInstance(1, "Page # 2");
            case 2:
                return SecondFragment.newInstance(2, "Page # 3");
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}