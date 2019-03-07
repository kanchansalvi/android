package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mSurveyRadioGrpID;
    private RadioButton mSurveyYesID;
    private RadioButton mSurveyNoID;
    private Button mSubmitBtnID;
    private TextView mNoteTxtID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSurveyRadioGrpID = findViewById(R.id.surveyRadioGrpID);
        mSurveyYesID = findViewById(R.id.surveyYesID);
        mSurveyNoID = findViewById(R.id.surveyNoID);

        mSubmitBtnID = findViewById(R.id.submitBtnID);
        mNoteTxtID = findViewById(R.id.noteTextID);
    }

    //Method called when Submit Button is clicked
    public void onSubmit(View v){
        if (mSurveyRadioGrpID.getCheckedRadioButtonId() == mSurveyYesID.getId())
            mNoteTxtID.setText("Thank you for opting to take our Survey !!!");
        if (mSurveyRadioGrpID.getCheckedRadioButtonId() == mSurveyNoID.getId())
            mNoteTxtID.setText("Thank You... See you soon !!!!");
    }

    //Method called when "Yes" or "No" RadioButton is checked
    public void onSurveyRadioBtnClicked(View v){
        if (mSurveyYesID.isChecked())
            Toast.makeText(getApplicationContext(),"Opted for survey",Toast.LENGTH_SHORT).show();
        if (mSurveyNoID.isChecked())
            Toast.makeText(getApplicationContext(),"Declined survey",Toast.LENGTH_SHORT).show();
    }
}
