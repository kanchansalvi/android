package com.android.layouts;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mFirstNameTxt;
    private EditText mEnterFirstNameTxt;
    private TextView mLastNameTxt;
    private EditText mEnterLastNameTxt;
    private Button mSubmitButton;
    private TextView mFullNameTxt;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstNameTxt = findViewById(R.id.firstNameTxtID);
        mEnterFirstNameTxt = findViewById(R.id.enterFirstNameTxtID);
        mLastNameTxt = findViewById(R.id.lastNameTxtID);
        mEnterLastNameTxt = findViewById(R.id.enterLastNameTxtID);
        mSubmitButton = findViewById(R.id.submitBtnID);
        mFullNameTxt = findViewById(R.id.fullNameTxtID);
    }


    public void onClickSubmitBtn(View view){
        mFullNameTxt.setText("Your Name is " + mEnterFirstNameTxt.getText() + " " + mEnterLastNameTxt.getText());
    }
}
