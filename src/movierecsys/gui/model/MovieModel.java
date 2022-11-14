package movierecsys.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import movierecsys.be.Movie;
import movierecsys.bll.LogicManager;

import java.io.IOException;
import java.util.List;

public class MovieModel {
    private final LogicManager logicManager;
    private ObservableList<Movie> movieList;

    public MovieModel() throws Exception {
        this.logicManager = new LogicManager();
    }

    public ObservableList<Movie> getMovieList() throws IOException {
        List<Movie> fetchedMovies = logicManager.getAllTimeTopRatedMovies();
        return movieList = FXCollections.observableArrayList(fetchedMovies);
    }

    public void setMovieList(ObservableList<Movie> movieList) {
        this.movieList = movieList;
    }
    
    
}
