package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class JamshedMajumdar extends AppCompatActivity {

    WebView videoTVdispla8;
    LinearLayout jamshed_v_one, jamshed_v_two, jamshed_v_three, jamshed_v_four, jamshed_v_five;
    LinearLayout jamshed_v_six, jamshed_v_seven, jamshed_v_eight;
    ImageView demoImg8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jamshed_majumdar);


        videoTVdispla8 = findViewById(R.id.videoTVdispla8);
        videoTVdispla8.getSettings().setJavaScriptEnabled(true);
        videoTVdispla8.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg8 = findViewById(R.id.demoImg8);

        jamshed_v_one = findViewById(R.id.jamshed_v_one);
        jamshed_v_two = findViewById(R.id.jamshed_v_two);
        jamshed_v_three = findViewById(R.id.jamshed_v_three);
        jamshed_v_four = findViewById(R.id.jamshed_v_four);
        jamshed_v_five = findViewById(R.id.jamshed_v_five);
        jamshed_v_six = findViewById(R.id.jamshed_v_six);
        jamshed_v_seven = findViewById(R.id.jamshed_v_seven);
        jamshed_v_eight = findViewById(R.id.jamshed_v_eight);





        // ------------ On Click Set -----------

        jamshed_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla8.loadUrl("https://www.youtube.com/embed/JqmwfIMX-3Y");
                videoTVdispla8.setVisibility(View.VISIBLE);
                demoImg8.setVisibility(View.GONE);

            }
        });


        jamshed_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla8.loadUrl("https://www.youtube.com/embed/dQR9K51t3n0");
                videoTVdispla8.setVisibility(View.VISIBLE);
                demoImg8.setVisibility(View.GONE);

            }
        });


        jamshed_v_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla8.loadUrl("https://www.youtube.com/embed/fq1A18NR73U");
                videoTVdispla8.setVisibility(View.VISIBLE);
                demoImg8.setVisibility(View.GONE);

            }
        });


        jamshed_v_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla8.loadUrl("https://www.youtube.com/embed/q4_NLEq5Msw");
                videoTVdispla8.setVisibility(View.VISIBLE);
                demoImg8.setVisibility(View.GONE);

            }
        });


        jamshed_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla8.loadUrl("https://www.youtube.com/embed/19trqCqk-50");
                videoTVdispla8.setVisibility(View.VISIBLE);
                demoImg8.setVisibility(View.GONE);

            }
        });


        jamshed_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla8.loadUrl("https://www.youtube.com/embed/GZCFbf5drP8");
                videoTVdispla8.setVisibility(View.VISIBLE);
                demoImg8.setVisibility(View.GONE);

            }
        });

        jamshed_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla8.loadUrl("https://www.youtube.com/embed/tJiYA8cHgOk");
                videoTVdispla8.setVisibility(View.VISIBLE);
                demoImg8.setVisibility(View.GONE);

            }
        });


        jamshed_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla8.loadUrl("https://www.youtube.com/embed/ofRreN56nDA");
                videoTVdispla8.setVisibility(View.VISIBLE);
                demoImg8.setVisibility(View.GONE);

            }
        });



    }
}