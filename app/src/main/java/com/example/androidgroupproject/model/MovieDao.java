package com.example.androidgroupproject.model;

import com.example.androidgroupproject.R;

import java.util.ArrayList;
import java.util.List;

public class MovieDao {
    private List<Movie> movies=new ArrayList<Movie>();

    public MovieDao(){
        movies=new ArrayList<Movie>();
        movies.add(new Movie("Godzilla vs. Kong","As the gigantic Kong meets the unstoppable Godzilla, the world watches to see which one of them will become King of the Monsters.", R.drawable.movie1,"Adam Wingard","Eiza González, Millie Bobby Brown, Alexander Skarsgård, Rebecca Hall"));
        movies.add(new Movie("Mulan","A young Chinese maiden disguises herself as a male warrior in order to save her father. A live-action feature film based on Disney's 'Mulan.'",R.drawable.movie2,"Niki Caro","Yifei Liu, Donnie Yen, Li Gong, Jet Li"));
        movies.add(new Movie("Wonder Woman 1984","Plot unknown. A sequel to the 2017 superhero film 'Wonder Woman.'",R.drawable.movie3,"Patty Jenkins","Gal Gadot, Pedro Pascal, Connie Nielsen, Chris Pine"));
        movies.add(new Movie("The Flash","The plot is unknown. Feature film based on the comic book superhero, The Flash.",R.drawable.movie4,"Andy Muschietti","Ezra Miller"));
        movies.add(new Movie("Green Lantern Corps","A group of humans join the Green Lantern Corps, an alien interstellar police force that protects the universe.",R.drawable.movie5,"Craig Gillespie","Emma Stone, Emma Thompson, Mark Strong, Joel Fry"));
    }

    public MovieDao(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
