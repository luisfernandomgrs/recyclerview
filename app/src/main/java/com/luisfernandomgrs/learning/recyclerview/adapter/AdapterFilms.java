package com.luisfernandomgrs.learning.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.luisfernandomgrs.learning.recyclerview.R;
import com.luisfernandomgrs.learning.recyclerview.model.Film;

import java.util.List;

public class AdapterFilms extends RecyclerView.Adapter<AdapterFilms.ViewHolderFilms> {
   private List<Film> filmList;
   public AdapterFilms(List<Film> filmList) {
      this.filmList = filmList;
   }

   @NonNull
   @Override
   public ViewHolderFilms onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View adapterListFilms = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list_films, parent, false);
      return new ViewHolderFilms(adapterListFilms);
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolderFilms holder, int position) {
      Film film = filmList.get(position);

      holder.textTitleFilm.setText(film.getTitleFilm());
      holder.textGenreFilm.setText(film.getGenreFilm());
      holder.textYearFilm.setText(film.getYearFilm());
   }

   @Override
   public int getItemCount() {
      return filmList.size();
   }

   public class ViewHolderFilms extends RecyclerView.ViewHolder {
      TextView textTitleFilm;
      TextView textYearFilm;
      TextView textGenreFilm;

      public ViewHolderFilms(@NonNull View itemView) {
         super(itemView);

         textTitleFilm = itemView.findViewById(R.id.textTitleFilm);
         textYearFilm = itemView.findViewById(R.id.textYearFilm);
         textGenreFilm = itemView.findViewById(R.id.textGenreFilm);
      }
   }
}
