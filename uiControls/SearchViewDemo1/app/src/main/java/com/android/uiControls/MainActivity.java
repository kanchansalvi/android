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
    private SearchView mSearchView;
    private TextView mMovieTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMoviesListView = findViewById(R.id.moviesListViewID);
        mSearchView = findViewById(R.id.searchViewID);
        mMovieTxt = findViewById(R.id.movieTxtID);

        final List movieList = new ArrayList<>();
        movieList.add("Captain Marvel");
        movieList.add("The NutCracker");
        movieList.add("Beauty and the Beast");
        movieList.add("Lego 2");
        movieList.add("Hotel Transylvania");
        movieList.add("Robinhood");
        movieList.add("Disney Moana");
        movieList.add("Harry Potter");
        movieList.add("Guardians of the Galaxy");
        movieList.add("Small Foot");
        movieList.add("Lego 1");
        movieList.add("The Little Mermaid");
        movieList.add("Tangled");
        movieList.add("Toy Story");
        movieList.add("Lego");
        movieList.add("InCredibles");
        movieList.add("The Hobbit");

        final ArrayAdapter<String> movieAdapter = new ArrayAdapter<String>(this,R.layout.movies_list,R.id.txtID,movieList);
        mMoviesListView.setAdapter(movieAdapter);

        // SearchView to display Submit Button
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            // Searches for the whole name
            // E.g. Search for "Leg" returns no results while "Lego" returns the results
            @Override
            public boolean onQueryTextSubmit(String query) {

                // Filter the List and show the results
                if (movieList.contains(query)) {
                    movieAdapter.getFilter().filter(query);
                } else {
                    // Show the List of Movies and display toast for no results found
                    movieAdapter.getFilter().filter(null);
                    Toast.makeText(MainActivity.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        // Show the list of all movies when the search is closed
        mSearchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                movieAdapter.getFilter().filter(null);
                return false;
            }
        });
    }
}
