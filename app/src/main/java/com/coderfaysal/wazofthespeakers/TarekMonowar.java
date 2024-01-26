package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TarekMonowar extends AppCompatActivity {

    WebView videoTVdispla7;
    LinearLayout tarek_v_one, tarek_v_two, tarek_v_three, tarek_v_four, tarek_v_five;
    LinearLayout tarek_v_six, tarek_v_seven, tarek_v_eight, tarek_v_nine, tarek_v_ten;

    ImageView demoImg7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarek_monowar);


        videoTVdispla7 = findViewById(R.id.videoTVdispla7);
        videoTVdispla7.getSettings().setJavaScriptEnabled(true);
        videoTVdispla7.setWebViewClient(new WebViewClient());


        // ------------- Id Find ------------
        demoImg7 = findViewById(R.id.demoImg7);

        tarek_v_one = findViewById(R.id.tarek_v_one);
        tarek_v_two = findViewById(R.id.tarek_v_two);
        tarek_v_three = findViewById(R.id.tarek_v_three);
        tarek_v_four = findViewById(R.id.tarek_v_four);
        tarek_v_five = findViewById(R.id.tarek_v_five);
        tarek_v_six = findViewById(R.id.tarek_v_six);
        tarek_v_seven = findViewById(R.id.tarek_v_seven);
        tarek_v_eight = findViewById(R.id.tarek_v_eight);
        tarek_v_nine = findViewById(R.id.tarek_v_nine);
        tarek_v_ten = findViewById(R.id.tarek_v_ten);





        // ------------ On Click Set -----------
        tarek_v_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/4sapGeOGybo");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/rzi31XQ0cWQ");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/1vkYTzKpzTo");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/er-fQesAHbg");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/spZZR3HNKbU");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/OEYVDrRzZpE");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/JHEdX8wFYNU");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/RLU0raQsQrY");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/wSpDRZvWAUk");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });


        tarek_v_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoTVdispla7.loadUrl("https://www.youtube.com/embed/WRIu1aqG_mQ");
                videoTVdispla7.setVisibility(View.VISIBLE);
                demoImg7.setVisibility(View.GONE);

            }
        });




    }
}