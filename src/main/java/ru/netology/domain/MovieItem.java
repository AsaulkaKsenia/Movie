package ru.netology.domain;


public class MovieItem {

    private int id;
    private String name;
    private String genre;


    public MovieItem(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }


}
