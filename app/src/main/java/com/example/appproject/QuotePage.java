package com.example.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class QuotePage extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_page);

        imageView = (ImageView) findViewById(R.id.imageQuote);
        showQuote();
    }

    public void showQuote(){
        shuffleQuotes();
        imageView.setImageResource(quotesArray[0].getIdxImage());
    }

    QuoteLibrary qu1 = new QuoteLibrary(R.drawable.quote1);
    QuoteLibrary qu2 = new QuoteLibrary(R.drawable.quote2);
    QuoteLibrary qu3 = new QuoteLibrary(R.drawable.quote3);
    QuoteLibrary qu4 = new QuoteLibrary(R.drawable.quote4);
    QuoteLibrary qu5 = new QuoteLibrary(R.drawable.quote5);
    QuoteLibrary qu6 = new QuoteLibrary(R.drawable.quote6);

    QuoteLibrary [] quotesArray = new QuoteLibrary[]{
      qu1,qu2,qu3,qu4,qu5,qu6
    };
    public void shuffleQuotes(){
        Collections.shuffle(Arrays.asList(quotesArray));
    }
}