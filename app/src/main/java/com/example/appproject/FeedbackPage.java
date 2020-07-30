package com.example.appproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeedbackPage extends AppCompatActivity {

    private EditText EditTextName;
    private EditText EditTextEmail;
    private EditText EditTextMessage;
    private Button buttonSubmit;
    private Button buttonCancel;

    /*private String name;
    private String email;
    private String message;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_page);

        EditTextName = (EditText) findViewById(R.id.EditTextName);
        EditTextEmail = (EditText) findViewById(R.id.EditTextEmail);
        EditTextMessage = (EditText) findViewById(R.id.EditTextMessage);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                ShowAcceptMsg();
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                ShowCancelMsg();
            }
        });
    }

    public void ShowAcceptMsg(){
        Toast.makeText(this,"Thank you for your feedback!",Toast.LENGTH_LONG).show();
    }

    public void ShowCancelMsg(){
        Toast.makeText(this,"Message Cancelled",Toast.LENGTH_LONG).show();
    }
}