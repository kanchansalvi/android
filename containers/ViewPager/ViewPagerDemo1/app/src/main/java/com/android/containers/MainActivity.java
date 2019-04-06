package com.android.containers;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.viewPagerID1);

        // Set an Adapter for viewPager
        MyPageAdapter adapter = new MyPageAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);

    }
}
