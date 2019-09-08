package com.example.android.muplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("A Sky Full of Stars", "Coldplay"));
        songs.add(new Song("Beautiful Day", "U2"));
        songs.add(new Song("Mr.Brightside", "The Killers"));
        songs.add(new Song("Sex On Fire", "Kings Of Leon"));
        songs.add(new Song("Take Me Out", "Franz Ferdinand"));

        final SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = adapter.getItem(position);
                Intent currentSongIntent = new Intent(PartyActivity.this, CurrentSongActivity.class);
                currentSongIntent.putExtra("songTitle", song.getSongTitle());
                currentSongIntent.putExtra("artistName", song.getArtistName());
                startActivity(currentSongIntent);
            }
        });
    }
}
