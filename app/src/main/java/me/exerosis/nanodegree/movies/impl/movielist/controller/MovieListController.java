package me.exerosis.nanodegree.movies.impl.movielist.controller;


import android.support.v4.app.LoaderManager;

import java.net.URL;
import java.util.Collection;
import me.exerosis.nanodegree.movies.impl.movielist.model.Movie;

public interface MovieListController extends LoaderManager.LoaderCallbacks<Collection<Movie>> {
    void setURL(URL url);
    void refresh();
}
