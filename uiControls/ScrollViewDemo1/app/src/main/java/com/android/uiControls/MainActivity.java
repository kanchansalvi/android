package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHeadingTxt;
    private ImageView mTajImg;
    private TextView mTajTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHeadingTxt = findViewById(R.id.headingTxtID);
        mTajImg = findViewById(R.id.tajImgID);
        mTajTxt = findViewById(R.id.tajTxtID);

    }
}
