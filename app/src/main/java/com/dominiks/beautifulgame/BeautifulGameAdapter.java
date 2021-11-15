package com.dominiks.beautifulgame;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.recyclerview.widget.RecyclerView;

public class BeautifulGameAdapter extends RecyclerView.Adapter<BeautifulGameAdapter.BeautifulGameEntryViewHolder> {

    private BeautifulGameListEntry[] entries;

    public BeautifulGameAdapter(BeautifulGameListEntry[] entries) {
        this.entries = entries;
    }

    @Override
    public int getItemCount() {
        return entries.length;
    }

    @NonNull
    @Override
    public BeautifulGameEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_football_list_entry, parent, false);
        return new BeautifulGameEntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeautifulGameEntryViewHolder holder, int position) {
        holder.bind(entries[position], position);

    }

    static class BeautifulGameEntryViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView headerText;
        private TextView descriptionText;
        private RatingBar ratingBar;

        public BeautifulGameEntryViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view_item_picture);
            headerText = itemView.findViewById(R.id.text_view_heading);
            descriptionText = itemView.findViewById(R.id.text_view_description);
            ratingBar = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(BeautifulGameListEntry entry, int position) {
            image.setImageResource(entry.image);
            String headerString = position + 1 + ". " + entry.heading;
            headerText.setText(headerString);
            descriptionText.setText(entry.description);
            ratingBar.setRating(entry.ratingValue);
        }
    }
}
