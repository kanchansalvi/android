package com.android.uiControls;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout mEmailTxtInputLayout;
    private TextInputEditText mEmailInputEditTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmailTxtInputLayout = findViewById(R.id.emailTextInputID);
        mEmailInputEditTxt = findViewById(R.id.emailTextInputEditTextID);

        mEmailInputEditTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                // Set error message if text length exceeds the maximum character length
                if (s.length() > mEmailTxtInputLayout.getCounterMaxLength()){
                    mEmailTxtInputLayout.setError("You have exceeded maximum character length");
                } else {
                    mEmailTxtInputLayout.setError("");
                }
            }
        });

    }
}
