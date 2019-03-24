package com.android.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mEnglishTxt;
    private TextView mFrenchTxt;
    private TextView mGermanTxt;
    private TextView mWelshTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnglishTxt = findViewById(R.id.englishTxtID);
        mFrenchTxt = findViewById(R.id.frenchTxtID);
        mGermanTxt = findViewById(R.id.germanTxtID);
        mWelshTxt = findViewById(R.id.welshTxtID);
    }
}
