package com.example.zadanie56;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    TextView likeCountView;
    Button likeButton;
    Button dislikeButton;
    EditText emailInput;
    EditText passwordInput;
    EditText confirmationInput;
    Button saveButton;
    Button showButton;
    TextView notificationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}