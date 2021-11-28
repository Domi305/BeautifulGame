package com.dominiks.beautifulgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StadiumsToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadiums_to_go);
        setupList();
    }

    private void setupList() {
        BeautifulGameListEntry[] stadiumsToGo = {
                new BeautifulGameListEntry("Amsterdam Arena", "Home of Dutch team Ajax Amsterdam", R.drawable.ajax, 5f),
                new BeautifulGameListEntry("Old Trafford", "Man Utd. ground, as know as Theater of Dreams", R.drawable.oldtrafford, 4f),
                new BeautifulGameListEntry("Allianz Arena", "Football stadium in Munich, Bavaria, Germany. R. Lewandowski scores here a lot", R.drawable.allianzarena, 4.5f),
                new BeautifulGameListEntry("Camp Nou", "Opened in 1957 and has been the home stadium of FC Barcelona since its completion. Messi used to play here", R.drawable.campnou, 4f),
                new BeautifulGameListEntry("San Siro", "Stadio Giuseppe Meazza, is a football stadium in the district of Milan, Italy, home of A.C. Milan and Internazionale.", R.drawable.sansiro, 3.5f),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_stadiums_to_go);
        BeautifulGameAdapter adapter = new BeautifulGameAdapter(stadiumsToGo);
        recyclerView.setAdapter(adapter);
    }
}