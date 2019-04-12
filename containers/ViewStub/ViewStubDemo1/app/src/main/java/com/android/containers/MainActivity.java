package com.android.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewStub mViewStub;
    private Button mShowBtn;
    private Button mHideBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewStub = findViewById(R.id.viewStubID);
        mViewStub.inflate();
        mViewStub.setVisibility(View.GONE);

        mShowBtn = findViewById(R.id.showBtnID);
        mHideBtn = findViewById(R.id.hideBtnID);

        mShowBtn.setOnClickListener(this);
        mHideBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){

        if(view.getId() == R.id.showBtnID){
            mViewStub.setVisibility(View.VISIBLE);
        }

        if(view.getId() == R.id.hideBtnID){
            mViewStub.setVisibility(View.GONE);
        }

    }
}
