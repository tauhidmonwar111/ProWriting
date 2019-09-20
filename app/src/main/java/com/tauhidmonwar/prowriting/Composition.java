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

public class Composition extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    ListView containerSearchListView;
    ArrayAdapter<String > searchadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composition);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2182490429715106/2704915190");
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
        String[] composition = getResources().getStringArray(R.array.composition);





        searchadapter = new ArrayAdapter<String>(Composition.this,R.layout.paragraph_view,R.id.listp,composition);
        containerSearchListView.setAdapter(searchadapter);
        containerSearchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                if (i == 0) {
                    Intent intent = new Intent(Composition.this, C0.class);
                    startActivity(intent);
                }
                if (i == 1) {
                    Intent intent = new Intent(Composition.this, C1.class);
                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent(Composition.this, C2.class);
                    startActivity(intent);
                }
                if (i == 3) {
                    Intent intent = new Intent(Composition.this, C3.class);
                    startActivity(intent);
                }
                if (i == 4) {
                    Intent intent = new Intent(Composition.this, C4.class);
                    startActivity(intent);
                }
                if (i == 5) {
                    Intent intent = new Intent(Composition.this, C5.class);
                    startActivity(intent);
                }
                if (i == 6) {
                    Intent intent = new Intent(Composition.this, C6.class);
                    startActivity(intent);
                }
                if (i == 7) {
                    Intent intent = new Intent(Composition.this, C7.class);
                    startActivity(intent);
                }
                if (i == 8) {
                    Intent intent = new Intent(Composition.this, C8.class);
                    startActivity(intent);
                }
                if (i == 9) {
                    Intent intent = new Intent(Composition.this, C9.class);
                    startActivity(intent);
                }
                if (i == 10) {
                    Intent intent = new Intent(Composition.this, C10.class);
                    startActivity(intent);
                }


                if (i == 11) {
                    Intent intent = new Intent(Composition.this, C11.class);
                    startActivity(intent);
                }
                if (i == 12) {
                    Intent intent = new Intent(Composition.this, C12.class);
                    startActivity(intent);
                }
                if (i == 13) {
                    Intent intent = new Intent(Composition.this, C13.class);
                    startActivity(intent);
                }
                if (i == 14) {
                    Intent intent = new Intent(Composition.this, C14.class);
                    startActivity(intent);
                }
                if (i == 15) {
                    Intent intent = new Intent(Composition.this, C15.class);
                    startActivity(intent);
                }
                if (i == 16) {
                    Intent intent = new Intent(Composition.this, C16.class);
                    startActivity(intent);
                }
                if (i == 17) {
                    Intent intent = new Intent(Composition.this, C17.class);
                    startActivity(intent);
                }
                if (i == 18) {
                    Intent intent = new Intent(Composition.this, C18.class);
                    startActivity(intent);
                }
                if (i == 19) {
                    Intent intent = new Intent(Composition.this, C19.class);
                    startActivity(intent);
                }
                if (i == 20) {
                    Intent intent = new Intent(Composition.this, C20.class);
                    startActivity(intent);
                }
                if (i == 21) {
                    Intent intent = new Intent(Composition.this, C21.class);
                    startActivity(intent);
                }
                if (i == 22) {
                    Intent intent = new Intent(Composition.this, C22.class);
                    startActivity(intent);

                } if (i == 23) {
                    Intent intent = new Intent(Composition.this, C23.class);
                    startActivity(intent);
                }
                if (i == 24) {
                    Intent intent = new Intent(Composition.this, C24.class);
                    startActivity(intent);
                }
                if (i == 25) {
                    Intent intent = new Intent(Composition.this, C25.class);
                    startActivity(intent);
                }
                if (i == 26) {
                    Intent intent = new Intent(Composition.this, C26.class);
                    startActivity(intent);
                }
                if (i == 27) {
                    Intent intent = new Intent(Composition.this, C27.class);
                    startActivity(intent);

                }if (i == 28) {
                    Intent intent = new Intent(Composition.this, C28.class);
                    startActivity(intent);

                }if (i == 29) {
                    Intent intent = new Intent(Composition.this, C29.class);
                    startActivity(intent);

                }if (i == 30) {
                    Intent intent = new Intent(Composition.this, C30.class);
                    startActivity(intent);

                }if (i == 31) {
                    Intent intent = new Intent(Composition.this, C31.class);
                    startActivity(intent);

                }if (i == 32) {
                    Intent intent = new Intent(Composition.this, C32.class);
                    startActivity(intent);

                }if (i == 33) {
                    Intent intent = new Intent(Composition.this, C33.class);
                    startActivity(intent);

                }if (i == 34) {
                    Intent intent = new Intent(Composition.this, C34.class);
                    startActivity(intent);

                }if (i == 35) {
                    Intent intent = new Intent(Composition.this, C35.class);
                    startActivity(intent);

                }if (i == 36) {
                    Intent intent = new Intent(Composition.this, C36.class);
                    startActivity(intent);

                }if (i == 37) {
                    Intent intent = new Intent(Composition.this, C37.class);
                    startActivity(intent);

                }if (i == 38) {
                    Intent intent = new Intent(Composition.this, C38.class);
                    startActivity(intent);

                }if (i == 39) {
                    Intent intent = new Intent(Composition.this, C39.class);
                    startActivity(intent);

                }if (i == 40) {
                    Intent intent = new Intent(Composition.this, C40.class);
                    startActivity(intent);

                }if (i == 41) {
                    Intent intent = new Intent(Composition.this, C41.class);
                    startActivity(intent);

                }if (i == 42) {
                    Intent intent = new Intent(Composition.this, C42.class);
                    startActivity(intent);

                }if (i == 43) {
                    Intent intent = new Intent(Composition.this, C43.class);
                    startActivity(intent);

                }if (i == 44) {
                    Intent intent = new Intent(Composition.this, C44.class);
                    startActivity(intent);

                }if (i == 45) {
                    Intent intent = new Intent(Composition.this, C45.class);
                    startActivity(intent);

                }if (i == 46) {
                    Intent intent = new Intent(Composition.this, C46.class);
                    startActivity(intent);

                }if (i == 47) {
                    Intent intent = new Intent(Composition.this, C47.class);
                    startActivity(intent);

                }if (i == 48) {
                    Intent intent = new Intent(Composition.this, C48.class);
                    startActivity(intent);

                }if (i == 49) {
                    Intent intent = new Intent(Composition.this, C49.class);
                    startActivity(intent);

                }if (i == 50) {
                    Intent intent = new Intent(Composition.this, C50.class);
                    startActivity(intent);

                }if (i == 51) {
                    Intent intent = new Intent(Composition.this, C51.class);
                    startActivity(intent);

                }if (i == 52) {
                    Intent intent = new Intent(Composition.this, C52.class);
                    startActivity(intent);

                }if (i == 53) {
                    Intent intent = new Intent(Composition.this, C53.class);
                    startActivity(intent);

                }if (i == 54) {
                    Intent intent = new Intent(Composition.this, C54.class);
                    startActivity(intent);

                }if (i == 55) {
                    Intent intent = new Intent(Composition.this, C55.class);
                    startActivity(intent);

                }if (i == 56) {
                    Intent intent = new Intent(Composition.this, C56.class);
                    startActivity(intent);

                }if (i == 57) {
                    Intent intent = new Intent(Composition.this, C57.class);
                    startActivity(intent);

                }if (i == 58) {
                    Intent intent = new Intent(Composition.this, C58.class);
                    startActivity(intent);

                }if (i == 59) {
                    Intent intent = new Intent(Composition.this, C59.class);
                    startActivity(intent);

                }if (i == 60) {
                    Intent intent = new Intent(Composition.this, C60.class);
                    startActivity(intent);

                }if (i == 61) {
                    Intent intent = new Intent(Composition.this, C61.class);
                    startActivity(intent);

                }if (i == 62) {
                    Intent intent = new Intent(Composition.this, C62.class);
                    startActivity(intent);

                }if (i == 63) {
                    Intent intent = new Intent(Composition.this, C63.class);
                    startActivity(intent);

                }if (i == 64) {
                    Intent intent = new Intent(Composition.this, C64.class);
                    startActivity(intent);

                }if (i == 65) {
                    Intent intent = new Intent(Composition.this, C65.class);
                    startActivity(intent);

                }if (i == 66) {
                    Intent intent = new Intent(Composition.this, C66.class);
                    startActivity(intent);

                }if (i == 67) {
                    Intent intent = new Intent(Composition.this, C67.class);
                    startActivity(intent);

                }if (i == 68) {
                    Intent intent = new Intent(Composition.this, C68.class);
                    startActivity(intent);

                }if (i == 69) {
                    Intent intent = new Intent(Composition.this, C69.class);
                    startActivity(intent);

                }if (i == 70) {
                    Intent intent = new Intent(Composition.this, C70.class);
                    startActivity(intent);

                }if (i == 71) {
                    Intent intent = new Intent(Composition.this, C71.class);
                    startActivity(intent);

                }if (i == 72) {
                    Intent intent = new Intent(Composition.this, C72.class);
                    startActivity(intent);

                }if (i == 73) {
                    Intent intent = new Intent(Composition.this, C73.class);
                    startActivity(intent);

                }if (i == 74) {
                    Intent intent = new Intent(Composition.this, C74.class);
                    startActivity(intent);

                }if (i == 75) {
                    Intent intent = new Intent(Composition.this, C75.class);
                    startActivity(intent);

                }if (i == 76) {
                    Intent intent = new Intent(Composition.this, C76.class);
                    startActivity(intent);

                }if (i == 77) {
                    Intent intent = new Intent(Composition.this, C77.class);
                    startActivity(intent);

                }if (i == 78) {
                    Intent intent = new Intent(Composition.this, C78.class);
                    startActivity(intent);

                }if (i == 79) {
                    Intent intent = new Intent(Composition.this, C79.class);
                    startActivity(intent);

                }if (i == 80) {
                    Intent intent = new Intent(Composition.this, C80.class);
                    startActivity(intent);

                }if (i == 81) {
                    Intent intent = new Intent(Composition.this, C81.class);
                    startActivity(intent);

                }if (i == 82) {
                    Intent intent = new Intent(Composition.this, C82.class);
                    startActivity(intent);

                }if (i == 83) {
                    Intent intent = new Intent(Composition.this, C83.class);
                    startActivity(intent);

                }if (i == 84) {
                    Intent intent = new Intent(Composition.this, C84.class);
                    startActivity(intent);

                }if (i == 85) {
                    Intent intent = new Intent(Composition.this, C85.class);
                    startActivity(intent);

                }if (i == 86) {
                    Intent intent = new Intent(Composition.this, C86.class);
                    startActivity(intent);

                }if (i == 87) {
                    Intent intent = new Intent(Composition.this, C87.class);
                    startActivity(intent);

                }if (i == 88) {
                    Intent intent = new Intent(Composition.this, C88.class);
                    startActivity(intent);

                }if (i == 89) {
                    Intent intent = new Intent(Composition.this, C89.class);
                    startActivity(intent);

                }if (i == 90) {
                    Intent intent = new Intent(Composition.this, C90.class);
                    startActivity(intent);

                }if (i == 91) {
                    Intent intent = new Intent(Composition.this, C91.class);
                    startActivity(intent);

                }if (i == 92) {
                    Intent intent = new Intent(Composition.this, C92.class);
                    startActivity(intent);

                }if (i == 93) {
                    Intent intent = new Intent(Composition.this, C93.class);
                    startActivity(intent);

                }if (i == 94) {
                    Intent intent = new Intent(Composition.this, C94.class);
                    startActivity(intent);

                }if (i == 95) {
                    Intent intent = new Intent(Composition.this, C95.class);
                    startActivity(intent);

                }if (i == 96) {
                    Intent intent = new Intent(Composition.this, C96.class);
                    startActivity(intent);

                }if (i == 97) {
                    Intent intent = new Intent(Composition.this, C97.class);
                    startActivity(intent);

                }if (i == 98) {
                    Intent intent = new Intent(Composition.this, C98.class);
                    startActivity(intent);

                }if (i == 99) {
                    Intent intent = new Intent(Composition.this, C99.class);
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
