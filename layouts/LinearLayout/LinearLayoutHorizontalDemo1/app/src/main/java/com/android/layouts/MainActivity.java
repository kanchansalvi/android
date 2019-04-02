package com.android.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mStopTxt;
    private TextView mPauseTxt;
    private TextView mStartTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStopTxt = findViewById(R.id.stopTxtID);
        mPauseTxt = findViewById(R.id.pauseTxtID);
        mStartTxt = findViewById(R.id.startTxtID);

    }
}
