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

public class Story extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    ListView containerSearchListView;
    ArrayAdapter<String> searchadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2182490429715106/9078751858");
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
        String[] composition = getResources().getStringArray(R.array.story);

        searchadapter = new ArrayAdapter<String>(Story.this, R.layout.paragraph_view, R.id.listp, composition);
        containerSearchListView.setAdapter(searchadapter);
        containerSearchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                if (i == 0) {
                    Intent intent = new Intent(Story.this, S0.class);
                    startActivity(intent);
                }if (i == 1) {
                    Intent intent = new Intent(Story.this,S1.class);
                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent(Story.this,S2.class);
                    startActivity(intent);
                }
                if (i == 3) {
                    Intent intent = new Intent(Story.this,S3.class);
                    startActivity(intent);
                }
                if (i == 4) {
                    Intent intent = new Intent(Story.this,S4.class);
                    startActivity(intent);
                }
                if (i == 5) {
                    Intent intent = new Intent(Story.this,S5.class);
                    startActivity(intent);
                }
                if (i == 6) {
                    Intent intent = new Intent(Story.this,S6.class);
                    startActivity(intent);
                }
                if (i == 7) {
                    Intent intent = new Intent(Story.this,S7.class);
                    startActivity(intent);
                }
                if (i == 8) {
                    Intent intent = new Intent(Story.this,S8.class);
                    startActivity(intent);
                }
                if (i == 9) {
                    Intent intent = new Intent(Story.this,S9.class);
                    startActivity(intent);
                }
                if (i == 10) {
                    Intent intent = new Intent(Story.this,S10.class);
                    startActivity(intent);
                }
                if (i == 11) {
                    Intent intent = new Intent(Story.this,S11.class);
                    startActivity(intent);
                }
                if (i == 12) {
                    Intent intent = new Intent(Story.this,S12.class);
                    startActivity(intent);
                }
                if (i == 13) {
                    Intent intent = new Intent(Story.this,S13.class);
                    startActivity(intent);
                }
                if (i == 14) {
                    Intent intent = new Intent(Story.this,S14.class);
                    startActivity(intent);
                }
                if (i == 15) {
                    Intent intent = new Intent(Story.this,S15.class);
                    startActivity(intent);
                }
                if (i == 16) {
                    Intent intent = new Intent(Story.this,S16.class);
                    startActivity(intent);
                }
                if (i == 17) {
                    Intent intent = new Intent(Story.this,S17.class);
                    startActivity(intent);
                }
                if (i == 18) {
                    Intent intent = new Intent(Story.this,S18.class);
                    startActivity(intent);
                }
                if (i == 19) {
                    Intent intent = new Intent(Story.this,S19.class);
                    startActivity(intent);
                }
                if (i == 20) {
                    Intent intent = new Intent(Story.this,S20.class);
                    startActivity(intent);
                }
                if (i == 21) {
                    Intent intent = new Intent(Story.this,S21.class);
                    startActivity(intent);
                }
                if (i == 22) {
                    Intent intent = new Intent(Story.this,S22.class);
                    startActivity(intent);
                }
                if (i == 23) {
                    Intent intent = new Intent(Story.this,S23.class);
                    startActivity(intent);
                }
                if (i == 24) {
                    Intent intent = new Intent(Story.this,S24.class);
                    startActivity(intent);
                }
                if (i == 25) {
                    Intent intent = new Intent(Story.this,S25.class);
                    startActivity(intent);
                }
                if (i == 26) {
                    Intent intent = new Intent(Story.this,S26.class);
                    startActivity(intent);
                }
                if (i == 27) {
                    Intent intent = new Intent(Story.this,S27.class);
                    startActivity(intent);
                }
                if (i == 28) {
                    Intent intent = new Intent(Story.this,S28.class);
                    startActivity(intent);
                }
                if (i == 29) {
                    Intent intent = new Intent(Story.this,S29.class);
                    startActivity(intent);
                }
                if (i == 30) {
                    Intent intent = new Intent(Story.this,S30.class);
                    startActivity(intent);
                }
                if (i == 31) {
                    Intent intent = new Intent(Story.this,S31.class);
                    startActivity(intent);
                }
                if (i == 32) {
                    Intent intent = new Intent(Story.this,S32.class);
                    startActivity(intent);
                }
                if (i == 33) {
                    Intent intent = new Intent(Story.this,S33.class);
                    startActivity(intent);
                }
                if (i == 34) {
                    Intent intent = new Intent(Story.this,S34.class);
                    startActivity(intent);
                }
                if (i == 35) {
                    Intent intent = new Intent(Story.this,S35.class);
                    startActivity(intent);
                }
                if (i == 36) {
                    Intent intent = new Intent(Story.this,S36.class);
                    startActivity(intent);
                }if (i == 37) {
                    Intent intent = new Intent(Story.this,S37.class);
                    startActivity(intent);
                }if (i == 38) {
                    Intent intent = new Intent(Story.this,S38.class);
                    startActivity(intent);
                }
                if (i == 39) {
                    Intent intent = new Intent(Story.this,S39.class);
                    startActivity(intent);
                }
                if (i == 40) {
                    Intent intent = new Intent(Story.this,S40.class);
                    startActivity(intent);
                }
                if (i == 41) {
                    Intent intent = new Intent(Story.this,S41.class);
                    startActivity(intent);
                }
                if (i == 42) {
                    Intent intent = new Intent(Story.this,S42.class);
                    startActivity(intent);
                }
                if (i == 43) {
                    Intent intent = new Intent(Story.this,S43.class);
                    startActivity(intent);
                }
                if (i == 44) {
                    Intent intent = new Intent(Story.this,S44.class);
                    startActivity(intent);
                }
                if (i == 45) {
                    Intent intent = new Intent(Story.this,S45.class);
                    startActivity(intent);
                }
                if (i == 46) {
                    Intent intent = new Intent(Story.this,S46.class);
                    startActivity(intent);
                }
                if (i == 47) {
                    Intent intent = new Intent(Story.this,S47.class);
                    startActivity(intent);
                }
                if (i == 48) {
                    Intent intent = new Intent(Story.this,S48.class);
                    startActivity(intent);
                }
                if (i == 49) {
                    Intent intent = new Intent(Story.this,S49.class);
                    startActivity(intent);
                }
                if (i == 50) {
                    Intent intent = new Intent(Story.this,S50.class);
                    startActivity(intent);
                }if (i == 51) {
                    Intent intent = new Intent(Story.this,S51.class);
                    startActivity(intent);
                }if (i == 52) {
                    Intent intent = new Intent(Story.this,S52.class);
                    startActivity(intent);
                }
                if (i == 53) {
                    Intent intent = new Intent(Story.this,S53.class);
                    startActivity(intent);
                }if (i == 54) {
                    Intent intent = new Intent(Story.this,S54.class);
                    startActivity(intent);
                }
                if (i == 55) {
                    Intent intent = new Intent(Story.this,S55.class);
                    startActivity(intent);
                }if (i == 56) {
                    Intent intent = new Intent(Story.this,S56.class);
                    startActivity(intent);
                }
                if (i == 57) {
                    Intent intent = new Intent(Story.this,S57.class);
                    startActivity(intent);
                }if (i == 58) {
                    Intent intent = new Intent(Story.this,S58.class);
                    startActivity(intent);
                }if (i == 59) {
                    Intent intent = new Intent(Story.this,S59.class);
                    startActivity(intent);
                }if (i == 60) {
                    Intent intent = new Intent(Story.this,S60.class);
                    startActivity(intent);
                }
                if (i == 61) {
                    Intent intent = new Intent(Story.this,S61.class);
                    startActivity(intent);
                }
                if (i == 62) {
                    Intent intent = new Intent(Story.this,S62.class);
                    startActivity(intent);
                }if (i == 63) {
                    Intent intent = new Intent(Story.this,S63.class);
                    startActivity(intent);
                }
                if (i == 64) {
                    Intent intent = new Intent(Story.this,S64.class);
                    startActivity(intent);
                }
                if (i == 65) {
                    Intent intent = new Intent(Story.this,S65.class);
                    startActivity(intent);
                }
                if (i == 66) {
                    Intent intent = new Intent(Story.this,S66.class);
                    startActivity(intent);
                }
                if (i == 67) {
                    Intent intent = new Intent(Story.this,S67.class);
                    startActivity(intent);
                }
                if (i == 68) {
                    Intent intent = new Intent(Story.this,S68.class);
                    startActivity(intent);
                }if (i == 69) {
                    Intent intent = new Intent(Story.this,S69.class);
                    startActivity(intent);
                }if (i == 70) {
                    Intent intent = new Intent(Story.this,S70.class);
                    startActivity(intent);
                }if (i == 71) {
                    Intent intent = new Intent(Story.this,S71.class);
                    startActivity(intent);
                }if (i == 72) {
                    Intent intent = new Intent(Story.this,S72.class);
                    startActivity(intent);
                }if (i == 73) {
                    Intent intent = new Intent(Story.this,S73.class);
                    startActivity(intent);
                }if (i == 74) {
                    Intent intent = new Intent(Story.this,S74.class);
                    startActivity(intent);
                }if (i == 75) {
                    Intent intent = new Intent(Story.this,S75.class);
                    startActivity(intent);
                }if (i == 76) {
                    Intent intent = new Intent(Story.this,S76.class);
                    startActivity(intent);
                }if (i == 77) {
                    Intent intent = new Intent(Story.this,S77.class);
                    startActivity(intent);
                }if (i == 78) {
                    Intent intent = new Intent(Story.this,S78.class);
                    startActivity(intent);
                }if (i == 79) {
                    Intent intent = new Intent(Story.this,S79.class);
                    startActivity(intent);
                }if (i == 80) {
                    Intent intent = new Intent(Story.this,S80.class);
                    startActivity(intent);
                }if (i == 81) {
                    Intent intent = new Intent(Story.this,S81.class);
                    startActivity(intent);
                }if (i == 82) {
                    Intent intent = new Intent(Story.this,S82.class);
                    startActivity(intent);
                }if (i == 83) {
                    Intent intent = new Intent(Story.this,S83.class);
                    startActivity(intent);
                }if (i == 84) {
                    Intent intent = new Intent(Story.this,S84.class);
                    startActivity(intent);
                }if (i == 85) {
                    Intent intent = new Intent(Story.this,S85.class);
                    startActivity(intent);
                }if (i == 86) {
                    Intent intent = new Intent(Story.this,S86.class);
                    startActivity(intent);
                }if (i == 87) {
                    Intent intent = new Intent(Story.this,S87.class);
                    startActivity(intent);
                }if (i == 88) {
                    Intent intent = new Intent(Story.this,S88.class);
                    startActivity(intent);
                }if (i == 89) {
                    Intent intent = new Intent(Story.this,S89.class);
                    startActivity(intent);
                }if (i == 90) {
                    Intent intent = new Intent(Story.this,S90.class);
                    startActivity(intent);
                }if (i == 91) {
                    Intent intent = new Intent(Story.this,S91.class);
                    startActivity(intent);
                }if (i == 92) {
                    Intent intent = new Intent(Story.this,S92.class);
                    startActivity(intent);
                }if (i == 93) {
                    Intent intent = new Intent(Story.this,S93.class);
                    startActivity(intent);
                }if (i == 94) {
                    Intent intent = new Intent(Story.this,S94.class);
                    startActivity(intent);
                }if (i == 95) {
                    Intent intent = new Intent(Story.this,S95.class);
                    startActivity(intent);
                }if (i == 96) {
                    Intent intent = new Intent(Story.this,S96.class);
                    startActivity(intent);
                }if (i == 97) {
                    Intent intent = new Intent(Story.this,S97.class);
                    startActivity(intent);
                }if (i == 98) {
                    Intent intent = new Intent(Story.this,S98.class);
                    startActivity(intent);
                }if (i == 99) {
                    Intent intent = new Intent(Story.this,S99.class);
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
