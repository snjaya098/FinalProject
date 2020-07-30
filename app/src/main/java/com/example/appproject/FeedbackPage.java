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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Class for Feedback Page
 * Responsible for the functionality of the feedback page
 * Allows user to send send feedback
 */
public class FeedbackPage extends AppCompatActivity {

    //Class variables
    private EditText EditTextName;
    private EditText EditTextEmail;
    private EditText EditTextMessage;
    private Button buttonSubmit;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_page);

        //initialization of texts
        EditTextName = (EditText) findViewById(R.id.EditTextName);
        EditTextEmail = (EditText) findViewById(R.id.EditTextEmail);
        EditTextMessage = (EditText) findViewById(R.id.EditTextMessage);
        //initialization of buttons
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        //submit feedback button
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                ShowAcceptMsg();
            }
        });

        //cancel feedback button
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                ShowCancelMsg();
            }
        });
    }

    //message to user acknowledging feedback sent
    public void ShowAcceptMsg(){
        Toast.makeText(this,"Thank you for your feedback!",Toast.LENGTH_LONG).show();
    }

    //message to user acknowledging feedback cancelled
    public void ShowCancelMsg(){
        Toast.makeText(this,"Message Cancelled",Toast.LENGTH_LONG).show();
    }
}