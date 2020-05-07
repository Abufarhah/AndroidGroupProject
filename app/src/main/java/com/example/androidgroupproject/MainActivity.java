package com.example.androidgroupproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.androidgroupproject.model.Movie;
import com.example.androidgroupproject.model.MovieDao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private RecyclerView recyclerView;
    private MovieDao movieDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("AML",MODE_PRIVATE);

        if(sharedPreferences.contains("movies")) {
            movieDao=new MovieDao(loadData());
        } else {
            movieDao=new MovieDao();
        }

        populateRecyclerView();
    }

    @Override
    protected void onStop() {
        super.onStop();
        saveData();
    }

    private void populateRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        MyAdapter adapter=new MyAdapter(movieDao.getMovies());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void saveData(){
        sharedPreferences = getSharedPreferences("AML",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String data = gson.toJson(movieDao.getMovies()) ;
        editor.putString("movies" ,data);
        editor.apply();
    }

    private ArrayList<Movie> loadData() {
        sharedPreferences = getSharedPreferences("AML",MODE_PRIVATE);
        Gson gson = new Gson();
        String data = sharedPreferences.getString("movies",null);
        Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
        return gson.fromJson(data,type);
    }

}