package com.example.android.muplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Feel Good Inc", "Gorillaz"));
        songs.add(new Song("Chandelier", "Sia"));
        songs.add(new Song("Little Talks", "Of Monsters And Men"));
        songs.add(new Song("Thunder", "Imagine Dragons"));
        songs.add(new Song("Counting Stars", "OneRepublic"));


        final SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = adapter.getItem(position);
                Intent currentSongIntent = new Intent(TravelActivity.this, CurrentSongActivity.class);
                currentSongIntent.putExtra("songTitle", song.getSongTitle());
                currentSongIntent.putExtra("artistName", song.getArtistName());
                startActivity(currentSongIntent);
            }
        });
    }
}
