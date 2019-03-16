package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTxt1;
    private View mDivider;
    private TextView mTxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxt1 = findViewById(R.id.txt1ID);
        mDivider = findViewById(R.id.dividerID);
        mTxt2 = findViewById(R.id.txt2ID);
    }
}
