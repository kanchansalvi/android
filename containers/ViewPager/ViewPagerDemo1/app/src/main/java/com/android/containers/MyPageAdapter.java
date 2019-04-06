package com.android.containers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        MyPageFragment myPageFragment = new MyPageFragment();
        Bundle bundle = new Bundle();
        position = position + 1;
        bundle.putString("Fragment", "This is MyPage Fragment " + position);
        myPageFragment.setArguments(bundle);
        return myPageFragment;
    }

    @Override
    public int getCount() {
        return 20;
    }
}
