package com.example.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackPage extends AppCompatActivity {

    private EditText EditTextName;
    private EditText EditTextEmail;
    private EditText EditTextMessage;
    private Button buttonSubmit;

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

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                ShowMsg();
            }
        });
    }

    public void ShowMsg(){
        Toast.makeText(this,"Thank you for your feedback!",Toast.LENGTH_LONG).show();
    }
}