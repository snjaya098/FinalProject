package com.example.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Always","Frank Sinatra", R.raw.fstrack2));
        arrayList.add(new Music("Autumn Leaves","Frank Sinatra",R.raw.fstrack3));
        arrayList.add(new Music("Fly Me to Moon","Frank Sinatra",R.raw.fstrack4));
        arrayList.add(new Music("I Cant Stop Loving You","Frank Sinatra",R.raw.fstrack5));
        arrayList.add(new Music("I Love You Baby","Frank Sinatra",R.raw.fstrack1));

        adapter = new CustomMusicAdapter(this, R.layout.musicicon,arrayList);
        songList.setAdapter(adapter);
    }
}