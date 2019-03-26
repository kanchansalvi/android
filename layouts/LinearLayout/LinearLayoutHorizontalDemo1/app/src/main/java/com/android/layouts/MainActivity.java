package com.android.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mStartBtn;
    private Button mPauseBtn;
    private Button mStopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartBtn = findViewById(R.id.startBtnID);
        mPauseBtn = findViewById(R.id.pauseBtnID);
        mStopBtn = findViewById(R.id.stopBtnID);
    }
}
