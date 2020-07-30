package com.example.appproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewsPage extends AppCompatActivity {
    private Button buttonPos;
    private Button buttonGood;
    private Button buttonHuff;
    private Button buttonToday;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_page);

        //Good News Network
        buttonGood = (Button) findViewById(R.id.buttonGood);
        buttonGood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton("https://www.goodnewsnetwork.org/");
            }
        });

        //Huffington Post
        buttonHuff = (Button) findViewById(R.id.buttonHuff);
        buttonHuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton("https://www.huffpost.com/impact/topic/good-news");
            }
        });

        //Positive News
        buttonPos = findViewById(R.id.buttonPos);
        buttonPos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton("https://www.positive.news/");
            }
        });

        //Today News
        buttonToday = findViewById(R.id.buttonToday);
        buttonToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton("https://www.today.com/news/good-news");
            }
        });


    }

    public void clickButton(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}