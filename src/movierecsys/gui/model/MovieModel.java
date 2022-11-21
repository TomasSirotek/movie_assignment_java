package movierecsys.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import movierecsys.be.Movie;
import movierecsys.bll.LogicManager;

import java.io.IOException;
import java.util.List;

public class MovieModel {
    private final LogicManager logicManager;
    private final ObservableList<Movie> movieList;

    public MovieModel() {
        this.logicManager = new LogicManager();
        movieList = FXCollections.observableArrayList();
    }

    public void fetchAllMovies(){
        movieList.clear();
        movieList.addAll(logicManager.getAllMovies());
    }

    public ObservableList<Movie> getMovieList() {
        return movieList;
    }

}
