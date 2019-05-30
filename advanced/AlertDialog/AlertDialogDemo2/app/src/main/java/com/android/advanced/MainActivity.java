package com.android.advanced;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCustomDialog(View view){

        LayoutInflater inflater = getLayoutInflater();
        View customDialogLayout = inflater.inflate(R.layout.custom_dialog, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setView(customDialogLayout);
        alertDialogBuilder.setTitle("Login Details");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("DONE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getBaseContext(),"You are successfully Logged in",Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getBaseContext(),"Please Login to continue",Toast.LENGTH_SHORT).show();
            }
        });


        alertDialogBuilder.show();

    }
}
