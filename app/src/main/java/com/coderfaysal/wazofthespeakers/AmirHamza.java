package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AmirHamza extends AppCompatActivity {

    WebView videoTVdisplay4;
    LinearLayout amirhamza_v_one, amirhamza_v_two, amirhamza_v_three, amirhamza_v_four, amirhamza_v_five, amirhamza_v_six;
    LinearLayout amirhamza_v_seven, amirhamza_v_eight, amirhamza_v_nine, amirhamza_v_ten;
    ImageView demoImg4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amir_hamza);




        videoTVdisplay4 = findViewById(R.id.videoTVdisplay4);
        videoTVdisplay4.getSettings().setJavaScriptEnabled(true);
        videoTVdisplay4.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg4 = findViewById(R.id.demoImg4);

        amirhamza_v_one = findViewById(R.id.amirhamza_v_one);
        amirhamza_v_two = findViewById(R.id.amirhamza_v_two);
        amirhamza_v_three = findViewById(R.id.amirhamza_v_three);
        amirhamza_v_four = findViewById(R.id.amirhamza_v_four);
        amirhamza_v_five = findViewById(R.id.amirhamza_v_five);
        amirhamza_v_six = findViewById(R.id.amirhamza_v_six);
        amirhamza_v_seven = findViewById(R.id.amirhamza_v_seven);
        amirhamza_v_eight = findViewById(R.id.amirhamza_v_eight);
        amirhamza_v_nine = findViewById(R.id.amirhamza_v_nine);
        amirhamza_v_ten = findViewById(R.id.amirhamza_v_ten);






        // ------------ On Click Set -----------
        amirhamza_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/ZbxSXZUqs3s");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/1rCnfH8AO8Y");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/2rgnbgvzBRU");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/3bs-cbiU1NQ");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/cHinaebi-EI");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/fDftH_IlfBk");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/n6g0XOZDzLk");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/ji7-pvaxtgU");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/VlPT9rx4H40");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });


        amirhamza_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay4.loadUrl("https://www.youtube.com/embed/po2F1E3Ua4s");
                videoTVdisplay4.setVisibility(View.VISIBLE);
                demoImg4.setVisibility(View.GONE);

            }
        });







    }
}