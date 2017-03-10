package com.realzhang.youtube_api_diversify_using;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeIntents;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = YouTubeIntents.
                createPlayVideoIntentWithOptions(this, "youtube_url", true, true);
        startActivity(intent);

    }
}
