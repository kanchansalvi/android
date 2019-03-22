package com.android.uiControls;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mTryVideoView;
    private MediaController mMediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTryVideoView = findViewById(R.id.tryVideoViewID);

        // Create object of MediaController
        mMediaController = new MediaController(MainActivity.this);
        mMediaController.setAnchorView(mTryVideoView);

        // Get MediaController for your Video
        mTryVideoView.setMediaController(mMediaController);
        // Set the URI for Video
        mTryVideoView.setVideoURI(Uri.parse("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"));
        // Start the video
        mTryVideoView.start();
    }
}
