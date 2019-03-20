package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mTxt;
    private EditText mPasswordEditTxt;
    private ToggleButton mShowOrHidePwdToggleBtn;
    private Button mSubmitBtn;
    private TextView mDisplayTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTxt = (TextView) findViewById(R.id.textID);
        mPasswordEditTxt = findViewById(R.id.passwordEditTxtID);
        mShowOrHidePwdToggleBtn = findViewById(R.id.showPasswordToggleID);
        mSubmitBtn = findViewById(R.id.submitBtnID);
        mDisplayTxt = findViewById(R.id.displayTxtID);

    }

    // Show and Hide password when ToggleButton is clicked
    public void onClickToggleBtn(View view){

        if (mShowOrHidePwdToggleBtn.isChecked()){
            mPasswordEditTxt.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            mPasswordEditTxt.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }

    }

    public void onClickSubmitBtn(View view) {
        mDisplayTxt.setText("You are successfully logged ");
    }
}
