package com.kayeswap.shahajjo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Blood_Group extends AppCompatActivity {
    public final static String AD_CODE = ""; // constant
    Button up, ap, an, abp, abn, bp,bn,op,on;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood__group);

        up = findViewById(R.id.newblood);
        ap = findViewById(R.id.ap);
        an = findViewById(R.id.an);
        abp = findViewById(R.id.abp);
        abn = findViewById(R.id.abn);
        bp = findViewById(R.id.bp);
        bn = findViewById(R.id.bn);
        op = findViewById(R.id.op);
        on = findViewById(R.id.on);

        MobileAds.initialize(this,
                "ca-app-pub-7314980641738466~2339831924");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7314980641738466/9382157508");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, Donor_Reg.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, Donor_Reg.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });


        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, A_Positive.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, A_Positive.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });

        an.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, A_Negative.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, A_Negative.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });

        abp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, AB_Positive.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, AB_Positive.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        abn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, AB_Negative.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, AB_Negative.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, B_Positive.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, B_Positive.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, B_Negative.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, B_Negative.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, O_Positive.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, O_Positive.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {

                    startActivity(new Intent(Blood_Group.this, O_Negative.class));

                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        startActivity(new Intent(Blood_Group.this, O_Negative.class));
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });
            }
        });

    }
}
