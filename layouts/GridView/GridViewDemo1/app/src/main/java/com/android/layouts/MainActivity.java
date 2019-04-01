package com.android.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView mCountryGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountryGridView = findViewById(R.id.countryGridview);

        String[] num = new String[]{"Argentina","Australia","Belgium","Canada","China","Denmark",
                                    "France","Germany","India","Japan","Malaysia","Singapore","Mexico",
                                    "New Zealand","Norway","Poland","Russia","Spain","Switzerland"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,num);
        mCountryGridView.setAdapter(adapter);

        mCountryGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
