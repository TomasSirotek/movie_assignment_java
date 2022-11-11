package movierecsys.bll.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MovieDAOException extends IOException {

    public MovieDAOException(String message,Throwable cause){
        super(message,cause);
    }
}