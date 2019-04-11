package com.android.containers;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = findViewById(R.id.tabLayoutID);

        ViewPager mViewPager = findViewById(R.id.viewPagerID);
        TabFragmentPagerAdapter adapter = new TabFragmentPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab_Fragment1(),"Tab 1");
        adapter.addFragment(new Tab_Fragment2(),"Tab 2");
        adapter.addFragment(new Tab_Fragment3(),"Tab 3");

        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }

}
