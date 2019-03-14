package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mRateTxt;
    private RatingBar mRatingBar;
    private Button mSubmitBtn;
    private TextView mStayTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRateTxt = findViewById(R.id.rateTxtID);
        mRatingBar = findViewById(R.id.stayRatingBarID);
        mSubmitBtn = findViewById(R.id.submitBtnID);
        mStayTxt = findViewById(R.id.stayTxtID);

    }

    public void onSubmit(View view) {
        mStayTxt.setText("You rated " + mRatingBar.getRating() + " stars for your stay.");
    }
}
