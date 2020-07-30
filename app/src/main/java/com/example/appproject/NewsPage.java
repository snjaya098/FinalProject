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
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Class for the News Page
 * Responsible for display links to positive news sites
 */
public class NewsPage extends AppCompatActivity {
    //Class variables
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
    //method for opening up Web page using phone internet browser
    public void clickButton(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}