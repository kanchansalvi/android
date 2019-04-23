package com.android.containers;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button frame1Btn;
    private Button frame2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame1Btn = findViewById(R.id.frame1BtnID);
        frame2Btn = findViewById(R.id.frame2BtnID);

    }

    public void onClickBtn(View view){
        if(view.getId() == R.id.frame1BtnID){
           loadFragment(new Fragment1());
        }

        if(view.getId() == R.id.frame2BtnID){
            loadFragment(new Fragment2());
        }

    }

    public void loadFragment(Fragment fragment) {

        // create a FragmentManager
        FragmentManager fm = getFragmentManager();
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameID, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}
