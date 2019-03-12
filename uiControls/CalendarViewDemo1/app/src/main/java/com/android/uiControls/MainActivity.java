package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mSelectTxt;
    private CalendarView mCalendarView;
    private TextView mDateTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSelectTxt = findViewById(R.id.selectTxtID);
        mCalendarView = findViewById(R.id.calendarID);
        mDateTxt = findViewById(R.id.dateTxtID);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // Note: month variable gets values from 0-11.
                mDateTxt.setText("Interview Date : " + (month+1) + "/" + dayOfMonth + "/" + year);
            }
        });
    }
}
