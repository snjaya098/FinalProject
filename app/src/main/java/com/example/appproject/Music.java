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

/**
 * Helper class to MusicPlayer class
 * Getter and setter class for the variables used in the music interface
 * (Song title, Song artist and Song list number)
 */
public class Music {
    private String title;
    private String artist;
    private int song;

    /**
     * Constructs and instance of Music class
     * @param title title of song
     * @param artist artists name
     * @param song song index in array
     */
    public Music(String title, String artist, int song) {
        this.title = title;
        this.artist = artist;
        this.song = song;
    }
    //return Song Index ID
    public int getSong() {
        return song;
    }

    //set Song Index ID
    public void setSong(int song) {
        this.song = song;
    }

    //return Artist Name
    public String getArtist() {
        return artist;
    }

    //set Artist Name
    public void setArtist(String artist) {
        this.artist = artist;
    }

    //return Song Title
    public String getTitle() {
        return title;
    }

    //return Song Title
    public void setTitle(String title) {
        this.title = title;
    }
}
