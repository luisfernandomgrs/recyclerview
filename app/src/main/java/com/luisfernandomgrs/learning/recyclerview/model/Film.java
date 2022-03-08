package com.luisfernandomgrs.learning.recyclerview.model;

public class Film {
    private String titleFilm;
    private String yearFilm;
    private String genreFilm;

    public Film() {
    }

    public Film(String titleFilm, String yearFilm, String genreFilm) {
        this.titleFilm = titleFilm;
        this.yearFilm = yearFilm;
        this.genreFilm = genreFilm;
    }

    public String getTitleFilm() {
        return titleFilm;
    }

    public void setTitleFilm(String titleFilm) {
        this.titleFilm = titleFilm;
    }

    public String getYearFilm() {
        return yearFilm;
    }

    public void setYearFilm(String yearFilm) {
        this.yearFilm = yearFilm;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }
}
