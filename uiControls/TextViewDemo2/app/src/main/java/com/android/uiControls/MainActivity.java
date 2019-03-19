package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;


/* Demonstrates the scrollview inside TextView
** Makes the TextView Scrollable
 */
public class MainActivity extends AppCompatActivity {

    private TextView mHeadingTxt;
    private TextView mTajTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHeadingTxt = findViewById(R.id.headingTxtID);
        mTajTxt = findViewById(R.id.tajTxtID);

        // To Add Hyperlink in the TextvView
        mTajTxt.setMovementMethod(LinkMovementMethod.getInstance());
        String txt = "<a href='http://www.google.com'> Google </a>";
        mTajTxt.setText(Html.fromHtml(txt));
    }
}
