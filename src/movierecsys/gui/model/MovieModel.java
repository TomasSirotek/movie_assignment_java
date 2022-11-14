package movierecsys.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import movierecsys.be.Movie;
import movierecsys.bll.LogicManager;
import movierecsys.bll.OwsLogicFacade;

import java.util.List;

public class MovieModel {
    private LogicManager logicManager;
    private ObservableList<Movie> movieList;

    private MovieModel(LogicManager logicFacade){
        this.logicManager = logicFacade;
    }

    public ObservableList<Movie> getMovieList() {
        List<Movie> fetchedMovies = logicManager.getAllTimeTopRatedMovies();
        return movieList = FXCollections.observableArrayList(fetchedMovies);
    }

    public void setMovieList(ObservableList<Movie> movieList) {
        this.movieList = movieList;
    }
    
    
}
