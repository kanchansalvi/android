package com.android.advanced;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendEmail(View view){

        // Create an Intent Object for Email
        Intent mEmail = new Intent(Intent.ACTION_SEND);

        mEmail.setDataAndType(Uri.parse("mail:"), "message/rfc822"); // "text/plain"
        mEmail.putExtra(Intent.EXTRA_EMAIL, new String[] {"address1@email.com","address2@email.com"});
        mEmail.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        mEmail.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        // Choose your Email Client and Start sending Email
        startActivity(Intent.createChooser(mEmail, "Send mail..."));

    }
}
