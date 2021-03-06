package com.endava.demo.repository;

import com.endava.demo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import static java.sql.Types.NULL;

@Repository
public class MovieRepository {
    @Autowired // whay?
    private JdbcTemplate jdbcTemplate; //to connet to database


    public int add(Movie movie) {

        int id = 0;
        if(getMaxId() != NULL){
            id = getMaxId();
        }
        movie.setId(id+1);

        String query = "INSERT into movie values(?,?,?)";
        return jdbcTemplate.update(query,movie.getId(),movie.getTitle(),movie.getGenre());
    }

    private int getMaxId(){
        String query = "SELECT max(id) from movie";
        return jdbcTemplate.queryForObject(query, Integer.class);
    }

    public int delete(int id) {
        String query = "DELETE from movie where id=?";
        return jdbcTemplate.update(query,id);

    }
}
