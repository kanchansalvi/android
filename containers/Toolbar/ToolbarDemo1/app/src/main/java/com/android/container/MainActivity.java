package com.android.container;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbarID);
        setSupportActionBar(mToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.favouritesMenu)
            Toast.makeText(this,"You clicked on Favourites menu on ToolBar", Toast.LENGTH_SHORT).show();

        if(item.getItemId() == R.id.appsMenu)
            Toast.makeText(this,"You clicked on Apps menu on ToolBar", Toast.LENGTH_SHORT).show();

        return true;
    }
}
