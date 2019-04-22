package com.endava.demo.controller;

import com.endava.demo.model.Movie;
import com.endava.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;

//@Controller
//@ResponseBody
@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private RestTemplate restTemplate;

    //CRUD

    //create

    //RequestBody - all except get
    //RequestParam
    //PathVariable
    //@RequestMapping(value="/", method = RequestMethod.POST)
    @PostMapping(value="/")
    public int add(@RequestParam String title, @RequestParam String genre){ //we expect these 2
        movieService.add(title,genre);
        return 0;
    }
    //retrieve
    //TODO get by id
    //todo get all

    //update
    //TODO model -> rating (thumbs up)

    //delete
    @DeleteMapping(value="/{id}")
    public int delete(@PathVariable int id){
        return movieService.delete(id);
    }

    @PostMapping(value="/add") // body raw json
    public String addMovie(@RequestBody Movie movie, HttpServletResponse httpServletResponse){
        httpServletResponse.setStatus(HttpStatus.CREATED.value());
        return movie.getTitle();
    }

    @GetMapping("/")
    public void callRest(){
        String url = "http://localhost:8080/4";
        restTemplate.delete("", Integer.class);
    }
}
