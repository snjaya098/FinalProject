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

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Main Class for the Application
 * This is the Main Page UI (the first page the user sees)
 * Responsible for displaying all buttons for all options/UI's on application
 */
public class MainActivity extends AppCompatActivity {
    //Main Activity Class Variables
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //implementation of Music button
        button = (Button) findViewById(R.id.buttonMusic);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openMusicPlayer();
            }
        });

        //implementation of News button
        button2 = (Button) findViewById(R.id.buttonNews);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewsPage();
            }
        });

        //implementation of Quote button
        button3 = (Button) findViewById(R.id.buttonQuote);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuote();
            }
        });

        //implementation of Feedback button
        button4 = (Button) findViewById(R.id.buttonFeedBack);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeedBack();
            }
        });

        //implementation of About button
        button5 = (Button) findViewById(R.id.buttonAbout);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelp();
            }
        });
    }

    //method to open MusicPlayer class
    public void openMusicPlayer(){
        Intent intent1 = new Intent(this, MusicPlayer.class);
        startActivity(intent1);
    }

    //method to open NewsPage class
    public void openNewsPage(){
        Intent intent2 = new Intent(this, NewsPage.class);
        startActivity(intent2);
    }

    //method to open QuotePage class
    public void openQuote(){
        Intent intent3 = new Intent(this, QuotePage.class);
        startActivity(intent3);
    }

    //method to open FeedbackPage class
    public void openFeedBack(){
        Intent intent4 = new Intent(this, FeedbackPage.class);
        startActivity(intent4);
    }

    //method to open HelpPage class
    public void openHelp(){
        Intent intent5 = new Intent(this, HelpPage.class);
        startActivity(intent5);
    }
}