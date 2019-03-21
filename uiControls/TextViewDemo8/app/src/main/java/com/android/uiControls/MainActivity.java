package com.android.uiControls;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relLayout;
    private TextView mTextView;
    private CheckedTextView mBlueTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relLayout = findViewById(R.id.relLayoutID);
        mTextView = (TextView) findViewById(R.id.textID);
        mBlueTxt = findViewById(R.id.blueTxtID);
    }

    public  void onCheckedTextViewClicked(View view){

        if(mBlueTxt.isChecked()){

            // Set the unchecked mark
            mBlueTxt.setCheckMarkDrawable(R.drawable.unchecked);
            // Set the text to be checked
            mBlueTxt.setChecked(false);
            Toast.makeText(getApplicationContext(),"You unchecked your style", Toast.LENGTH_SHORT).show();
        }
        else {
            // Set the unchecked mark
            mBlueTxt.setCheckMarkDrawable(R.drawable.checked);
            // Set the text to be unchecked again
            mBlueTxt.setChecked(true);
            Toast.makeText(getApplicationContext(),"You checked your style", Toast.LENGTH_SHORT).show();
        }

    }
}
