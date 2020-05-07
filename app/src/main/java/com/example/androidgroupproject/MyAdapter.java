package com.example.androidgroupproject;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidgroupproject.model.Movie;

import java.io.Serializable;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Movie> list;

    public MyAdapter(List<Movie> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final CardView cardView=holder.cardView;
        ImageView cardImage= cardView.findViewById(R.id.cardImage);
        Drawable drawable= ContextCompat.getDrawable(cardView.getContext(),list.get(position).getImageID());
        cardImage.setImageDrawable(drawable);
        TextView movieTitle= cardView.findViewById(R.id.movieTitle);
        movieTitle.setText(list.get(position).getTitle());
        TextView movieDescription= cardView.findViewById(R.id.movieDescription);
        movieDescription.setText(list.get(position).getDescription());

        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(cardView.getContext(),SecondActivity.class);
                intent.putExtra("Movie", (Serializable) list.get(position));
                cardView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView=cardView;
        }

    }

}
