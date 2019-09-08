package com.example.android.muplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        Intent intent = getIntent();
        String currentSongTitle = intent.getStringExtra("songTitle");
        String currentArtistName = intent.getStringExtra("artistName");

        TextView songTitle = findViewById(R.id.current_song_title);
        songTitle.setText(currentSongTitle);

        TextView artistName = findViewById(R.id.current_artist_name);
        artistName.setText(currentArtistName);
    }
}
