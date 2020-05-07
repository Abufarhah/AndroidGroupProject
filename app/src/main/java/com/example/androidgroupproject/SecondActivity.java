package com.example.androidgroupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidgroupproject.model.Movie;

public class SecondActivity extends AppCompatActivity {

    DetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        detailFragment= (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentID);
        Intent intent =getIntent() ;
        Movie movie = (Movie)intent.getSerializableExtra("Movie");
        detailFragment.setMovie(movie);
    }
}
