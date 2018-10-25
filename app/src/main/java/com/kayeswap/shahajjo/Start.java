package com.kayeswap.shahajjo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Start extends AppCompatActivity {

    ImageView Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Start = findViewById(R.id.start);

        Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Start.startAnimation(myFadeInAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent = new Intent(Start.this, Welcome.class);
                startActivity(mIntent);
                finish();
            }
        }, 3000);
    }

}
