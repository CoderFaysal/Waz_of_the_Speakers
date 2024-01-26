package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AbuToha extends AppCompatActivity {

    WebView videoTVdisplay1;
    LinearLayout toha_v_one, toha_v_two, toha_v_third, toha_v_forth, toha_v_five, toha_v_six;
    LinearLayout toha_v_seven, toha_v_eight, toha_v_nine, toha_v_ten, toha_v_eleven, toha_v_twelve;
    ImageView demoImg1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abu_toha);

        videoTVdisplay1 = findViewById(R.id.videoTVdisplay1);
        videoTVdisplay1.getSettings().setJavaScriptEnabled(true);
        videoTVdisplay1.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg1 = findViewById(R.id.demoImg1);
        toha_v_one = findViewById(R.id.toha_v_one);
        toha_v_two = findViewById(R.id.toha_v_two);
        toha_v_third = findViewById(R.id.toha_v_third);
        toha_v_forth = findViewById(R.id.toha_v_forth);
        toha_v_five = findViewById(R.id.toha_v_five);
        toha_v_six = findViewById(R.id.toha_v_six);
        toha_v_seven = findViewById(R.id.toha_v_seven);
        toha_v_eight = findViewById(R.id.toha_v_eight);
        toha_v_nine = findViewById(R.id.toha_v_nine);
        toha_v_ten = findViewById(R.id.toha_v_ten);
        toha_v_eleven = findViewById(R.id.toha_v_eleven);
        toha_v_twelve = findViewById(R.id.toha_v_twelve);



        // ------------ On Click Set -----------
        toha_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/NhlSnvK0b04");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/2uYNlX-CJUI");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/YtgEPbFLAKw");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/_o9kcvlzkI4");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/J1loLYJS8rE");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/45D_dOVErXc");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/vwyBYCM4NS0");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/Bt2bO5YjHL4");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/CBfn_OvHJLo");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/kRyI0-FHMqo");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/NMhQOnIqBSU");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });


        toha_v_twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay1.loadUrl("https://www.youtube.com/embed/T_D7YAjKDc8");
                videoTVdisplay1.setVisibility(View.VISIBLE);
                demoImg1.setVisibility(View.GONE);

            }
        });




    }
}