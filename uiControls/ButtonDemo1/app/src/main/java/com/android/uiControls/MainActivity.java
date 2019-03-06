package com.android.uiControls;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button mClickButton;  //Declare the Button
    public TextView mDisplayTxtID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the Button ....
        mClickButton =  findViewById(R.id.clickBtnID);
        mDisplayTxtID = findViewById(R.id.displayTextID);
    }

    // Method called when the Button is Clicked
    //A new Text will be displayed on click of a button and Toast will appear
    public void displayText(View view){

        mDisplayTxtID.setText("You clicked on Button !!!");
        Toast.makeText(getApplicationContext(),"Button Clicked", Toast.LENGTH_LONG).show();

    }
}
