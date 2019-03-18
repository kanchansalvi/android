package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private Contact[] mContactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.contactsRecyclerViewID);

        // Initialize the mContactList with some dummy data
        initializeData();

        // Specify an Adapter
        ListAdapter listAdapter = new ListAdapter(mContactList);
        recyclerView.setAdapter(listAdapter);

        // Size of the content do not change LayoutSize of RecyclerView
        recyclerView.setHasFixedSize(true);

        // Use a linear layout manager to show the list linearly
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initializeData() {
        // Sample fake data of the contactList
        mContactList = new Contact[]{
                new Contact("Chris","1234567890"),
                new Contact("Sam","2324435647"),
                new Contact("John","3545436347"),
                new Contact("Kelly","5657569086"),
                new Contact("Jake","4546753759"),
                new Contact("Helen","5467658984"),
                new Contact("Kate","7978908263"),
                new Contact("Jill","1234536086"),
                new Contact("Mike","9678548747"),
                new Contact("Ana","5446897465"),
                new Contact("George","5675798376"),
                new Contact("Vincent","6898756087"),
                new Contact("Mary","9775512685"),
                new Contact("Prince","9658865639"),
                new Contact("Jeff","6578898463"),
        };
    }
}
