package com.dominiks.beautifulgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    private void setupClickListeners() {
        CardView waysToPlayCard = findViewById(R.id.card_view_ways_to_play);
        CardView stadiumsToGoCard = findViewById(R.id.card_view_stadiums_to_go);

        waysToPlayCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent waysToPlayActivityIntent = new Intent(MainActivity.this, WaysToPlayActivity.class);
                startActivity(waysToPlayActivityIntent);
            }
        });

        stadiumsToGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stadiumsToGoActivityIntent = new Intent(MainActivity.this, StadiumsToGoActivity.class);
                startActivity(stadiumsToGoActivityIntent);
            }
        });
    }
}