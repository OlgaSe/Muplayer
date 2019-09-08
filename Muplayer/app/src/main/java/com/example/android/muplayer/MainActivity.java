package com.example.android.muplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows job playlist
        TextView job = (TextView) findViewById(R.id.job);

        // Set a click listener on that View
        job.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when job playlist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link JobActivity}
                Intent jobIntent = new Intent(MainActivity.this, JobActivity.class);
                // Start the new activity
                startActivity(jobIntent);
            }
        });

        // Find the View that shows the workout playlist
        TextView workout = (TextView) findViewById(R.id.workout);

        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent workoutIntent = new Intent(MainActivity.this, WorkoutActivity.class);
                startActivity(workoutIntent);
            }
        });

// Set OnClick listener for relax playlist
        TextView relax = (TextView) findViewById(R.id.relax);

        relax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relaxIntent = new Intent(MainActivity.this, RelaxActivity.class);
                startActivity(relaxIntent);
            }
        });

// Set OnClick listener for party playlist
        TextView party = (TextView) findViewById(R.id.party);

        party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent partyIntent = new Intent(MainActivity.this, PartyActivity.class);
                startActivity(partyIntent);
            }
        });

// Set OnClick listener for the travel playlist
        TextView travel = (TextView) findViewById(R.id.travel);

        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travelIntent = new Intent(MainActivity.this, TravelActivity.class);
                startActivity(travelIntent);
            }
        });
    }
}
