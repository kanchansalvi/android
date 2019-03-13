package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTxt;
    private ImageButton mImgBtn;
    private TextView mOnClickTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxt = findViewById(R.id.clickTxtID);
        mImgBtn = findViewById(R.id.clickBtnID);
        mOnClickTxt = findViewById(R.id.onClickTxtID);

    }

    public void onClickImageButton(View view) {
        mOnClickTxt.setText("You clicked on ImageButton !");
    }
}
