package ru.netology.manager;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.domain.MovieItem;

public class MovieManagerTest {

    MovieItem item1 = new MovieItem(1, "Бладшот", "боевик");
    MovieItem item2 = new MovieItem(2, "Вперёд", "мультфильм");
    MovieItem item3 = new MovieItem(3, "Отель Белград", "комедия");
    MovieItem item4 = new MovieItem(4, "Джентельмены", "боевик");

    MovieItem item5 = new MovieItem(5, "Человек-невидимка", "ужасы");
    MovieItem item6 = new MovieItem(6, "Тролли.Мировой тур", "мультфильм");
    MovieItem item7 = new MovieItem(7, "Номер один", "комедия");


    @Test
    public void shouldAddNewMovies() {
        MovieManager film = new MovieManager();

        film.add(item1);
        film.add(item2);
        film.add(item3);
        film.add(item4);

        MovieItem[] expected = {item1, item2, item3, item4};
        MovieItem[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovies() {
        MovieManager film = new MovieManager();
        MovieItem[] expected = {};
        MovieItem[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovies() {
        MovieManager film = new MovieManager();

        film.add(item1);

        MovieItem[] expected = {item1};
        MovieItem[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMoviesDefault() {
        MovieManager film = new MovieManager();

        film.add(item1);
        film.add(item2);
        film.add(item3);
        film.add(item4);
        film.add(item5);
        film.add(item6);
        film.add(item7);

        film.findLast();

        MovieItem[] expected = {item7, item6, item5, item4, item3};
        MovieItem[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLastMoviesDefaultBeforeLimit() {
        MovieManager film = new MovieManager();

        film.add(item5);
        film.add(item6);
        film.add(item7);


        film.findLast();

        MovieItem[] expected = {item7, item6, item5};
        MovieItem[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLastMovies() {
        MovieManager film = new MovieManager(7);

        film.add(item1);
        film.add(item2);
        film.add(item3);
        film.add(item4);
        film.add(item5);
        film.add(item6);
        film.add(item7);

        film.findLast();

        MovieItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        MovieItem[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLastTwoMovies() {
        MovieManager film = new MovieManager(2);

        film.add(item1);
        film.add(item2);
        film.add(item3);
        film.add(item4);
        film.add(item5);
        film.add(item6);
        film.add(item7);

        MovieItem[] expected = {item7, item6};
        MovieItem[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}