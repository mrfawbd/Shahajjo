package com.kayeswap.shahajjo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Agreement_User extends AppCompatActivity {

    TextView pt, p, r;

    Button agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_agreement);

        agree = findViewById(R.id.rbtnadd);

        pt = findViewById(R.id.policy);
        p = findViewById(R.id.policyt);
        r = findViewById(R.id.rules);


        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Agreement_User.this, Donor_Reg.class));
            }
        });



        }

    }