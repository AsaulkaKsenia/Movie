package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private int shouMovie;
    private MovieItem[] items = new MovieItem[0];


    public MovieManager() {
        shouMovie = 5;
    }

    public MovieManager(int shouMovie) {
        this.shouMovie = shouMovie;
    }

    public void add(MovieItem item) {
        MovieItem[] tmp = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }


    public MovieItem[] findLast() {
        int resultLength;
        if (items.length < shouMovie) {
            resultLength = items.length;
        } else {
            resultLength = shouMovie;
        }

        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }

}


