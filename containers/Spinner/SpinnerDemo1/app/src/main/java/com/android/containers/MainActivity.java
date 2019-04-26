package com.android.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView mCountryTxt;
    private Spinner mCountrySpinner ;
    private List mCountryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountryTxt = findViewById(R.id.countryTxtID);
        mCountrySpinner = findViewById(R.id.countrySpinnerID);

        mCountrySpinner.setOnItemSelectedListener(this);

        // Initialize the mCountryList with some data
        initializeCountryList();

        // Specify an Adapter
        final ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mCountryList);
        mCountrySpinner.setAdapter(countryAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) { }

    private void initializeCountryList(){
        mCountryList = new ArrayList();
        mCountryList.add("USA");
        mCountryList.add("Japan");
        mCountryList.add("Italy");
        mCountryList.add("India");
        mCountryList.add("Australia");
        mCountryList.add("Canada");
        mCountryList.add("China");
    }
}
