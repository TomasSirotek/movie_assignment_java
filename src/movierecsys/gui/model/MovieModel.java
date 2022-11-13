package movierecsys.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import movierecsys.be.Movie;
import movierecsys.bll.OwsLogicFacade;

import java.util.List;

public class MovieModel {
    private OwsLogicFacade logicFacade;
    private ObservableList<Movie> movieList;

    private MovieModel(OwsLogicFacade logicFacade){
        this.logicFacade = logicFacade;
    }

    public ObservableList<Movie> getMovieList() {
        List<Movie> fetchedMovies = logicFacade.getAllTimeTopRatedMovies();
        return movieList = FXCollections.observableArrayList(fetchedMovies);
    }

    public void setMovieList(ObservableList<Movie> movieList) {
        this.movieList = movieList;
    }
    
    
}
