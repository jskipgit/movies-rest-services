package com.ironyard.controller.rest;

import com.ironyard.data.Movie;
import com.ironyard.data.MovieUser;
import com.ironyard.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by jasonskipper on 2/20/17.
 */
@RestController
public class RestUserController {

    @Autowired
    UserRepo userRepo = null;

    @RequestMapping(path = "/rest/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id){
        userRepo.delete(id);
    }

    @RequestMapping(path = "/rest/users", method = RequestMethod.GET)
    public Iterable<MovieUser> listUsers(){
        return userRepo.findAll();
    }
}
