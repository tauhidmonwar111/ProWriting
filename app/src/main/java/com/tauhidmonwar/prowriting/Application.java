package com.tauhidmonwar.prowriting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class Application extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    ListView containerSearchListView;
    ArrayAdapter<String> searchadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2182490429715106/1332123777");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override public void onAdClosed()
            { mInterstitialAd.loadAd(new AdRequest.Builder().build()); } });
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intertialshow();
            }
        },5000);


        containerSearchListView = findViewById(R.id.containerSearchList);
        String[] composition = getResources().getStringArray(R.array.application);

        searchadapter = new ArrayAdapter<String>(Application.this, R.layout.paragraph_view, R.id.listp, composition);
        containerSearchListView.setAdapter(searchadapter);
        containerSearchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                if (i == 0) {
                    Intent intent = new Intent(Application.this, A0.class);
                    startActivity(intent);
                }if (i == 1) {
                    Intent intent = new Intent(Application.this, A1.class);
                    startActivity(intent);


                }if (i == 2) {
                    Intent intent = new Intent(Application.this, A2.class);
                    startActivity(intent);


                }if (i == 3) {
                    Intent intent = new Intent(Application.this, A3.class);
                    startActivity(intent);


                }if (i == 4) {
                    Intent intent = new Intent(Application.this, A4.class);
                    startActivity(intent);


                }if (i == 5) {
                    Intent intent = new Intent(Application.this, A5.class);
                    startActivity(intent);


                }if (i == 6) {
                    Intent intent = new Intent(Application.this, A6.class);
                    startActivity(intent);


                }if (i == 7) {
                    Intent intent = new Intent(Application.this, A7.class);
                    startActivity(intent);


                }if (i == 8) {
                    Intent intent = new Intent(Application.this, A8.class);
                    startActivity(intent);


                }if (i == 9) {
                    Intent intent = new Intent(Application.this, A9.class);
                    startActivity(intent);


                }if (i == 10) {
                    Intent intent = new Intent(Application.this, A10.class);
                    startActivity(intent);


                }if (i == 11) {
                    Intent intent = new Intent(Application.this, A11.class);
                    startActivity(intent);


                }if (i == 12) {
                    Intent intent = new Intent(Application.this, A12.class);
                    startActivity(intent);


                }if (i == 13) {
                    Intent intent = new Intent(Application.this, A13.class);
                    startActivity(intent);


                }if (i == 14) {
                    Intent intent = new Intent(Application.this, A14.class);
                    startActivity(intent);


                }if (i == 15) {
                    Intent intent = new Intent(Application.this, A15.class);
                    startActivity(intent);


                }if (i == 16) {
                    Intent intent = new Intent(Application.this, A16.class);
                    startActivity(intent);


                }if (i == 17) {
                    Intent intent = new Intent(Application.this, A17.class);
                    startActivity(intent);


                }if (i == 18) {
                    Intent intent = new Intent(Application.this, A18.class);
                    startActivity(intent);


                }if (i == 19) {
                    Intent intent = new Intent(Application.this, A19.class);
                    startActivity(intent);


                }if (i == 20) {
                    Intent intent = new Intent(Application.this, A20.class);
                    startActivity(intent);


                }if (i == 21) {
                    Intent intent = new Intent(Application.this, A21.class);
                    startActivity(intent);


                }if (i == 22) {
                    Intent intent = new Intent(Application.this, A22.class);
                    startActivity(intent);


                }if (i == 23) {
                    Intent intent = new Intent(Application.this, A23.class);
                    startActivity(intent);


                }if (i == 24) {
                    Intent intent = new Intent(Application.this, A24.class);
                    startActivity(intent);


                }if (i == 25) {
                    Intent intent = new Intent(Application.this, A25.class);
                    startActivity(intent);


                }if (i == 26) {
                    Intent intent = new Intent(Application.this, A26.class);
                    startActivity(intent);


                }if (i == 27) {
                    Intent intent = new Intent(Application.this, A27.class);
                    startActivity(intent);


                }if (i == 28) {
                    Intent intent = new Intent(Application.this, A28.class);
                    startActivity(intent);


                }if (i == 29) {
                    Intent intent = new Intent(Application.this, A29.class);
                    startActivity(intent);


                }if (i == 30) {
                    Intent intent = new Intent(Application.this, A30.class);
                    startActivity(intent);


                }if (i == 31) {
                    Intent intent = new Intent(Application.this, A31.class);
                    startActivity(intent);


                }if (i == 32) {
                    Intent intent = new Intent(Application.this, A32.class);
                    startActivity(intent);


                }if (i == 33) {
                    Intent intent = new Intent(Application.this, A33.class);
                    startActivity(intent);


                }if (i == 34) {
                    Intent intent = new Intent(Application.this, A34.class);
                    startActivity(intent);


                }if (i == 35) {
                    Intent intent = new Intent(Application.this, A35.class);
                    startActivity(intent);


                }if (i == 36) {
                    Intent intent = new Intent(Application.this, A36.class);
                    startActivity(intent);


                }if (i == 37) {
                    Intent intent = new Intent(Application.this, A37.class);
                    startActivity(intent);


                }if (i == 38) {
                    Intent intent = new Intent(Application.this, A38.class);
                    startActivity(intent);


                }if (i == 39) {
                    Intent intent = new Intent(Application.this, A39.class);
                    startActivity(intent);


                }if (i == 40) {
                    Intent intent = new Intent(Application.this, A40.class);
                    startActivity(intent);


                }if (i == 41) {
                    Intent intent = new Intent(Application.this, A41.class);
                    startActivity(intent);


                }if (i == 42) {
                    Intent intent = new Intent(Application.this, A42.class);
                    startActivity(intent);


                }if (i == 43) {
                    Intent intent = new Intent(Application.this, A43.class);
                    startActivity(intent);


                }if (i == 44) {
                    Intent intent = new Intent(Application.this, A44.class);
                    startActivity(intent);


                }if (i == 45) {
                    Intent intent = new Intent(Application.this, A45.class);
                    startActivity(intent);


                }if (i == 46) {
                    Intent intent = new Intent(Application.this, A46.class);
                    startActivity(intent);


                }if (i == 47) {
                    Intent intent = new Intent(Application.this, A47.class);
                    startActivity(intent);


                }if (i == 48) {
                    Intent intent = new Intent(Application.this, A48.class);
                    startActivity(intent);


                }if (i == 49) {
                    Intent intent = new Intent(Application.this, A49.class);
                    startActivity(intent);


                }
            }
        });
    }

    public void Intertialshow()
    { if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); }
    else
    {


    } }

}
