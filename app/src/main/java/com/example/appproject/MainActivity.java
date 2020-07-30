package com.example.appproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonMusic);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openMusicPlayer();
            }
        });

        button2 = (Button) findViewById(R.id.buttonNews);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewsPage();
            }
        });

        button3 = (Button) findViewById(R.id.buttonQuote);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuote();
            }
        });

        button4 = (Button) findViewById(R.id.buttonFeedBack);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeedBack();
            }
        });

        button5 = (Button) findViewById(R.id.buttonAbout);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelp();
            }
        });
    }

    public void openMusicPlayer(){
        Intent intent1 = new Intent(this, MusicPlayer.class);
        startActivity(intent1);
    }

    public void openNewsPage(){
        Intent intent2 = new Intent(this, NewsPage.class);
        startActivity(intent2);
    }

    public void openQuote(){
        Intent intent3 = new Intent(this, QuotePage.class);
        startActivity(intent3);
    }

    public void openFeedBack(){
        Intent intent4 = new Intent(this, FeedbackPage.class);
        startActivity(intent4);
    }

    public void openHelp(){
        Intent intent5 = new Intent(this, HelpPage.class);
        startActivity(intent5);
    }
}