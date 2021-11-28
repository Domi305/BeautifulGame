package com.dominiks.beautifulgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class WaysToPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ways_to_play);
        setupList();
    }

    private void setupList() {
        BeautifulGameListEntry[] waysToPlay = {
                new BeautifulGameListEntry("Grassroots Football", "Football is a family of team sports that involve, to varying degrees, kicking a ball to score a goal.", R.drawable.grassfootball, 5f),
                new BeautifulGameListEntry("Beach Soccer", "Beach soccer, also known as beach football, sand football, is a similar sport to association football. The thing that differs is that this game is played on a beach or some form of sand. Such terrain emphasizes skill, agility, and accuracy in shooting at the goal even more than when playing association football.", R.drawable.beachsoccer, 4.5f),
                new BeautifulGameListEntry("Futsal", "Futsal is FIFA's official indoor soccer game which is, essentially, a scaled down version of outdoor soccer played indoors. It is a small sided game (5v5) played on a smaller field (roughly basketball court sized) with a smaller (size 3-4) ball. Futsal is played with touchline boundaries. There are no walls in play.", R.drawable.futsal, 3f),
                new BeautifulGameListEntry("Street Soccer", "street soccer encompass a number of informal varieties of association football. These informal pick up games do not necessarily follow the requirements of a formal game of football, such as a large field, field markings, goal apparatus and corner flags, eleven players per team, or match officials", R.drawable.streetsoccer, 3.5f),
                new BeautifulGameListEntry("Cageball", "It is similar to traditional indoor football, although with some changes: as the name implies, one plays in a cage. Due to the enclosed environment, the game is faster and more dynamic, and putting greater emphasis on football technique.", R.drawable.cagefoot, 2.5f),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_ways_to_play);
        BeautifulGameAdapter adapter = new BeautifulGameAdapter(waysToPlay);
        recyclerView.setAdapter(adapter);
    }
}