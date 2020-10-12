package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    MediaPlayer hum;
    Timer timer;
    TimerTask task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //hum = MediaPlayer.create(SplashActivity.this, R.raw.song);
        //hum.start();

        task = new TimerTask() {
            @Override
            public void run() {
                finish();
                //hum.stop();
                startActivity(new Intent(SplashActivity.this, ItemListActivity.class));
            }
        };
        timer = new Timer();
        timer.schedule(task, 5000);
    }
}