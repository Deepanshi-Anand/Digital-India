package com.example.myhp.digitalindia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;


/**
 * Created by my hp on 4/9/2016.
 */
public class LearnerLicense extends AppCompatActivity implements View.OnClickListener {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.learners);
         /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_login);
        setSupportActionBar(toolbar);
        */

        TextView t1 = (TextView) findViewById(R.id.text_learners);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t2 = (TextView) findViewById(R.id.text_drivers);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3 = (TextView) findViewById(R.id.text_payment);
        t3.setMovementMethod(LinkMovementMethod.getInstance());


    }

    @Override
    public void onClick(View v) {

    }
}