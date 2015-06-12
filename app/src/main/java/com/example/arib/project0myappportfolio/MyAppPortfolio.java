package com.example.arib.project0myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyAppPortfolio extends ActionBarActivity {

    Button spotify;
    Button scores;
    Button library;
    Button BIB;
    Button xyz;
    Button capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);


        //initializing and adding eventListener for spotify button
        spotify = (Button) findViewById(R.id.spotifyButton);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMessage("This will open my Spotify Streamer app.");
            }
        });

        //initializing and adding eventListener for scores button
        scores = (Button) findViewById(R.id.scoresButton);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMessage("This will open my Scores app.");
            }
        });

        //initializing and adding eventListener for library button
        library = (Button) findViewById(R.id.libraryButton);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMessage("This will open my library app.");
            }
        });

        //initializing and adding eventListener for BIB button
        BIB = (Button) findViewById(R.id.button);
        BIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMessage("This will open my Build it Bigger app.");
            }
        });

        //initializing and adding eventListener for xyz button
        xyz = (Button) findViewById(R.id.xyzButton);

        xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMessage("This will open my XYZ app.");
            }
        });

        //initializing and adding eventListener for capstone button
        capstone = (Button) findViewById(R.id.capStone);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMessage("This will open my Capstone app.");
            }
        });

    }



    public void clickMessage(String msg)
    {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
