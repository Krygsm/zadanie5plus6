package com.example.zadanie56;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    int likeCount = 0;
    String savedMail;

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

        likeCountView = findViewById(R.id.likeCountView);
        likeButton = findViewById(R.id.likeButton);
        dislikeButton = findViewById(R.id.deleteButton);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passInput);
        confirmationInput = findViewById(R.id.confInput);
        saveButton = findViewById(R.id.saveButton);
        showButton = findViewById(R.id.showButton);
        notificationView = findViewById(R.id.notificationView);

        likeButton.setOnClickListener(view ->
        {
            likeCount++;
            likeCountView.setText(likeCount + " polubień");
        });

        dislikeButton.setOnClickListener(view ->
        {
            if (likeCount<=0) return;
            likeCount--;
            likeCountView.setText(likeCount + " polubień");
        });

        saveButton.setOnClickListener(view ->
        {
            String emailInputText = emailInput.getText().toString().trim();
            String passwordInputText = passwordInput.getText().toString().trim();
            String confInputText = confirmationInput.getText().toString().trim();

            if(!emailInputText.contains("@")) {notificationView.setText("Nieprawidłowy adres e-mail"); return; }
            if(!passwordInputText.equals(confInputText)) { notificationView.setText("Hasła się różnią"); return; }
            notificationView.setText("Zarejestrowano " + emailInputText);
            savedMail = emailInputText;
        });

        showButton.setOnClickListener(view ->
        {
            notificationView.setText(savedMail);
        });

    }
}