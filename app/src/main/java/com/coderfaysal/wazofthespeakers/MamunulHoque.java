package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MamunulHoque extends AppCompatActivity {

    WebView videoTVdispla6;
    LinearLayout mamunul_v_one, mamunul_v_two, mamunul_v_three, mamunul_v_four, mamunul_v_five;
    LinearLayout mamunul_v_six, mamunul_v_seven, mamunul_v_eight, mamunul_v_nine, mamunul_v_ten;

    ImageView demoImg6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mamunul_hoque);


        videoTVdispla6 = findViewById(R.id.videoTVdispla6);
        videoTVdispla6.getSettings().setJavaScriptEnabled(true);
        videoTVdispla6.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg6 = findViewById(R.id.demoImg6);

        mamunul_v_one = findViewById(R.id.mamunul_v_one);
        mamunul_v_two = findViewById(R.id.mamunul_v_two);
        mamunul_v_three = findViewById(R.id.mamunul_v_three);
        mamunul_v_four = findViewById(R.id.mamunul_v_four);
        mamunul_v_five = findViewById(R.id.mamunul_v_five);
        mamunul_v_six = findViewById(R.id.mamunul_v_six);
        mamunul_v_seven = findViewById(R.id.mamunul_v_seven);
        mamunul_v_eight = findViewById(R.id.mamunul_v_eight);
        mamunul_v_nine = findViewById(R.id.mamunul_v_nine);
        mamunul_v_ten = findViewById(R.id.mamunul_v_ten);





        // ------------ On Click Set -----------
        mamunul_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/vzAXJ54MCq0");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/djObckGe7J8");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/sdvpvqdI3vU");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/tQN2KYg4icM");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/TUYMMQPM79U");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/hCB6u0N0Uhs");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/P-79fkth3Ec");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/0hXU4RL803w");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/TzVrn5F-aiM");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });


        mamunul_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla6.loadUrl("https://www.youtube.com/embed/ZILUfGZjphs");
                videoTVdispla6.setVisibility(View.VISIBLE);
                demoImg6.setVisibility(View.GONE);

            }
        });






    }
}