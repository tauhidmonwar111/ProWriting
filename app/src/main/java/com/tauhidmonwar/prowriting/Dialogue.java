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

public class Dialogue extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    ListView containerSearchListView;
    ArrayAdapter<String > searchadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2182490429715106/7765670184");
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
        String[] composition = getResources().getStringArray(R.array.dialogue);

        searchadapter = new ArrayAdapter<String>(Dialogue.this, R.layout.paragraph_view, R.id.listp, composition);
        containerSearchListView.setAdapter(searchadapter);
        containerSearchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(Dialogue.this, D0.class);
                    startActivity(intent);
                }if (i == 1) {
                    Intent intent = new Intent(Dialogue.this, D1.class);
                    startActivity(intent);
                }if (i == 2) {
                    Intent intent = new Intent(Dialogue.this, D2.class);
                    startActivity(intent);
                }if (i == 3) {
                    Intent intent = new Intent(Dialogue.this, D3.class);
                    startActivity(intent);
                }if (i == 4) {
                    Intent intent = new Intent(Dialogue.this, D4.class);
                    startActivity(intent);
                }if (i == 5) {
                    Intent intent = new Intent(Dialogue.this, D5.class);
                    startActivity(intent);
                }if (i == 6) {
                    Intent intent = new Intent(Dialogue.this, D6.class);
                    startActivity(intent);
                }if (i == 7) {
                    Intent intent = new Intent(Dialogue.this, D7.class);
                    startActivity(intent);
                }if (i == 8) {
                    Intent intent = new Intent(Dialogue.this, D8.class);
                    startActivity(intent);
                }if (i == 9) {
                    Intent intent = new Intent(Dialogue.this, D9.class);
                    startActivity(intent);
                }if (i == 10) {
                    Intent intent = new Intent(Dialogue.this, D10.class);
                    startActivity(intent);
                }if (i == 11) {
                    Intent intent = new Intent(Dialogue.this, D11.class);
                    startActivity(intent);
                }if (i == 12) {
                    Intent intent = new Intent(Dialogue.this, D12.class);
                    startActivity(intent);
                }if (i == 13) {
                    Intent intent = new Intent(Dialogue.this, D13.class);
                    startActivity(intent);
                }if (i == 14) {
                    Intent intent = new Intent(Dialogue.this, D14.class);
                    startActivity(intent);
                }if (i == 15) {
                    Intent intent = new Intent(Dialogue.this, D15.class);
                    startActivity(intent);
                }if (i == 16) {
                    Intent intent = new Intent(Dialogue.this, D16.class);
                    startActivity(intent);
                }if (i == 17) {
                    Intent intent = new Intent(Dialogue.this, D17.class);
                    startActivity(intent);
                }if (i == 18) {
                    Intent intent = new Intent(Dialogue.this, D18.class);
                    startActivity(intent);
                }if (i == 19) {
                    Intent intent = new Intent(Dialogue.this, D19.class);
                    startActivity(intent);
                }if (i == 20) {
                    Intent intent = new Intent(Dialogue.this, D20.class);
                    startActivity(intent);
                }if (i == 21) {
                    Intent intent = new Intent(Dialogue.this, D21.class);
                    startActivity(intent);
                }if (i == 22) {
                    Intent intent = new Intent(Dialogue.this, D22.class);
                    startActivity(intent);
                }if (i == 23) {
                    Intent intent = new Intent(Dialogue.this, D23.class);
                    startActivity(intent);
                }if (i == 24) {
                    Intent intent = new Intent(Dialogue.this, D24.class);
                    startActivity(intent);
                }if (i == 25) {
                    Intent intent = new Intent(Dialogue.this, D25.class);
                    startActivity(intent);
                }if (i == 26) {
                    Intent intent = new Intent(Dialogue.this, D26.class);
                    startActivity(intent);
                }if (i == 27) {
                    Intent intent = new Intent(Dialogue.this, D27.class);
                    startActivity(intent);
                }if (i == 28) {
                    Intent intent = new Intent(Dialogue.this, D28.class);
                    startActivity(intent);
                }if (i == 29) {
                    Intent intent = new Intent(Dialogue.this, D29.class);
                    startActivity(intent);
                }if (i == 30) {
                    Intent intent = new Intent(Dialogue.this, D30.class);
                    startActivity(intent);
                }if (i == 31) {
                    Intent intent = new Intent(Dialogue.this, D31.class);
                    startActivity(intent);
                }if (i == 32) {
                    Intent intent = new Intent(Dialogue.this, D32.class);
                    startActivity(intent);
                }if (i == 33) {
                    Intent intent = new Intent(Dialogue.this, D33.class);
                    startActivity(intent);
                }if (i == 34) {
                    Intent intent = new Intent(Dialogue.this, D34.class);
                    startActivity(intent);
                }if (i == 35) {
                    Intent intent = new Intent(Dialogue.this, D35.class);
                    startActivity(intent);
                }if (i == 36) {
                    Intent intent = new Intent(Dialogue.this, D36.class);
                    startActivity(intent);
                }if (i == 37) {
                    Intent intent = new Intent(Dialogue.this, D37.class);
                    startActivity(intent);
                }if (i == 38) {
                    Intent intent = new Intent(Dialogue.this, D38.class);
                    startActivity(intent);
                }if (i == 39) {
                    Intent intent = new Intent(Dialogue.this, D39.class);
                    startActivity(intent);
                }if (i == 40) {
                    Intent intent = new Intent(Dialogue.this, D40.class);
                    startActivity(intent);
                }if (i == 41) {
                    Intent intent = new Intent(Dialogue.this, D41.class);
                    startActivity(intent);
                }if (i == 42) {
                    Intent intent = new Intent(Dialogue.this, D42.class);
                    startActivity(intent);
                }if (i == 43) {
                    Intent intent = new Intent(Dialogue.this, D43.class);
                    startActivity(intent);
                }if (i == 44) {
                    Intent intent = new Intent(Dialogue.this, D44.class);
                    startActivity(intent);
                }if (i == 45) {
                    Intent intent = new Intent(Dialogue.this, D45.class);
                    startActivity(intent);
                }if (i == 46) {
                    Intent intent = new Intent(Dialogue.this, D46.class);
                    startActivity(intent);
                }if (i == 47) {
                    Intent intent = new Intent(Dialogue.this, D47.class);
                    startActivity(intent);
                }if (i == 48) {
                    Intent intent = new Intent(Dialogue.this, D48.class);
                    startActivity(intent);
                }if (i == 49) {
                    Intent intent = new Intent(Dialogue.this, D49.class);
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
