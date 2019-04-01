package com.android.layouts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int flags[];
    String flagName[];
    LayoutInflater inflater;

    public CustomAdapter(Context appcontext, int[] flags, String[] flagName) {
        this.context = context;
        this.flags = flags;
        this.flagName = flagName;
        this.inflater = LayoutInflater.from(appcontext);
    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_gridview_flag, null);
        ImageView mFlagImage = convertView.findViewById(R.id.imageID);
        TextView mFlagTxt = convertView.findViewById(R.id.txtID);

        mFlagImage.setImageResource(flags[position]);
        mFlagTxt.setText(flagName[position]);
        return convertView;
    }
}
