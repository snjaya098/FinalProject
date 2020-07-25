package com.example.appproject;

public class Music {
    private String title;
    private String artist;
    private int song;

    public Music(String title, String artist, int song) {
        this.title = title;
        this.artist = artist;
        this.song = song;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public int getSong() {
        return song;
    }
    public void setSong(int song){
        this.song = song;
    }

}