package com.example.dell.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class START extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}