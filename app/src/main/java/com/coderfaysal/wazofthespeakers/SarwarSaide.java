package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SarwarSaide extends AppCompatActivity {

    WebView videoTVdispla9;
    LinearLayout sarwar_v_one, sarwar_v_two, sarwar_v_three, sarwar_v_four, sarwar_v_five;
    LinearLayout sarwar_v_six, sarwar_v_seven, sarwar_v_eight, sarwar_v_nine, sarwar_v_ten;
    ImageView demoImg9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarwar_saide);



        videoTVdispla9 = findViewById(R.id.videoTVdispla9);
        videoTVdispla9.getSettings().setJavaScriptEnabled(true);
        videoTVdispla9.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg9 = findViewById(R.id.demoImg9);

        sarwar_v_one = findViewById(R.id.sarwar_v_one);
        sarwar_v_two = findViewById(R.id.sarwar_v_two);
        sarwar_v_three = findViewById(R.id.sarwar_v_three);
        sarwar_v_four = findViewById(R.id.sarwar_v_four);
        sarwar_v_five = findViewById(R.id.sarwar_v_five);
        sarwar_v_six = findViewById(R.id.sarwar_v_six);
        sarwar_v_seven = findViewById(R.id.sarwar_v_seven);
        sarwar_v_eight = findViewById(R.id.sarwar_v_eight);
        sarwar_v_nine = findViewById(R.id.sarwar_v_nine);
        sarwar_v_ten = findViewById(R.id.sarwar_v_ten);






        // ------------ On Click Set -----------

        sarwar_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/bK4Gk682Kfc");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });


        sarwar_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/65J_AbC14ps");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });


        sarwar_v_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/0Q7NTb_hcFA");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });

        sarwar_v_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/1jhc6A2I4ms");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });

        sarwar_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/rjClp3hRPC4");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });


        sarwar_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/rFtF_zltWSI");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });


        sarwar_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/vXYeUAhyTQM");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });


        sarwar_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/TPb4lXwAcJo");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });


        sarwar_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/MHZQhmF8lmo");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });

        sarwar_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla9.loadUrl("https://www.youtube.com/embed/fN_U7_G1Zj4");
                videoTVdispla9.setVisibility(View.VISIBLE);
                demoImg9.setVisibility(View.GONE);

            }
        });



    }
}