package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MijanurRahman extends AppCompatActivity {

    WebView videoTVdisplay;
    LinearLayout mijanur_v_one, mijanur_v_two, mijanur_v_third, mijanur_v_forth, mijanur_v_five, mijanur_v_six;
    LinearLayout mijanur_v_seven, mijanur_v_eight, mijanur_v_nine, mijanur_v_ten, mijanur_v_eleven;
    ImageView demoImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mijanur_rahman);

        videoTVdisplay = findViewById(R.id.videoTVdisplay);
        videoTVdisplay.getSettings().setJavaScriptEnabled(true);
        videoTVdisplay.setWebViewClient(new WebViewClient());



        // ------------- Id Find ------------
        demoImg = findViewById(R.id.demoImg);
        mijanur_v_one = findViewById(R.id.mijanur_v_one);
        mijanur_v_two = findViewById(R.id.mijanur_v_two);
        mijanur_v_third = findViewById(R.id.mijanur_v_third);
        mijanur_v_forth = findViewById(R.id.mijanur_v_forth);
        mijanur_v_five = findViewById(R.id.mijanur_v_five);
        mijanur_v_six = findViewById(R.id.mijanur_v_six);
        mijanur_v_seven = findViewById(R.id.mijanur_v_seven);
        mijanur_v_eight = findViewById(R.id.mijanur_v_eight);
        mijanur_v_nine = findViewById(R.id.mijanur_v_nine);
        mijanur_v_ten = findViewById(R.id.mijanur_v_ten);
        mijanur_v_eleven = findViewById(R.id.mijanur_v_eleven);






        // ------------ On Click Set -----------
        mijanur_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/bFIheGltBC8");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);

            }
        });



        mijanur_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/prZrvfpMQ9U");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });



        mijanur_v_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/cWfNnCaH6MI");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });



        mijanur_v_forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/UQokR2tslts");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });



        mijanur_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/r40Dk-ABcho");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });



        mijanur_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/ddIwxKFy1K8");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });



        mijanur_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/Hh_a6KL5Q5E");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });


        mijanur_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/pQaYJAlJFmo");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });



        mijanur_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/3_R4Ck30wCY");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });



        mijanur_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/S_0rlBiTJXo");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });



        mijanur_v_eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdisplay.loadUrl("https://www.youtube.com/embed/m0tu35QRip8");
                videoTVdisplay.setVisibility(View.VISIBLE);
                demoImg.setVisibility(View.GONE);
            }
        });











    }

}
