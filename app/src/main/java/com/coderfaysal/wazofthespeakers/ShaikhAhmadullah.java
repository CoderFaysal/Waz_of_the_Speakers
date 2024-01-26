package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ShaikhAhmadullah extends AppCompatActivity {

    WebView videoTVdisplay5;
    LinearLayout ahmadullah_v_one, ahmadullah_v_two, ahmadullah_v_three, ahmadullah_v_four, ahmadullah_v_five, ahmadullah_v_six;
    LinearLayout ahmadullah_v_seven, ahmadullah_v_eight, ahmadullah_v_nine, ahmadullah_v_ten;

    ImageView demoImg5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shaikh_ahmadullah);



        videoTVdisplay5 = findViewById(R.id.videoTVdisplay5);
        videoTVdisplay5.getSettings().setJavaScriptEnabled(true);
        videoTVdisplay5.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg5 = findViewById(R.id.demoImg5);

        ahmadullah_v_one = findViewById(R.id.ahmadullah_v_one);
        ahmadullah_v_two = findViewById(R.id.ahmadullah_v_two);
        ahmadullah_v_three = findViewById(R.id.ahmadullah_v_three);
        ahmadullah_v_four = findViewById(R.id.ahmadullah_v_four);
        ahmadullah_v_five = findViewById(R.id.ahmadullah_v_five);
        ahmadullah_v_six = findViewById(R.id.ahmadullah_v_six);
        ahmadullah_v_seven = findViewById(R.id.ahmadullah_v_seven);
        ahmadullah_v_eight = findViewById(R.id.ahmadullah_v_eight);
        ahmadullah_v_nine = findViewById(R.id.ahmadullah_v_nine);
        ahmadullah_v_ten = findViewById(R.id.ahmadullah_v_ten);




        // ------------ On Click Set -----------
        ahmadullah_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/bNdzaqEZddk");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/oQBO3oo6hBw");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/59MkJ--9avk");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/LfJ1V4rD7PI");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/cbrXG2N_nio");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/tRdlNfoQihk");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/JKscTW4gCy4");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/yYmoq7TPOMg");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/t7rhDL9fNww");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });


        ahmadullah_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay5.loadUrl("https://www.youtube.com/embed/IpezfUBVybc");
                videoTVdisplay5.setVisibility(View.VISIBLE);
                demoImg5.setVisibility(View.GONE);

            }
        });






    }
}