/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.dal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import movierecsys.be.Movie;
import movierecsys.be.User;

/**
 *
 * @author pgn
 */
public class UserDAO
{
    private static final String USER_SOURCE = "data/users.txt";
    /**
     * Gets a list of all known users.
     * @return List of users.
     */
    public List<User> getAllUsers()
    {
        List<User> allUsers = new ArrayList<>();
        File file = new File(USER_SOURCE);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {

                    User user = stringToUserObject(line);
                    allUsers.add(user);
                } catch (Exception ex) {
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allUsers;
    }

    /**
     * Reads a USER from a , s
     *
     * @param t
     * @return
     * @throws NumberFormatException
     */
    private User stringToUserObject(String t) {
        String[] arrUser = t.split(",");

        int id = Integer.parseInt(arrUser[0]);
        int year = Integer.parseInt(arrUser[1]);
        String name = arrUser[2];
        if (arrUser.length > 3) {
            for (int i = 3; i < arrUser.length; i++) {
                name += "," + arrUser[i];
            }
        }
        return new User(id, name);
    }




    /**
     * Gets a single User by its ID.
     * @param id The ID of the user.
     * @return The User with the ID.
     */
    public User getUser(int id)
    {
        //TODO Get User
        return null;
    }


    
    /**
     * Updates a user so the persistence storage reflects the given User object.
     * @param user The updated user.
     */
    public void updateUser(User user)
    {
        //TODO Update user.
    }
    
}
