package com.kayeswap.shahajjo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Blood_Request extends AppCompatActivity {

    ListView listview;
    SearchView searchView;
    FirebaseDatabase database;
    DatabaseReference ref;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Req_Model user;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blood_request);
        listview = findViewById(R.id.listv);
        searchView = findViewById(R.id.search);
        user = new Req_Model();

        btn = findViewById(R.id.requestbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Blood_Request.this, Blood_Reg_Page.class));


            }
        });


        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Blood_Request");

        Query query = ref.child("Blood_Request")
                .limitToFirst(30);

        list  =new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,R.layout.user_info,R.id.useInfo, list);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()){

                    user = ds.getValue(Req_Model.class);
                    list.add("Name: " +user.getName()+ '\n' +"Phone: " + user.getPhone()+ '\n'
                            +"Blood Group: " +user.getBlood()+ '\n' +"Hospital: "+ user.getLocation()+
                            '\n' +"Reletion: "+ user.getRelation()+ '\n' +"Problem: "+ user.getProblem()+
                            '\n' +"When Need : "+ user.getTime()+ '\n' +"How Much Bag: "+ user.getHow());
                }
                listview.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
