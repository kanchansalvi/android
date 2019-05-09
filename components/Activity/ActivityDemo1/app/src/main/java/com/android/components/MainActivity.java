package com.android.components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /* This is the first callback and called when the activity is first created */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* This callback is called when the activity becomes visible to the user.*/
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(" ANDROID : ","In method Start");

    }

    /* This callback is called when the activity restarts after stopping it. */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(" ANDROID : ","In method ReStart");
    }

    /* This is called when the user starts interacting with the application.*/
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(" ANDROID : ","In method Resume");
    }

    /* The paused activity does not receive user input and cannot execute any code
        and called when the current activity is being paused and the previous activity is being resumed. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(" ANDROID : ","In method Pause");
    }

    /* This callback is called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(" ANDROID : ","In method Stop");
    }

    /* This callback is called before the activity is destroyed by the system. */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(" ANDROID : ","In method Destroy");
    }
}
