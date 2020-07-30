package com.example.appproject;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelpPage extends AppCompatActivity {

    Spinner spinner;
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

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        record = "Need some music that puts that extra skip in your step? The Music page will provide you with a list of 5 random songs that define happiness and good vibes everyday. Like what you hear? Just click the download button and get it straight on your phone. Lets dance!";
                        break;
                    case 1:
                        record = "Want to see some news that's not all bad? The News page will provide you with links to some of our favourite sites for news. The difference is that it will take you sites that only posts positive and uplifting stories from around the world. All to make you smile :) ";
                        break;
                    case 2:
                        record = "Need a quick pick-me-up to motivate you for the day? The Quote page will give you a different positive quote everyday in order to lift up your mood and motivate you to achieve all you have for the day. Now go on! You've got this! We believe in you.";
                        break;
                    case 3:
                        record = "See room for improvement? Let us know! The feedback page allows you to tell us things o what to see improved or simply what you enjoy about the app! Just send us message with your name and email and we will be sure to make this experience better for you!";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void displayResult(View view){
        display_data.setTextSize(18);
        display_data.setText(record);
    }
}