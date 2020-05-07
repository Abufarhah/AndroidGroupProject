package com.example.androidgroupproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidgroupproject.model.Movie;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
    private Movie movie;
    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view=getView();
        if(view!=null){
            ImageView movieImage=view.findViewById(R.id.movieImage);
            TextView Title=view.findViewById(R.id.Title);
            TextView movieDescription=view.findViewById(R.id.movieDescription);
            TextView director=view.findViewById(R.id.director);
            TextView stars=view.findViewById(R.id.stars);

            movieImage.setImageResource(movie.getImageID());
            Title.setText(movie.getTitle());
            movieDescription.setText(movie.getDescription());
            director.setText("director: "+movie.getDirector());
            stars.setText("stars: "+movie.getStars());
        }
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}
