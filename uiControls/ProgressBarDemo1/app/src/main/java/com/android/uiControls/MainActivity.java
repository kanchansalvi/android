package com.android.uiControls;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mProgressStatusTxt;
    private ProgressBar mProgressPBar;
    private Button mDownloadBtn;

    // We need to initialise Handler on UI Thread since it modifies UI elements
    private static Handler sHandler = new Handler();
    private int mDownloadProgress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressStatusTxt = findViewById(R.id.progressStatusTxtID);
        mProgressPBar = findViewById(R.id.progressPBarID);
        mDownloadBtn = findViewById(R.id.downloadBtnID);
    }

    public void clickDownload(View v) {

        // Reset the progress if max value is already reached
        mDownloadProgress = mProgressPBar.getProgress();
        if (mDownloadProgress == mProgressPBar.getMax()) {
            mDownloadProgress = 1;
            mProgressPBar.setProgress(mDownloadProgress);
        }

        new Thread(new Runnable() {
            public void run() {
                while (mDownloadProgress < 100) {
                    mDownloadProgress += 1;
                    // Update the progress bar and display the current value in text view
                    sHandler.post(new Runnable() {
                        public void run() {
                            mProgressPBar.setProgress(mDownloadProgress);
                            mProgressStatusTxt.setText("Downloading : "+ mDownloadProgress +"/"+mProgressPBar.getMax());
                            if (mDownloadProgress == mProgressPBar.getMax()) {
                                mProgressStatusTxt.setText("Download Completed");
                            }
                        }
                    });
                    // Sleep for 100 milliseconds to show the progress slowly.
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
