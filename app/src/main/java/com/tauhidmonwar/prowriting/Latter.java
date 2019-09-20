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

public class Latter extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    ListView containerSearchListView;
    ArrayAdapter<String > searchadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latter);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2182490429715106/3937465185");
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
        String[] composition = getResources().getStringArray(R.array.latter);





        searchadapter = new ArrayAdapter<String>(Latter.this,R.layout.paragraph_view,R.id.listp,composition);
        containerSearchListView.setAdapter(searchadapter);
        containerSearchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                if (i == 0) {
                    Intent intent = new Intent(Latter.this, L0.class);
                    startActivity(intent);
                }if (i == 1) {
                    Intent intent = new Intent(Latter.this, L1.class);
                    startActivity(intent);
                }if (i == 2) {
                    Intent intent = new Intent(Latter.this, L2.class);
                    startActivity(intent);
                }if (i == 3) {
                    Intent intent = new Intent(Latter.this, L3.class);
                    startActivity(intent);
                }if (i == 4) {
                    Intent intent = new Intent(Latter.this, L4.class);
                    startActivity(intent);
                }if (i == 5) {
                    Intent intent = new Intent(Latter.this, L5.class);
                    startActivity(intent);
                }if (i == 6) {
                    Intent intent = new Intent(Latter.this, L6.class);
                    startActivity(intent);
                }if (i == 7) {
                    Intent intent = new Intent(Latter.this, L7.class);
                    startActivity(intent);
                }if (i == 8) {
                    Intent intent = new Intent(Latter.this, L8.class);
                    startActivity(intent);
                }if (i == 9) {
                    Intent intent = new Intent(Latter.this, L9.class);
                    startActivity(intent);
                }if (i == 10) {
                    Intent intent = new Intent(Latter.this, L10.class);
                    startActivity(intent);
                }if (i == 11) {
                    Intent intent = new Intent(Latter.this, L11.class);
                    startActivity(intent);
                }if (i == 12) {
                    Intent intent = new Intent(Latter.this, L12.class);
                    startActivity(intent);
                }if (i == 13) {
                    Intent intent = new Intent(Latter.this, L13.class);
                    startActivity(intent);
                }if (i == 14) {
                    Intent intent = new Intent(Latter.this, L14.class);
                    startActivity(intent);
                }if (i == 15) {
                    Intent intent = new Intent(Latter.this, L15.class);
                    startActivity(intent);
                }if (i == 16) {
                    Intent intent = new Intent(Latter.this, L16.class);
                    startActivity(intent);
                }if (i == 17) {
                    Intent intent = new Intent(Latter.this, L17.class);
                    startActivity(intent);
                }if (i == 18) {
                    Intent intent = new Intent(Latter.this, L18.class);
                    startActivity(intent);
                }if (i == 19) {
                    Intent intent = new Intent(Latter.this, L19.class);
                    startActivity(intent);
                }if (i == 20) {
                    Intent intent = new Intent(Latter.this, L20.class);
                    startActivity(intent);
                }if (i == 21) {
                    Intent intent = new Intent(Latter.this, L21.class);
                    startActivity(intent);
                }if (i == 22) {
                    Intent intent = new Intent(Latter.this, L22.class);
                    startActivity(intent);
                }if (i == 23) {
                    Intent intent = new Intent(Latter.this, L23.class);
                    startActivity(intent);
                }if (i == 24) {
                    Intent intent = new Intent(Latter.this, L24.class);
                    startActivity(intent);
                }if (i == 25) {
                    Intent intent = new Intent(Latter.this, L25.class);
                    startActivity(intent);
                }if (i == 26) {
                    Intent intent = new Intent(Latter.this, L26.class);
                    startActivity(intent);
                }if (i == 27) {
                    Intent intent = new Intent(Latter.this, L27.class);
                    startActivity(intent);
                }if (i == 28) {
                    Intent intent = new Intent(Latter.this, L28.class);
                    startActivity(intent);
                }if (i == 29) {
                    Intent intent = new Intent(Latter.this, L29.class);
                    startActivity(intent);
                }if (i == 30) {
                    Intent intent = new Intent(Latter.this, L30.class);
                    startActivity(intent);
                }if (i == 31) {
                    Intent intent = new Intent(Latter.this, L31.class);
                    startActivity(intent);
                }if (i == 32) {
                    Intent intent = new Intent(Latter.this, L32.class);
                    startActivity(intent);
                }if (i == 33) {
                    Intent intent = new Intent(Latter.this, L33.class);
                    startActivity(intent);
                }if (i == 34) {
                    Intent intent = new Intent(Latter.this, L34.class);
                    startActivity(intent);
                }if (i == 35) {
                    Intent intent = new Intent(Latter.this, L35.class);
                    startActivity(intent);
                }if (i == 36) {
                    Intent intent = new Intent(Latter.this, L36.class);
                    startActivity(intent);
                }if (i == 37) {
                    Intent intent = new Intent(Latter.this, L37.class);
                    startActivity(intent);
                }if (i == 38) {
                    Intent intent = new Intent(Latter.this, L38.class);
                    startActivity(intent);
                }if (i == 39) {
                    Intent intent = new Intent(Latter.this, L39.class);
                    startActivity(intent);
                }if (i == 40) {
                    Intent intent = new Intent(Latter.this, L40.class);
                    startActivity(intent);
                }if (i == 41) {
                    Intent intent = new Intent(Latter.this, L41.class);
                    startActivity(intent);
                }if (i == 42) {
                    Intent intent = new Intent(Latter.this, L42.class);
                    startActivity(intent);
                }if (i == 43) {
                    Intent intent = new Intent(Latter.this, L43.class);
                    startActivity(intent);
                }if (i == 44) {
                    Intent intent = new Intent(Latter.this, L44.class);
                    startActivity(intent);
                }if (i == 45) {
                    Intent intent = new Intent(Latter.this, L45.class);
                    startActivity(intent);
                }if (i == 46) {
                    Intent intent = new Intent(Latter.this, L46.class);
                    startActivity(intent);
                }if (i == 47) {
                    Intent intent = new Intent(Latter.this, L47.class);
                    startActivity(intent);
                }if (i == 48) {
                    Intent intent = new Intent(Latter.this, L48.class);
                    startActivity(intent);
                }if (i == 49) {
                    Intent intent = new Intent(Latter.this, L49.class);
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
