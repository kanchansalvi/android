package com.android.uiControls;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private Contact[] mContactList;

    public ListAdapter(Contact[] contactList) {

        this.mContactList = contactList;
    }

    // Create new View to hold the data
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        // Create a new view with the list_item layout
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(view);
    }

    // Set the data in the view created
    // viewHolder holds the data
    // where you want to place the data is the position
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHOlder, int position) {

        final Contact list = mContactList[position];

        // Set and display the data from Contact at this position
        viewHOlder.nameTxt.setText(mContactList[position].getName());
        viewHOlder.contactTxt.setText(mContactList[position].getmContactNum());

        // Set what happens when user clicks on the data viewHolder
        viewHOlder.dialLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"You clicked on : "+list.getName(),Toast.LENGTH_LONG).show();
            }
        });
    }

    // Returns the size of your Dataset
    @Override
    public int getItemCount() {

        return mContactList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTxt;
        private TextView contactTxt;
        private LinearLayout dialLayout;

        private ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTxt = itemView.findViewById(R.id.nameTxtID);
            contactTxt = itemView.findViewById(R.id.contactTxtID);
            dialLayout = itemView.findViewById(R.id.contactLayoutID);
        }
    }
}
