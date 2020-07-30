/**
 * MIT License
 *
 * Copyright (c) [2020] [Sachi Nathanya Jayasooriya A.D.]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.example.appproject;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Main class for the Music Page
 * Displays a list of 5 random songs for the user to listen to.
 */
public class MusicPlayer extends AppCompatActivity {
    //Class variables
    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        //List of songs
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music ("Celebration","Kool & The Gang",R.raw.celebration));
        arrayList.add(new Music ("Don't Stop Me Now","Queen",R.raw.dont_stop_me));
        arrayList.add(new Music ("Don't Worry, Be Happy","Bobby McFerrin",R.raw.dont_worry));
        arrayList.add(new Music ("Good as Hell","Lizzo",R.raw.good_as_hell));
        arrayList.add(new Music ("Happy","Pharell Williams",R.raw.happy));

        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);
    }
}