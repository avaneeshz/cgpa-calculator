package com.masterandroid.cgpacalculator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import hotchemi.android.rate.AppRate;

public class MainActivity extends AppCompatActivity {
    Spinner s1, s2;
    Button bt;
    int f=0, g=0;

    /*private AdView adView;
    private final String TAG = MainActivity.class.getSimpleName();
    private InterstitialAd interstitialAd;*/





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* adView = new AdView(this, "1154467064928438_1154474888260989", AdSize.BANNER_HEIGHT_50);
// Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
// Add the ad view to your activity layout
        adContainer.addView(adView);
// Request an ad
        adView.loadAd();

        interstitialAd = new InterstitialAd(this, "1154467064928438_1154517981590013");
// Set listeners for the Interstitial Ad
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad

                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                Log.d(TAG, "Interstitial ad impression logged!");
            }
        });

// For auto play video ads, it's recommended to load the ad
// at least 30 seconds before it is shown
        interstitialAd.loadAd();*/








        AppRate.with(this)
                .setInstallDays(0)
                .setLaunchTimes(2)
                .setRemindInterval(2)
                .monitor();
        AppRate.showRateDialogIfMeetsConditions(this);




        AppUpdateChecker appUpdateChecker=new AppUpdateChecker(this);  //pass the activity in constructure
        appUpdateChecker.checkForUpdate(false); //mannual check false here

        s1 = findViewById(R.id.spinner);
        s2 = findViewById(R.id.spinner2);
        bt = findViewById(R.id.button);
        setupSpinners();





        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = s1.getSelectedItem().toString();
                String br = s2.getSelectedItem().toString();
                String selected_sem = s1.getSelectedItem().toString();
                String selected_br = s2.getSelectedItem().toString();

                if(selected_br == "IT" && selected_sem == "4th"){

                    startActivity(new Intent(MainActivity.this,IT4.class));
                    bt.setBackgroundColor(Color.GREEN);

                }
                if(selected_br == "Mechatronics" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,It5th.class));

                }
                if(selected_br == "CSSE" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Csse4.class));

                }
                if(selected_br == "CSCE" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Csce4.class));

                }
                if(selected_br == "CSE" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Cse4.class));

                }
                if(selected_br == "Mechanical" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Mech4.class));

                }
                if(selected_br == "Automobile" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Am4.class));

                }
                if(selected_br == "Aerospace" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,As4.class));

                }
                if(selected_br == "Civil" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Civil4.class));

                }
                if(selected_br == "Electrical" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Electrical4.class));

                }
                if(selected_br == "ETC" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Etc4.class));

                }
                if(selected_br == "EEE" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Eee4.class));

                }
                if(selected_br == "E & Computer" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Ecom4.class));

                }
                if(selected_br == "E & Instrumentation" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Ei4.class));

                }
                if(selected_br == "E & Control" && selected_sem == "4th"){
                    startActivity(new Intent(MainActivity.this,Econ4.class));

                }
                if(selected_br == "CSE" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Cse5.class));

                }
                if(selected_br == "IT" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,It5.class));

                }
                if(selected_br == "CSSE" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Csse5.class));

                }
                if(selected_br == "CSCE" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Csce5.class));

                }
                if(selected_br == "Mechanical" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Mech5.class));

                }
                if(selected_br == "Mechatronics" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Mt5.class));

                }
                if(selected_br == "Automobile" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Am5.class));

                }
                if(selected_br == "Aerospace" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,As5.class));

                }
                if(selected_br == "Electrical" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Electrical5.class));

                }
                if(selected_br == "Civil" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Civil5.class));

                } if(selected_br == "EEE" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Eee5.class));

                }
                if(selected_br == "ETC" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Etc5.class));

                }
                if(selected_br == "E & Instrumentation" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Ei5.class));

                }
                if(selected_br == "E & Computer" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Ecom5.class));

                }
                if(selected_br == "E & Control" && selected_sem == "5th"){
                    startActivity(new Intent(MainActivity.this,Econ5.class));

                }
                if(selected_br == "CSE" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Cse6.class));

                }
                if(selected_br == "IT" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,It6.class));

                }
                if(selected_br == "CSSE" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Csse6.class));

                }
                if(selected_br == "CSCE" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Csce6.class));

                }
                if(selected_br == "Mechanical" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Mech6.class));

                }
                if(selected_br == "Mechatronics" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Mt6.class));

                }
                if(selected_br == "Automobile" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Mech6.class));

                }
                if(selected_br == "Aerospace" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,As6.class));

                }
                if(selected_br == "EEE" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Eee6.class));

                }
                if(selected_br == "ETC" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Etc6.class));

                }
                if(selected_br == "E & Computer" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Ecom6.class));

                }
                if(selected_br == "E & Control" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Econ6.class));

                }
                if(selected_br == "E & Instrumentation" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Ei6.class));

                }
                if(selected_br == "Electrical" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Electrical6.class));

                }
                if(selected_br == "Civil" && selected_sem == "6th"){
                    startActivity(new Intent(MainActivity.this,Civil6.class));

                }


                if(selected_br == "CSE" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Cse7.class));

                }
                if(selected_br == "IT" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,It7.class));

                }
                if(selected_br == "CSSE" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Cse7.class));

                }
                if(selected_br == "CSCE" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Cse7.class));

                }
                if(selected_br == "Mechanical" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Electrical7.class));

                }
                if(selected_br == "Mechatronics" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Electrical7.class));

                }
                if(selected_br == "Automobile" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Electrical7.class));

                }
                if(selected_br == "Aerospace" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,As7.class));

                }
                if(selected_br == "EEE" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Eee7.class));

                }
                if(selected_br == "ETC" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Etc7.class));

                }
                if(selected_br == "E & Computer" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Ecom7.class));

                }
                if(selected_br == "E & Control" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Econ7.class));

                }
                if(selected_br == "E & Instrumentation" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Ei7.class));

                }
                if(selected_br == "Electrical" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Mech7.class));

                }
                if(selected_br == "Civil" && selected_sem == "7th"){
                    startActivity(new Intent(MainActivity.this,Cse7.class));

                }

                //First Sem

                if(selected_br == "CSE" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "IT" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "CSSE" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "CSCE" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "Mechanical" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "Mechatronics" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "Automobile" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "Aerospace" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "EEE" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "ETC" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "E & Computer" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "E & Control" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "E & Instrumentation" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "Electrical" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "Civil" && selected_sem == "1st"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }

                // 2nd Sem

                if(selected_br == "CSE" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,Seconda.class));

                }
                if(selected_br == "IT" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,Seconda.class));

                }
                if(selected_br == "CSSE" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,Seconda.class));

                }
                if(selected_br == "CSCE" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,Seconda.class));

                }
                if(selected_br == "Mechanical" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "Mechatronics" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "Automobile" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "Aerospace" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "EEE" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "ETC" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "E & Computer" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "E & Control" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "E & Instrumentation" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,First.class));

                }
                if(selected_br == "Electrical" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }
                if(selected_br == "Civil" && selected_sem == "2nd"){
                    startActivity(new Intent(MainActivity.this,Secondb.class));

                }

                //3rd Sem

                if(selected_br == "CSE" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Cse3.class));

                }
                if(selected_br == "IT" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,It3.class));

                }
                if(selected_br == "CSSE" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Csse3.class));

                }
                if(selected_br == "CSCE" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Csce3.class));

                }
                if(selected_br == "Mechanical" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Mech3.class));

                }
                if(selected_br == "Mechatronics" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Mt3.class));

                }
                if(selected_br == "Automobile" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Mech3.class));

                }
                if(selected_br == "Aerospace" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,As3.class));

                }
                if(selected_br == "EEE" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Eee3.class));

                }
                if(selected_br == "ETC" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Etc3.class));

                }
                if(selected_br == "E & Computer" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Ecom3.class));

                }
                if(selected_br == "E & Control" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Econ3.class));

                }
                if(selected_br == "E & Instrumentation" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Econ3.class));

                }
                if(selected_br == "Electrical" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Electrical3.class));

                }
                if(selected_br == "Civil" && selected_sem == "3rd"){
                    startActivity(new Intent(MainActivity.this,Civil3.class));

                }













            }
        });





    }

    /*@Override
    protected void onDestroy() {
        if(adView != null) {
            adView.destroy();
            ;
        }
        super.onDestroy();


    }*/

    private void setupSpinners() {
        List<String> sems = new ArrayList<>();
        sems.add("Select Semester");
        sems.add("1st");
        sems.add("2nd");
        sems.add("3rd");
        sems.add("4th");
        sems.add("5th");
        sems.add("6th");
        sems.add("7th");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sems);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(dataAdapter);

        List<String> brs = new ArrayList<>();
        brs.add("Select Branch");
        brs.add("CSE");
        brs.add("IT");
        brs.add("CSCE");
        brs.add("CSSE");
        brs.add("EEE");
        brs.add("E & Computer");
        brs.add("ETC");
        brs.add("E & Instrumentation");
        brs.add("E & Control");
        brs.add("Electrical");
        brs.add("Civil");
        brs.add("Mechanical");
        brs.add("Mechatronics");
        brs.add("Automobile");
        brs.add("Aerospace");


        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, brs);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(dataAdapter2);
        /*s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {
                switch (position) {
                    case 0:
                        bt.setBackgroundColor(Color.LTGRAY);
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                                switch (pos) {
                                    case 0:
                                        bt.setBackgroundColor(Color.LTGRAY);
                                        break;
                                    case 1:
                                    case 7:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                        bt.setBackgroundColor(Color.GREEN);
                                        break;
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        bt.setBackgroundColor(Color.LTGRAY);
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                                switch (pos) {
                                    case 0:
                                        bt.setBackgroundColor(Color.LTGRAY);
                                        break;
                                    case 1:
                                    case 7:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 8:
                                        bt.setBackgroundColor(Color.GREEN);
                                        break;
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/


        /*s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    bt.setBackgroundColor(Color.LTGRAY);
                }else {
                    bt.setBackgroundColor(Color.GREEN);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    bt.setBackgroundColor(Color.LTGRAY);
                }else {
                    bt.setBackgroundColor(Color.GREEN);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/


        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {

                if (position == 0) {
                    bt.setBackgroundColor(Color.LTGRAY);
                    f=0;

                }
                else if (position > 0 && g == 1) {
                    bt.setBackgroundColor(Color.CYAN);
                    f=1;
                }
                else if (position > 0) {
                    f = 1;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position2, long id) {

                if (position2 == 0) {
                    bt.setBackgroundColor(Color.LTGRAY);
                    g=0;

                }
                else if (position2 > 0 && f == 1) {
                    bt.setBackgroundColor(Color.CYAN);
                    g=1;
                }
                else if (position2 > 0) {
                    g=1;
                }




            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}