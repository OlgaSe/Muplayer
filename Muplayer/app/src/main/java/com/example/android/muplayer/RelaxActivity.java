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

public class RelaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Young and Beatiful", "Lana Del Rey"));
        songs.add(new Song("Girls Like You", "Maroon 5"));
        songs.add(new Song("Perfect", "Ed Sheeran"));
        songs.add(new Song("Say Something", "A Great Big World"));
        songs.add(new Song("Yellow", "Coldplay"));

        final SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = adapter.getItem(position);

                Intent currentSongIntent = new Intent(RelaxActivity.this, CurrentSongActivity.class);
                currentSongIntent.putExtra("songTitle", song.getSongTitle());
                currentSongIntent.putExtra("artistName", song.getArtistName());
                startActivity(currentSongIntent);
            }
        });
    }
}
