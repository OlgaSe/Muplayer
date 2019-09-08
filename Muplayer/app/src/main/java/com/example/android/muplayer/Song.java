package com.example.android.muplayer;

/**
 * Created by Olga on 6/27/18.
 */

public class Song {
    /** song title */
    private String songTitle;

    /** name of artist */
    private String artistName;

    public Song (String songTitle, String artistName) {
        this.songTitle = songTitle;
        this.artistName = artistName;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getArtistName() {
        return artistName;
    }
}
