package com.dominiks.beautifulgame;

import androidx.annotation.DrawableRes;

public class BeautifulGameListEntry {

    String heading;
    String description;
    int image;
    float ratingValue;


    public BeautifulGameListEntry(String heading, String description, @DrawableRes int image, Float ratingValue) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.ratingValue = ratingValue;
    }

}