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

public class JobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Sail", "AWOLNATION"));
        songs.add(new Song("Du Hast", "Rammstein"));
        songs.add(new Song("Unforgiven", "Metallica"));
        songs.add(new Song("Toxicity", "System of a Down"));
        songs.add(new Song("Basket Case", "Green Day"));

        final SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = adapter.getItem(position);

                Intent currentSongIntent = new Intent(JobActivity.this, CurrentSongActivity.class);
                currentSongIntent.putExtra("songTitle", song.getSongTitle());
                currentSongIntent.putExtra("artistName", song.getArtistName());
                startActivity(currentSongIntent);
            }
        });
    }
}
