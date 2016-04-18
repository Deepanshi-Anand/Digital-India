package com.example.myhp.digitalindia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by my hp on 4/9/2016.
 */
public class Services extends AppCompatActivity implements View.OnClickListener {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.services);
        //   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_login);
        //  setSupportActionBar(toolbar);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button1:
                Class i=null;
                try {

                    i = Class.forName("com.example.myhp.digitalindia.LearnerLicense");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent k = new Intent(getApplicationContext(), i);
                startActivity(k);
                break;


            case R.id.button2:
                Class i1=null;
                try {
                    i1 = Class.forName("com.example.myhp.digitalindia.DrivingTest");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent k1 = new Intent(getApplicationContext(), DrivingTest.class);
                startActivity(k1);
                break;

            case R.id.button3:
                Class i2=null;
                try {
                    i2 = Class.forName("com.example.myhp.digitalindia.Register");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent k2 = new Intent(getApplicationContext(),Register.class);
                startActivity(k2);
                break;



        }

    }
}
