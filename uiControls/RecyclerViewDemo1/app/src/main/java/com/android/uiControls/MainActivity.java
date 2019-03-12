package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private ListData[] mListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.movieRecyclerViewID);

        //initialize the mListData with some dummy data
        initializeData();

        //Specify an Adapter
        ListAdapter listAdapter = new ListAdapter(mListData);

        // Changes in content do not change Layout size of RecyclerView
        recyclerView.setHasFixedSize(true);

        // Use a linear layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    private void initializeData() {
        mListData = new ListData[]{
                new ListData("Chris","1234567890"),
                new ListData("Sam","2324435647"),
                new ListData("John","3545436347"),
                new ListData("Kelly","5657569086"),
                new ListData("Jake","4546753759"),
                new ListData("Helen","5467658984"),
                new ListData("Kate","7978908263"),
                new ListData("Jill","1234536086"),
                new ListData("Mike","9678548747"),
                new ListData("Ana","5446897465"),
                new ListData("George","5675798376"),
                new ListData("Vincent","6898756087"),
                new ListData("Mary","9775512685"),
                new ListData("Prince","9658865639"),
                new ListData("Jeff","6578898463"),
        };
    }
}
