package com.kayeswap.shahajjo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;


public class Blood_Reg_Page extends AppCompatActivity {

    EditText name, phn, address, btime, rel, blood, prob, how;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donor_req_page);

        add = findViewById(R.id.pbtnadd);

        name = findViewById(R.id.pname);
        phn = findViewById(R.id.pphone);
        blood = findViewById(R.id.pblood);
        address = findViewById(R.id.paddress);
        prob = findViewById(R.id.problem);
        rel = findViewById(R.id.prelation);
        how = findViewById(R.id.how);
        btime = findViewById(R.id.time);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addRequest();
            }

        });

    }

    private void addRequest() {
        DatabaseReference DB = FirebaseDatabase.
                getInstance().getReference().child("Blood_Request");


        String nm = name.getText().toString();
        String phone = phn.getText().toString();
        String location = address.getText().toString();
        String pblood = blood.getText().toString();
        String reletion = rel.getText().toString();
        String pproblem = prob.getText().toString();
        String equvalent =  how.getText().toString();
        String time = btime.getText().toString();


        if (!TextUtils.isEmpty(nm) && !TextUtils.isEmpty(phone) && !TextUtils.isEmpty(location)
                && !TextUtils.isEmpty(pblood) && !TextUtils.isEmpty(reletion) && !TextUtils.isEmpty(pproblem)) {

            String id = DB.push().getKey();
            Req_Model model = new Req_Model(id, nm, phone, pblood, location, reletion, pproblem, time, equvalent);

            DB.child(id).setValue(model);

            Toast.makeText(this,"Request Send", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Blood_Reg_Page.this, Blood_Group.class);
            startActivity(intent);
            finish();
        }else{

            Toast.makeText(this, "Fill Up The All Box", Toast.LENGTH_SHORT).show();
        }
    }
}


