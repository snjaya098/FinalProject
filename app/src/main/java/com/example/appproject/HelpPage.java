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
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
/**
 * Class for the About page.
 * Responsible for telling the user how to use the app
 */
public class HelpPage extends AppCompatActivity {
    //Class variables
    Spinner spinner; //drop down menu
    String options[] = {"Music","News","Quote","Feedback"};
    ArrayAdapter <String> adapter;
    String record = "";
    TextView display_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);

        spinner = (Spinner) findViewById(R.id.spinMenu);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options);

        display_data = (TextView) findViewById(R.id.txtDisplayResult);

        spinner.setAdapter(adapter);

        //implementation of drop down menu and the options
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0://if user selects Music
                        record = "Need some music that puts that extra skip in your step? The Music page will provide you with a list of 5 random songs that define happiness and good vibes everyday. Get your groove on!";
                        break;
                    case 1://if user selects News
                        record = "Want to see some news that's not all bad? The News page will provide you with links to some of our favourite sites for news. The difference is that it will take you sites that only posts positive and uplifting stories from around the world. All to make you smile :) ";
                        break;
                    case 2://if user selects Quote
                        record = "Need a quick pick-me-up to motivate you for the day? The Quote page will give you a different positive quote everyday in order to lift up your mood and motivate you to achieve all you have for the day. Now go on! You've got this! We believe in you.";
                        break;
                    case 3://if user selects Feedback
                        record = "See room for improvement? Let us know! The feedback page allows you to tell us things o what to see improved or simply what you enjoy about the app! Just send us message with your name and email and we will be sure to make this experience better for you!";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    //method to display result
    public void displayResult(View view){
        display_data.setTextSize(18);
        display_data.setText(record);
    }
}