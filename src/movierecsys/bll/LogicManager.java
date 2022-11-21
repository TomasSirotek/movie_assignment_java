package movierecsys.bll;

import movierecsys.be.Movie;
import movierecsys.be.Rating;
import movierecsys.be.User;
import movierecsys.dal.IMovieDAO;
import movierecsys.dal.MovieDAO;


import java.io.IOException;
import java.util.List;

public class LogicManager implements OwsLogicFacade{

    private final IMovieDAO movieDAO;
    public LogicManager() {
        this.movieDAO = new MovieDAO();
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDAO.getAllMovies();
    }
    @Override
    public List<Rating> getRecommendedMovies(User user) {
        return List.of();
    }

    @Override
    public List<Movie> getAllTimeTopRatedMovies(){
        return movieDAO.getAllMovies();
    }

    @Override
    public List<Movie> getMovieReccomendations(User user) {
        return null;
    }

    @Override
    public List<Movie> searchMovies(String query) {
        return null;
    }

    @Override
    public Movie createMovie(int year, String title) {
        return null;
    }

    @Override
    public void updateMovie(Movie movie) {

    }

    @Override
    public void deleteMovie(Movie movie) {

    }

    @Override
    public void rateMovie(Movie movie, User user, int rating) {

    }

    @Override
    public User createNewUser(String name) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
