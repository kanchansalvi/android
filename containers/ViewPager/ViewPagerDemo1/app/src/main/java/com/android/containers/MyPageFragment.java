package com.android.containers;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyPageFragment extends Fragment {

    private TextView mText;

    public MyPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mypage, container, false);
        mText = view.findViewById(R.id.text1ID);
        String msg = getArguments().getString("Fragment");
        mText.setText(msg);
        return view;
    }

}
