package com.android.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mShowBtn;
    private View mInclude;
    private TextView mCatTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowBtn = findViewById(R.id.showBtnID);
        mShowBtn.setOnClickListener(this);

        // Fetching include layout items
         mInclude = findViewById(R.id.includeID);
         mCatTxt = mInclude.findViewById(R.id.txtID);

    }

    @Override
    public void onClick(View view){

        if(view.getId() == R.id.showBtnID){
            mCatTxt.setText("Cat Info");
        }

    }
}
