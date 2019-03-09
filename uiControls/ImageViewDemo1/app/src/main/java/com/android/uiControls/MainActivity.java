package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView mMyCatImg;
    private TextView mCatTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCatTxt = findViewById(R.id.catTxtID);
        mMyCatImg = findViewById(R.id.myCatImgViewID);

    }

    public void catImgClick(View v){
        // Description of cat in TextView becomes visible/invisible when image is clicked
        if (mCatTxt.getVisibility() == v.VISIBLE){
            mCatTxt.setVisibility(v.INVISIBLE);
        } else {
            mCatTxt.setVisibility(v.VISIBLE);
        }
    }
}
