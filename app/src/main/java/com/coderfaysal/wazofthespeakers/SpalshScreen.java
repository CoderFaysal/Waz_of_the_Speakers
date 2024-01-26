package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SpalshScreen extends AppCompatActivity {

    ImageView share, facebook;
    Button appRateUs, moreApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalsh_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }

        }, 3000);


        // ======== Facebook =========

        facebook = findViewById(R.id.facebook);

        facebook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                gotoUrl("https://web.facebook.com/developerfaysal");
            }
        });


        // ------------ App Rating ---------

        appRateUs = findViewById(R.id.appRateUs);

        appRateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://play.google.com/store/apps/details?="+ BuildConfig.APPLICATION_ID);
            }
        });

        // ------------ More App ---------

        moreApp = findViewById(R.id.moreApp);

        moreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://play.google.com");
            }
        });



        // ========= Share ==========
        share = findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT, "share app");
                    String shareMassage = "https://play.google.com/store/apps/details?="+ BuildConfig.APPLICATION_ID + "\n\n";
                    intent.putExtra(Intent.EXTRA_TEXT, shareMassage);
                    startActivity(Intent.createChooser(intent, "Share By"));
                } catch (Exception e) {
                    Toast.makeText(SpalshScreen.this, "Error occurred", Toast.LENGTH_SHORT).show();
                }

        }});

    }


    // ----- Url Link Private -----
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


}