package com.example.prashantsharma.hfbpoc;

import android.Manifest;
import android.content.Intent;
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
    private final int CODE_PERMISSIONS = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hfb);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //perform button click action for Feedback A
        Button btnTypeA = findViewById(R.id.btn_typ1);
        btnTypeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("FeedbackA", "This is feedback A.");
                Toast.makeText(getApplicationContext(), "This is Feedback A.", Toast.LENGTH_SHORT).show();

            }
        });

        //perform button click action for Feedback B
        Button btnTypeB = findViewById(R.id.btn_typ2);
        btnTypeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("FeedbackB", "This is feedback B.");
                Toast.makeText(getApplicationContext(), "This is Feedback B.", Toast.LENGTH_SHORT).show();
            }
        });

        //perform button click action for Feedback B
        Button btnTypeIA = findViewById(R.id.btn_typ3);
        btnTypeIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.i("IndoorAtlas", "Navigate to indoor atlas.");
//                Toast.makeText(getApplicationContext(), "Navigate to indoor atlas.", Toast.LENGTH_SHORT).show();
                Intent ia = new Intent(ActivityHFB.this, ActivityIAtlas.class );
                startActivity(ia);
            }
        });

    }
}
