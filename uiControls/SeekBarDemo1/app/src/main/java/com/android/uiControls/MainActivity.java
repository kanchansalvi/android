package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mScoreTxtID;
    private SeekBar mPercentSeekID;
    private TextView mDisplayTxtID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreTxtID = findViewById(R.id.scoreTxtID);
        mPercentSeekID = findViewById(R.id.percentSeekID);
        mDisplayTxtID = findViewById(R.id.displayTxtID);

        mPercentSeekID.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //Display when progress on the Seekbar is changed.
                 mScoreTxtID.setText("Your Score : " + progress + "/10 .");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Display when tracking is ongoing
                mDisplayTxtID.setText("Tracking your Score");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Display when tracking is stopped.
                mDisplayTxtID.setText("Stopped tracking your Score");
            }
        });
    }
}
