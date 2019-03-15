package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mMoviesListView;
    private TextView mMovieTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMoviesListView = findViewById(R.id.moviesListViewID);
        mMovieTxt = findViewById(R.id.movieTxtID);

        List movieList = new ArrayList<>();
        movieList.add("Captain Marvel");
        movieList.add("The NutCracker");
        movieList.add("Beauty and the Beast");
        movieList.add("Frozen");
        movieList.add("Hotel Transylvania");
        movieList.add("Robinhood");
        movieList.add("Disney Moana");
        movieList.add("Harry Potter");
        movieList.add("Guardians of the Galaxy");
        movieList.add("Small Foot");
        movieList.add("Lego");
        movieList.add("The Little Mermaid");
        movieList.add("Tangled");
        movieList.add("Toy Story");
        movieList.add("Benji");
        movieList.add("InCredibles");
        movieList.add("The Hobbit");

        final ArrayAdapter<String> movieAdapter = new ArrayAdapter<String>(this,R.layout.movies_list,R.id.txtID,movieList);
        mMoviesListView.setAdapter(movieAdapter);

        mMoviesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = movieAdapter.getItem(position);
                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
