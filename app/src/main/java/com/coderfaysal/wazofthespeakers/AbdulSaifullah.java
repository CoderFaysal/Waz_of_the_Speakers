package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AbdulSaifullah extends AppCompatActivity {

    WebView videoTVdisplay3;
    LinearLayout saifullah_v_one, saifullah_v_two, saifullah_v_third, saifullah_v_forth, saifullah_v_five, saifullah_v_six;
    LinearLayout saifullah_v_seven, saifullah_v_eight, saifullah_v_nine, saifullah_v_ten, saifullah_v_eleven;
    ImageView demoImg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abdul_saifullah);


        videoTVdisplay3 = findViewById(R.id.videoTVdisplay3);
        videoTVdisplay3.getSettings().setJavaScriptEnabled(true);
        videoTVdisplay3.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg3 = findViewById(R.id.demoImg3);

        saifullah_v_one = findViewById(R.id.saifullah_v_one);
        saifullah_v_two = findViewById(R.id.saifullah_v_two);
        saifullah_v_third = findViewById(R.id.saifullah_v_third);
        saifullah_v_forth = findViewById(R.id.saifullah_v_forth);
        saifullah_v_five = findViewById(R.id.saifullah_v_five);
        saifullah_v_six = findViewById(R.id.saifullah_v_six);
        saifullah_v_seven = findViewById(R.id.saifullah_v_seven);
        saifullah_v_eight = findViewById(R.id.saifullah_v_eight);
        saifullah_v_nine = findViewById(R.id.saifullah_v_nine);
        saifullah_v_ten = findViewById(R.id.saifullah_v_ten);
        saifullah_v_eleven = findViewById(R.id.saifullah_v_eleven);





        // ------------ On Click Set -----------
        saifullah_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/kSnSczs9olI");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/16vQmSwE2iE");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/3oZd9OZh6Nc");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/zYRf4Ienv1k");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/8FJhcJMGayU");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/7Evr0r9Nw2w");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/DfCFIG3usbI");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/J_7yM7LG81c");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/8756Oq5_YwA");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });

        saifullah_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/WSDBaN8UEWc");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });


        saifullah_v_eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay3.loadUrl("https://www.youtube.com/embed/v0PjfzQAI-8");
                videoTVdisplay3.setVisibility(View.VISIBLE);
                demoImg3.setVisibility(View.GONE);

            }
        });







    }
}