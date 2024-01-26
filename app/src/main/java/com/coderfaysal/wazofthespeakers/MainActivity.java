package com.coderfaysal.wazofthespeakers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import com.onesignal.OneSignal;


public class MainActivity extends AppCompatActivity {
    private static final String ONESIGNAL_APP_ID = "";

    ImageSlider imageSlider;

    LinearLayout mijan, toha, asif, saifullah, amirhamza, ahmadullah, mamunul, tarek, jamshed, sarwar_saide, thank_you;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);


        //-----------------------------------------------------------------


        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.muftiamirhamzacover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.mizanurrahmanajharicover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.jamshedmajumdarcover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.golamsarwarsaidecover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.allamatarekmonowarcover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.allamamamunulhoquecover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.abutohamadnancover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.abrarulhaqueasifcover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.abdulsaifullahcover,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.shaikhahmadullahcover,ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList);


        // ------------ Id Finding -------------

        mijan = findViewById(R.id.mijan);
        toha = findViewById(R.id.toha);
        asif = findViewById(R.id.asif);
        saifullah = findViewById(R.id.saifullah);
        amirhamza = findViewById(R.id.amirhamza);
        ahmadullah = findViewById(R.id.ahmadullah);
        mamunul = findViewById(R.id.mamunul);
        tarek = findViewById(R.id.tarek);
        jamshed = findViewById(R.id.jamshed);
        sarwar_saide = findViewById(R.id.sarwar_saide);
        thank_you = findViewById(R.id.thank_you);





        //  ------------- One Click ------------

        mijan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MijanurRahman.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Mizanur Rahman Ajhari Waz", Toast.LENGTH_LONG).show();

            }
        });


        toha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AbuToha.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Abu Toha Mohammad Adnan Waz", Toast.LENGTH_LONG).show();

            }
        });


        asif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AbrarulAsif.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Abrarul Haque Asif Waz", Toast.LENGTH_LONG).show();

            }
        });


        saifullah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AbdulSaifullah.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Abdul Hi Md. Saifullah Waz", Toast.LENGTH_LONG).show();

            }
        });


        amirhamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AmirHamza.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Mufti Amir Hamza Waz", Toast.LENGTH_LONG).show();

            }
        });



        ahmadullah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ShaikhAhmadullah.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Shaikh Ahmadullah Waz", Toast.LENGTH_LONG).show();

            }
        });

        mamunul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MamunulHoque.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Allama Mamunul Hoque Waz", Toast.LENGTH_LONG).show();

            }
        });


        tarek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TarekMonowar.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Allama Tarek Monowar Waz", Toast.LENGTH_LONG).show();

            }
        });


        jamshed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, JamshedMajumdar.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Jamshed Majumdar Waz", Toast.LENGTH_LONG).show();

            }
        });


        sarwar_saide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SarwarSaide.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Golam Sarwar Saide Waz", Toast.LENGTH_LONG).show();

            }
        });



        // ------------ More App ---------


        thank_you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://play.google.com/store/apps/details?="+ BuildConfig.APPLICATION_ID);
            }
        });






    }

    // ----- Url Link Private -----
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    // ========== Back Press Popup =====================

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("প্রিয় শায়েখদের ওয়াজ");
        builder.setMessage("Do you want to close this?");
        builder.setCancelable(false);
        builder.setPositiveButton(
                "Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }
        );
        builder.setNegativeButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }
        );
        AlertDialog dialog = builder.create();
        builder.show();
    }



}