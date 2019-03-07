package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mItemText;
    private CheckBox mMilkChk;
    private CheckBox mBreadChk;
    private CheckBox mOatsChk;
    private CheckBox mCheeseChk;
    private Button mSubmitBtn;
    private TextView mItemSelectedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mItemText = findViewById(R.id.itemTextID);
        mMilkChk = findViewById(R.id.milkChkID);
        mBreadChk = findViewById((R.id.breadChkID));
        mOatsChk = findViewById(R.id.oatsChkID);
        mCheeseChk = findViewById(R.id.cheeseChkID);
        mSubmitBtn = findViewById(R.id.submitBtnID);
        mItemSelectedText = findViewById(R.id.itemsSelectedTextID);
    }

    //Method called when Any of the CheckBox is checked
    public void chkSelect(View v)
    {
        StringBuilder itemChk = new StringBuilder();
        if (mMilkChk.isChecked())
            itemChk.append(mMilkChk.getText());
        if (mBreadChk.isChecked())
            itemChk.append(" " + mBreadChk.getText());
        if (mOatsChk.isChecked())
            itemChk.append(" " + mOatsChk.getText());
        if (mCheeseChk.isChecked())
            itemChk.append(" " + mCheeseChk.getText());

        if (itemChk.length() != 0) {
            Toast.makeText(getApplicationContext(), "You selected : " + itemChk.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    //Method called when Submit Button is clicked
    public void itemsSubmitted(View v)
    {
        StringBuilder itemChk = new StringBuilder();
        if (mMilkChk.isChecked())
            itemChk.append("\n" + mMilkChk.getText());
        if (mBreadChk.isChecked())
            itemChk.append(" \n" + mBreadChk.getText());
        if (mOatsChk.isChecked())
            itemChk.append(" \n" + mOatsChk.getText());
        if (mCheeseChk.isChecked())
            itemChk.append(" \n" + mCheeseChk.getText());

        if (itemChk.length() == 0) {
            mItemSelectedText.setText("Please select the items.");
        } else {
            mItemSelectedText.setText("Items selected by you : ");
            mItemSelectedText.append(itemChk.toString());
        }

    }
}
