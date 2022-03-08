package com.luisfernandomgrs.learning.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Application;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.luisfernandomgrs.learning.recyclerview.R;
import com.luisfernandomgrs.learning.recyclerview.adapter.AdapterFilms;
import com.luisfernandomgrs.learning.recyclerview.model.Film;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewFilm;
    private List<Film> filmList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize personal components
        recyclerViewFilm = findViewById(R.id.recyclerViewFilm);

        // creating list films
        myFillListFilm();

        // settings adapter
        AdapterFilms adapterFilms = new AdapterFilms(filmList);

        // settings RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewFilm.setLayoutManager(layoutManager);
        recyclerViewFilm.setHasFixedSize(true);
        recyclerViewFilm.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewFilm.setAdapter(adapterFilms);
    }

    public void myFillListFilm() {
        Film film;

        /*
        * List from: https://www.finder.com/br/filmes-netflix
        */
        film = new Film("A Christmas Prince: The Royal Wedding","2018","Children & Family Movies");
        this.filmList.add(film);

        film = new Film("A Cinderella Story","2004","Children & Family Movies");
        this.filmList.add(film);

        film = new Film("A Dog's Purpose","2017","Children & Family Movies");
        this.filmList.add(film);

        film = new Film("A Dogwalker's Christmas Tale","2015","Comedies");
        this.filmList.add(film);

        film = new Film("A Estrada 47","2013","Brazilian Dramas");
        this.filmList.add(film);

        film = new Film("A Family Affair","2015","Biographical Documentaries");
        this.filmList.add(film);

        film = new Film("A Fortunate Man","2018","Biographical Movies");
        this.filmList.add(film);

        film = new Film("A Goofy Movie","1995","Animated");
        this.filmList.add(film);

        film = new Film("A Gray State","2017","Biographical Documentaries");
        this.filmList.add(film);

        film = new Film("A Hard Day","2014","Crime Movies");
        this.filmList.add(film);

        film = new Film("A Heavy Heart","2015","Dramas");
        this.filmList.add(film);

        film = new Film("A Land Imagined","2019","Dramas");
        this.filmList.add(film);

        film = new Film("A Home with A View","2019","Chinese Movies");
        this.filmList.add(film);

        film = new Film("A Man Apart","2003","Action & Adventure");
        this.filmList.add(film);

        film = new Film("01 - Não será exibido","2022","Developer Test");
        this.filmList.add(film);

        film = new Film("02 - Não será exibido","2022","Developer Test");
        this.filmList.add(film);
    }
}