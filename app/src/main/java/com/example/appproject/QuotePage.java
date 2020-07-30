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
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

/**
 * Class for Quote Page
 * Responsible for displaying a different quote for the user
 */
public class QuotePage extends AppCompatActivity {

    //Class variables
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_page);

        //initialization of variable
        imageView = (ImageView) findViewById(R.id.imageQuote);
        showQuote();
    }

    //method to display quote image
    public void showQuote(){
        shuffleQuotes();
        imageView.setImageResource(quotesArray[0].getIdxImage());
    }

    //building array of quote images
    QuoteLibrary qu1 = new QuoteLibrary(R.drawable.quote1);
    QuoteLibrary qu2 = new QuoteLibrary(R.drawable.quote2);
    QuoteLibrary qu3 = new QuoteLibrary(R.drawable.quote3);
    QuoteLibrary qu4 = new QuoteLibrary(R.drawable.quote4);
    QuoteLibrary qu5 = new QuoteLibrary(R.drawable.quote5);
    QuoteLibrary qu6 = new QuoteLibrary(R.drawable.quote6);

    QuoteLibrary [] quotesArray = new QuoteLibrary[]{
      qu1,qu2,qu3,qu4,qu5,qu6
    };

    //method to randomize order fo quotes
    public void shuffleQuotes(){
        Collections.shuffle(Arrays.asList(quotesArray));
    }
}