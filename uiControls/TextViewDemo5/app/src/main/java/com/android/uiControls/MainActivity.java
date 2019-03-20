package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTxt;
    private AutoCompleteTextView mColorAutoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxt = findViewById(R.id.txtID);
        mColorAutoTxt = findViewById(R.id.colorAutoTxt);

        final String[] colors = {"Red", "Blue", "Green","Orange", "Grey", "White", "Black"};

        // Starts searching the characters in color from first character
        mColorAutoTxt.setThreshold(1);

        // Creating ArrayAdapter for the List of Colors
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item, colors);
        // Set the Adapter data into Autocomplete textView
        mColorAutoTxt.setAdapter(adapter);


    }
}
