package com.example.myhp.digitalindia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by my hp on 4/9/2016.
 */
public class DrivingTest extends AppCompatActivity implements View.OnClickListener {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.driving_test);
        //   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_login);
        //  setSupportActionBar(toolbar);

        findViewById(R.id.license_no).setOnClickListener(this);
        findViewById(R.id.dob).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

    }
}
