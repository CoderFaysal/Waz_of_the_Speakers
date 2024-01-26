package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AbrarulAsif extends AppCompatActivity {

    WebView videoTVdisplay2;
    LinearLayout asif_v_one, asif_v_two, asif_v_third, asif_v_forth, asif_v_five, asif_v_six;
    LinearLayout asif_v_seven, asif_v_eight, asif_v_nine, asif_v_ten;
    ImageView demoImg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abrarul_asif);


        videoTVdisplay2 = findViewById(R.id.videoTVdisplay2);
        videoTVdisplay2.getSettings().setJavaScriptEnabled(true);
        videoTVdisplay2.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg2 = findViewById(R.id.demoImg2);

        asif_v_one = findViewById(R.id.asif_v_one);
        asif_v_two = findViewById(R.id.asif_v_two);
        asif_v_third = findViewById(R.id.asif_v_third);
        asif_v_forth = findViewById(R.id.asif_v_forth);
        asif_v_five = findViewById(R.id.asif_v_five);
        asif_v_six = findViewById(R.id.asif_v_six);
        asif_v_seven = findViewById(R.id.asif_v_seven);
        asif_v_eight = findViewById(R.id.asif_v_eight);
        asif_v_nine = findViewById(R.id.asif_v_nine);
        asif_v_ten = findViewById(R.id.asif_v_ten);




        // ------------ On Click Set -----------
        asif_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/VnxPOHB7wVU");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/cBe04q2Ft1I");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/MMeyWRFTxCY");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/QSeHNqk4m-Q");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/DUTCXP2bw9s");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/RBy3hR7BQ5o");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/h-D1seoVuVk");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/wQfoCWNZ-ZA");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/l0pglm6rrtI");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });


        asif_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay2.loadUrl("https://www.youtube.com/embed/OwTQL6noy6o");
                videoTVdisplay2.setVisibility(View.VISIBLE);
                demoImg2.setVisibility(View.GONE);

            }
        });






    }
}