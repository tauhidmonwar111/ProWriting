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


public class Paragraph extends AppCompatActivity {


    private InterstitialAd mInterstitialAd;
    ListView containerSearchListView;
    ArrayAdapter<String > searchadapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paragraph);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2182490429715106/9270323543");
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
        String[] paragraph = getResources().getStringArray(R.array.paragraph);





        searchadapter = new ArrayAdapter<String>(Paragraph.this,R.layout.paragraph_view,R.id.listp,paragraph);
        containerSearchListView.setAdapter(searchadapter);
        containerSearchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {





                if (i == 0) {
                    Intent intent = new Intent(Paragraph.this,P0.class);
                    startActivity(intent);
                }
                if (i == 1) {
                    Intent intent = new Intent(Paragraph.this,P1.class);
                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent(Paragraph.this,P2.class);
                    startActivity(intent);
                }
                if (i == 3) {
                    Intent intent = new Intent(Paragraph.this,P3.class);
                    startActivity(intent);
                }
                if (i == 4) {
                    Intent intent = new Intent(Paragraph.this,P4.class);
                    startActivity(intent);
                }
                if (i == 5) {
                    Intent intent = new Intent(Paragraph.this,P5.class);
                    startActivity(intent);
                }
                if (i == 6) {
                    Intent intent = new Intent(Paragraph.this,P6.class);
                    startActivity(intent);
                }
                if (i == 7) {
                    Intent intent = new Intent(Paragraph.this,P7.class);
                    startActivity(intent);
                }
                if (i == 8) {
                    Intent intent = new Intent(Paragraph.this,P8.class);
                    startActivity(intent);
                }
                if (i == 9) {
                    Intent intent = new Intent(Paragraph.this,P9.class);
                    startActivity(intent);
                }
                if (i == 10) {
                    Intent intent = new Intent(Paragraph.this,P10.class);
                    startActivity(intent);
                }
                if (i == 11) {
                    Intent intent = new Intent(Paragraph.this,P11.class);
                    startActivity(intent);
                }
                if (i == 12) {
                    Intent intent = new Intent(Paragraph.this,P12.class);
                    startActivity(intent);
                }
                if (i == 13) {
                    Intent intent = new Intent(Paragraph.this,P13.class);
                    startActivity(intent);
                }
                if (i == 14) {
                    Intent intent = new Intent(Paragraph.this,P14.class);
                    startActivity(intent);
                }
                if (i == 15) {
                    Intent intent = new Intent(Paragraph.this,P15.class);
                    startActivity(intent);
                }
                if (i == 16) {
                    Intent intent = new Intent(Paragraph.this,P16.class);
                    startActivity(intent);
                }
                if (i == 17) {
                    Intent intent = new Intent(Paragraph.this,P17.class);
                    startActivity(intent);
                }
                if (i == 18) {
                    Intent intent = new Intent(Paragraph.this,P18.class);
                    startActivity(intent);
                }
                if (i == 19) {
                    Intent intent = new Intent(Paragraph.this,P19.class);
                    startActivity(intent);
                }
                if (i == 20) {
                    Intent intent = new Intent(Paragraph.this,P20.class);
                    startActivity(intent);
                }
                if (i == 21) {
                    Intent intent = new Intent(Paragraph.this,P21.class);
                    startActivity(intent);
                }
                if (i == 22) {
                    Intent intent = new Intent(Paragraph.this,P22.class);
                    startActivity(intent);
                }
                if (i == 23) {
                    Intent intent = new Intent(Paragraph.this,P23.class);
                    startActivity(intent);
                }
                if (i == 24) {
                    Intent intent = new Intent(Paragraph.this,P24.class);
                    startActivity(intent);
                }
                if (i == 25) {
                    Intent intent = new Intent(Paragraph.this,P25.class);
                    startActivity(intent);
                }
                if (i == 26) {
                    Intent intent = new Intent(Paragraph.this,P26.class);
                    startActivity(intent);
                }
                if (i == 27) {
                    Intent intent = new Intent(Paragraph.this,P27.class);
                    startActivity(intent);
                }
                if (i == 28) {
                    Intent intent = new Intent(Paragraph.this,P28.class);
                    startActivity(intent);
                }
                if (i == 29) {
                    Intent intent = new Intent(Paragraph.this,P29.class);
                    startActivity(intent);
                }
                if (i == 30) {
                    Intent intent = new Intent(Paragraph.this,P30.class);
                    startActivity(intent);
                }
                if (i == 31) {
                    Intent intent = new Intent(Paragraph.this,P31.class);
                    startActivity(intent);
                }
                if (i == 32) {
                    Intent intent = new Intent(Paragraph.this,P32.class);
                    startActivity(intent);
                }
                if (i == 33) {
                    Intent intent = new Intent(Paragraph.this,P33.class);
                    startActivity(intent);
                }
                if (i == 34) {
                    Intent intent = new Intent(Paragraph.this,P34.class);
                    startActivity(intent);
                }
                if (i == 35) {
                    Intent intent = new Intent(Paragraph.this,P35.class);
                    startActivity(intent);
                }
                if (i == 36) {
                    Intent intent = new Intent(Paragraph.this,P36.class);
                    startActivity(intent);
                }if (i == 37) {
                    Intent intent = new Intent(Paragraph.this,P37.class);
                    startActivity(intent);
                }if (i == 38) {
                    Intent intent = new Intent(Paragraph.this,P38.class);
                    startActivity(intent);
                }
                if (i == 39) {
                    Intent intent = new Intent(Paragraph.this,P39.class);
                    startActivity(intent);
                }
                if (i == 40) {
                    Intent intent = new Intent(Paragraph.this,P40.class);
                    startActivity(intent);
                }
                if (i == 41) {
                    Intent intent = new Intent(Paragraph.this,P41.class);
                    startActivity(intent);
                }
                if (i == 42) {
                    Intent intent = new Intent(Paragraph.this,P42.class);
                    startActivity(intent);
                }
                if (i == 43) {
                    Intent intent = new Intent(Paragraph.this,P43.class);
                    startActivity(intent);
                }
                if (i == 44) {
                    Intent intent = new Intent(Paragraph.this,P44.class);
                    startActivity(intent);
                }
                if (i == 45) {
                    Intent intent = new Intent(Paragraph.this,P45.class);
                    startActivity(intent);
                }
                if (i == 46) {
                    Intent intent = new Intent(Paragraph.this,P46.class);
                    startActivity(intent);
                }
                if (i == 47) {
                    Intent intent = new Intent(Paragraph.this,P47.class);
                    startActivity(intent);
                }
                if (i == 48) {
                    Intent intent = new Intent(Paragraph.this,P48.class);
                    startActivity(intent);
                }
                if (i == 49) {
                    Intent intent = new Intent(Paragraph.this,P49.class);
                    startActivity(intent);
                }
                if (i == 50) {
                    Intent intent = new Intent(Paragraph.this,P50.class);
                    startActivity(intent);
                }if (i == 51) {
                    Intent intent = new Intent(Paragraph.this,P51.class);
                    startActivity(intent);
                }if (i == 52) {
                    Intent intent = new Intent(Paragraph.this,P52.class);
                    startActivity(intent);
                }
                if (i == 53) {
                    Intent intent = new Intent(Paragraph.this,P53.class);
                    startActivity(intent);
                }if (i == 54) {
                    Intent intent = new Intent(Paragraph.this,P54.class);
                    startActivity(intent);
                }
                if (i == 55) {
                    Intent intent = new Intent(Paragraph.this,P55.class);
                    startActivity(intent);
                }if (i == 56) {
                    Intent intent = new Intent(Paragraph.this,P56.class);
                    startActivity(intent);
                }
                if (i == 57) {
                    Intent intent = new Intent(Paragraph.this,P57.class);
                    startActivity(intent);
                }if (i == 58) {
                    Intent intent = new Intent(Paragraph.this,P58.class);
                    startActivity(intent);
                }if (i == 59) {
                    Intent intent = new Intent(Paragraph.this,P59.class);
                    startActivity(intent);
                }if (i == 60) {
                    Intent intent = new Intent(Paragraph.this,P60.class);
                    startActivity(intent);
                }
                if (i == 61) {
                    Intent intent = new Intent(Paragraph.this,P61.class);
                    startActivity(intent);
                }
                if (i == 62) {
                    Intent intent = new Intent(Paragraph.this,P62.class);
                    startActivity(intent);
                }if (i == 63) {
                    Intent intent = new Intent(Paragraph.this,P63.class);
                    startActivity(intent);
                }
                if (i == 64) {
                    Intent intent = new Intent(Paragraph.this,P64.class);
                    startActivity(intent);
                }
                if (i == 65) {
                    Intent intent = new Intent(Paragraph.this,P65.class);
                    startActivity(intent);
                }
                if (i == 66) {
                    Intent intent = new Intent(Paragraph.this,P66.class);
                    startActivity(intent);
                }
                if (i == 67) {
                    Intent intent = new Intent(Paragraph.this,P67.class);
                    startActivity(intent);
                }
                if (i == 68) {
                    Intent intent = new Intent(Paragraph.this,P68.class);
                    startActivity(intent);
                }if (i == 69) {
                    Intent intent = new Intent(Paragraph.this,P69.class);
                    startActivity(intent);
                }if (i == 70) {
                    Intent intent = new Intent(Paragraph.this,P70.class);
                    startActivity(intent);
                }if (i == 71) {
                    Intent intent = new Intent(Paragraph.this,P71.class);
                    startActivity(intent);
                }if (i == 72) {
                    Intent intent = new Intent(Paragraph.this,P72.class);
                    startActivity(intent);
                }if (i == 73) {
                    Intent intent = new Intent(Paragraph.this,P73.class);
                    startActivity(intent);
                }if (i == 74) {
                    Intent intent = new Intent(Paragraph.this,P74.class);
                    startActivity(intent);
                }if (i == 75) {
                    Intent intent = new Intent(Paragraph.this,P75.class);
                    startActivity(intent);
                }if (i == 76) {
                    Intent intent = new Intent(Paragraph.this,P76.class);
                    startActivity(intent);
                }if (i == 77) {
                    Intent intent = new Intent(Paragraph.this,P77.class);
                    startActivity(intent);
                }if (i == 78) {
                    Intent intent = new Intent(Paragraph.this,P78.class);
                    startActivity(intent);
                }if (i == 79) {
                    Intent intent = new Intent(Paragraph.this,P79.class);
                    startActivity(intent);
                }if (i == 80) {
                    Intent intent = new Intent(Paragraph.this,P80.class);
                    startActivity(intent);
                }if (i == 81) {
                    Intent intent = new Intent(Paragraph.this,P81.class);
                    startActivity(intent);
                }if (i == 82) {
                    Intent intent = new Intent(Paragraph.this,P82.class);
                    startActivity(intent);
                }if (i == 83) {
                    Intent intent = new Intent(Paragraph.this,P83.class);
                    startActivity(intent);
                }if (i == 84) {
                    Intent intent = new Intent(Paragraph.this,P84.class);
                    startActivity(intent);
                }if (i == 85) {
                    Intent intent = new Intent(Paragraph.this,P85.class);
                    startActivity(intent);
                }if (i == 86) {
                    Intent intent = new Intent(Paragraph.this,P86.class);
                    startActivity(intent);
                }if (i == 87) {
                    Intent intent = new Intent(Paragraph.this,P87.class);
                    startActivity(intent);
                }if (i == 88) {
                    Intent intent = new Intent(Paragraph.this,P88.class);
                    startActivity(intent);
                }if (i == 89) {
                    Intent intent = new Intent(Paragraph.this,P89.class);
                    startActivity(intent);
                }if (i == 90) {
                    Intent intent = new Intent(Paragraph.this,P90.class);
                    startActivity(intent);
                }if (i == 91) {
                    Intent intent = new Intent(Paragraph.this,P91.class);
                    startActivity(intent);
                }if (i == 92) {
                    Intent intent = new Intent(Paragraph.this,P92.class);
                    startActivity(intent);
                }if (i == 93) {
                    Intent intent = new Intent(Paragraph.this,P93.class);
                    startActivity(intent);
                }if (i == 94) {
                    Intent intent = new Intent(Paragraph.this,P94.class);
                    startActivity(intent);
                }if (i == 95) {
                    Intent intent = new Intent(Paragraph.this,P95.class);
                    startActivity(intent);
                }if (i == 96) {
                    Intent intent = new Intent(Paragraph.this,P96.class);
                    startActivity(intent);
                }if (i == 97) {
                    Intent intent = new Intent(Paragraph.this,P97.class);
                    startActivity(intent);
                }if (i == 98) {
                    Intent intent = new Intent(Paragraph.this,P98.class);
                    startActivity(intent);
                }if (i == 99) {
                    Intent intent = new Intent(Paragraph.this,P99.class);
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

