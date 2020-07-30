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

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Helper class to MusicPlayer.class
 * Responsible for the functionality and layout ot the Music UI.
 */
public class CustomMusicAdapter extends BaseAdapter {

    //Class variables
    private Context context;
    private int layout;
    private ArrayList<Music> arrayList;
    private MediaPlayer mediaPlayer;
    private Boolean flag = true;

    /**
     * Constructs an instance of the CustomMusicAdapter.
     *
     * @param context
     * @param layout layout song display
     * @param arrayList list of songs
     */

    public CustomMusicAdapter(Context context, int layout, ArrayList<Music> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    //Returns size of the arraylist
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /**Class variables responsible for View Holder class
     * ViewHolder responsible for layout of the songs and buttons
     * (play, pause, stop, download)
     * */
    private class ViewHolder{
        TextView txtSongTitle, txtArtist;
        ImageView ivPlay, ivStop;
    }

    /**
     * Updates the layout of the song by updating the song title
     * and artist for each song from the library
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout,null);
            viewHolder.txtSongTitle = (TextView) convertView.findViewById(R.id.txtSongTitle);
            viewHolder.txtArtist = (TextView) convertView.findViewById(R.id.txtArtist);
            viewHolder.ivPlay = (ImageView) convertView.findViewById(R.id.ivPlay);
            viewHolder.ivStop = (ImageView) convertView.findViewById(R.id.ivStop);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Music music = arrayList.get(position);
        viewHolder.txtSongTitle.setText(music.getTitle());
        viewHolder.txtArtist.setText(music.getArtist());

        //implementation of play button and pause button
        viewHolder.ivPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    mediaPlayer = MediaPlayer.create(context,music.getSong());
                    flag=false;
                }
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    viewHolder.ivPlay.setImageResource(R.drawable.play_button);
                }else{
                    mediaPlayer.start();
                    viewHolder.ivPlay.setImageResource(R.drawable.pause_button);
                }
            }
        });

        //implementation of stop button
        viewHolder.ivStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!flag){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    flag=true;
                }
                viewHolder.ivPlay.setImageResource(R.drawable.play_button);
            }
        });

        return convertView;
    }
}
