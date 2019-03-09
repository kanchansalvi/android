package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Switch mLightSwitch;
    private TextView mLightTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLightSwitch = findViewById(R.id.lightSwitchID);
        mLightTxt = findViewById(R.id.lightTxtID);
    }

    public void switchOnClick(View v){
        if (mLightSwitch.isChecked()){
            mLightTxt.setText("Light is switched ON");
        } else {
            mLightTxt.setText("Light is switched OFF");
        }
    }
}
