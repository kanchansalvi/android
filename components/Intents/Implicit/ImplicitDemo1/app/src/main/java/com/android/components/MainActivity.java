package com.android.components;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button implicitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    implicitBtn = findViewById(R.id.implicitIntentBtnID);
    implicitBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent implicitIntent = new Intent(Intent.ACTION_VIEW);
            implicitIntent.setData(Uri.parse("https://kagasoft.wordpress.com/"));
            startActivity(implicitIntent);
        }
    });

    }
}
