package com.android.containers;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentListTitle = new ArrayList<>();

    int mNumOfTabs;

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        //mNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int tab_position) {

        return fragmentList.get(tab_position);

//        switch(tab_position){
//            case 0:
//                Tab_Fragment1 tab1 = new Tab_Fragment1();
//                return tab1;
//            case 1:
//                Tab_Fragment2 tab2 = new Tab_Fragment2();
//                return tab2;
//            case 2:
//                Tab_Fragment3 tab3 = new Tab_Fragment3();
//                return tab3;
//            default:
//                return null;
//        }
    }

    @Override
    public int getCount() {
        return fragmentListTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentListTitle.add(title);

    }
}
