package com.android.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView mFlagGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFlagGridView = findViewById(R.id.flagGridViewID);

        int[] flags = {R.drawable.argentina,R.drawable.australia,R.drawable.belgium,R.drawable.canada,
                R.drawable.china,R.drawable.denmark,R.drawable.france,R.drawable.germany,
                    R.drawable.india,R.drawable.japan,R.drawable.malaysia,R.drawable.mexico};

        String[] flagName = {"argentina","australia","belgium","canada","china","denmark","france",
                            "germany","india","japan","malaysia","mexico"};

        CustomAdapter customAdapter = new CustomAdapter(this.getApplicationContext(), flags, flagName);
        mFlagGridView.setAdapter(customAdapter);

        mFlagGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) view.findViewById(R.id.txtID)).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
