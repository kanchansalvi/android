package com.android.uiControls;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton mFABtn;
    private TextView mTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFABtn = findViewById(R.id.checkFABID);
        mTxt = findViewById(R.id.clickTxtID);
    }

    public void onClickFloatingActionButton(View view) {
        mTxt.setText("You clicked on Floating Action Button");
    }
}
