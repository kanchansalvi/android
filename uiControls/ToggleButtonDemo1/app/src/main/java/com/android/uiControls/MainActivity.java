package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton mOnOffToggleBtn;
    private TextView mOnOffTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOnOffToggleBtn = findViewById(R.id.onOffToggleBtnID);
        mOnOffTxt = findViewById(R.id.onOffTxtID);
    }

    public void onClickToggle(View view){
        final boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            mOnOffTxt.setText("ToggleButton is ON");
        } else {
            mOnOffTxt.setText("ToggleButton is OFF");
        }
    }
}
