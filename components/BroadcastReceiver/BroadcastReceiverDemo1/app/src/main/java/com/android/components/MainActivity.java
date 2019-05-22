package com.android.components;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyReceiver myReceiver = new MyReceiver();

        // Define the IntentFilter.
        IntentFilter filter = new IntentFilter("com.components.brec");
        // Register the receiver using the activity context, passing in the IntentFilter.
        this.registerReceiver(myReceiver, filter);
    }

    public void onClick(View v){

        Intent intent = new Intent();
        intent.setAction("com.components.brec");
        sendBroadcast(intent);

    }
}
