package com.android.uiControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mSearchTxt;
    private Button mSearchBtn;
    private WebView mSearchWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchTxt = findViewById(R.id.searchTxtID);
        mSearchBtn = findViewById(R.id.searchBtnID);
        mSearchWebView = findViewById(R.id.searchWebViewID);

        /* To open WebLinks in the same WebView we need to set up webClient
        **
        ** E.g. you search for Android and the results are displayed in WebView.
        ** Without WebViewClient, when you click on link in results, it will open the link in Chrome app.
        ** With WebViewClient the link doesn't ask for app and is opened in same WebView.
        * */

        mSearchWebView.setWebViewClient(new WebViewClient());

    }

    // Open Google search for the text in the TextBox
    public void onClickBtn(View view) {
        if (!mSearchTxt.getText().equals("")) {
            // Load the URL in the browser
            mSearchWebView.loadUrl("https://www.google.com/search?q=" + mSearchTxt.getText());
        }
    }

    // For webPage to go back.
    // If this method is not defined your App will simply go to Home Page
    @Override
    public void onBackPressed() {
        // Check if webPage can go back
        if (mSearchWebView.canGoBack()) {
            mSearchWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
