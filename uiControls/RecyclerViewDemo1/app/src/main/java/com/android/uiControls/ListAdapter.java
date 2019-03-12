package com.android.uiControls;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHOlder> {

    private ListData[] mListData;

    public ListAdapter(ListData[] listData) {

        this.mListData = listData;
    }

    // Create new View to hold the data
    @NonNull
    @Override
    public ViewHOlder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        // Create a new view with the list_item layout
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHOlder(view);
    }

    // Set the data in the view created
    // viewHolder holds the data
    // where you want to place the data is the position
    @Override
    public void onBindViewHolder(@NonNull ViewHOlder viewHOlder, int position) {

        final ListData list = mListData[position];

        // Set and display the data from ListData at this position
        viewHOlder.nameTxt.setText(mListData[position].getName());
        viewHOlder.contactTxt.setText(mListData[position].getmContactNum());

        // Set what happens when user clicks on the data viewHolder
        viewHOlder.dialRelLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"You clicked on : "+list.getName(),Toast.LENGTH_LONG).show();
            }
        });
    }

    // Returns the size of your Dataset
    @Override
    public int getItemCount() {

        return mListData.length;
    }

    public class ViewHOlder extends RecyclerView.ViewHolder {

        private TextView nameTxt;
        private TextView contactTxt;
        private RelativeLayout dialRelLayout;

        private ViewHOlder(@NonNull View itemView) {
            super(itemView);

            nameTxt = itemView.findViewById(R.id.nameTxtID);
            contactTxt = itemView.findViewById(R.id.contactTxtID);

            dialRelLayout = itemView.findViewById(R.id.dialRelLayoutID);
        }
    }
}
