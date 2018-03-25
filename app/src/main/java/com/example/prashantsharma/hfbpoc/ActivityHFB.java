package com.example.prashantsharma.hfbpoc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class ActivityHFB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hfb);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //perform button click action

        Button btnTypeA = findViewById(R.id.btn_typ1);
        btnTypeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Feedback1", "This is feedback A.");
                Toast.makeText(getApplicationContext(), "This is Feedback A.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
