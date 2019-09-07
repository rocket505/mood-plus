package com.example.moodplusv2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button discover;
    Button chatbot;
    Button journal;
    Button result;
    Button setting;
    Button sos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discover = findViewById(R.id.button1);
        chatbot = findViewById(R.id.button2);
        journal = findViewById(R.id.button3);
        result = findViewById(R.id.button4);
        setting = findViewById(R.id.button5);
        sos = findViewById(R.id.button6);


        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this, DiscoverActivity.class);
                startActivity(I);
            }
    });

        chatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this, ChatbotActivity.class);
                startActivity(I);
            }
        });

        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this, JournalActivity.class);
                startActivity(I);
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(I);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(I);
            }
        });

        sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this, SOSActivity.class);
                startActivity(I);
            }
        });



}
}
