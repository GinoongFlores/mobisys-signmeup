package com.example.activitylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView tv_Credentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        String credentials = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        tv_Credentials = findViewById(R.id.tv_ViewCredentials);
        tv_Credentials.setText("Welcome user! \n" + credentials);
    }
}