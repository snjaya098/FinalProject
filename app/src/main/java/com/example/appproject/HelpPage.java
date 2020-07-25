package com.example.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class HelpPage extends AppCompatActivity {

    Spinner spinner;
    String options[] = {"Music","News","Quote"};
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
                        record = "Music";
                        break;
                    case 1:
                        record = "News";
                        break;
                    case 2:
                        record = "Quote";
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