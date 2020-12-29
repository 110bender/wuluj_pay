package com.example.wuluj.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wuluj.R;

public class MainActivity extends AppCompatActivity {
    private Button homeBtn1;
    private Button homeBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeBtn1 = findViewById(R.id.homeBtn1);
        homeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFeed();
            }
        });
        homeBtn2 = findViewById(R.id.homeBtn2);
        homeBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLaunch();
            }
        });

    }
    public void goToFeed() {
        Intent intent = new Intent(this, FeedActivity.class);
        startActivity(intent);
    }
    public void goToLaunch(){
        Intent intent = new Intent(this, LaunchActivity.class);
        startActivity(intent);
    }
}