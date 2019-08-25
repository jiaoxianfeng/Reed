package com.example.Controller;

import com.example.Database.BookEntity;
import com.example.Database.FilmEntity;
import com.example.Database.ReplyEntity;
import com.example.Database.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@RestController
public class SearchController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Value("${com.example.mongodb.collection.Book}")
    private String BOOK_COLLECTION_NAME;
    @Value("${com.example.mongodb.collection.Film}")
    private String TEAM_COLLECTION_NAME;
    @Value("${com.example.mongodb.collection.Team}")
    private String FILM_COLLECTION_NAME;
    @PostMapping(value = "/search/find")


    public Map<String,List<?>> List(@RequestBody Map<String,Object> map) {
        String name = map.get("name").toString();
        Pattern pattern = Pattern.compile("^.*"+name+".*$", Pattern.CASE_INSENSITIVE);
        Query bookquery = new Query(Criteria.where("bookName").regex(pattern));
        Query filmquery = new Query(Criteria.where("filmName").regex(pattern));
        Query teamquery = new Query(Criteria.where("teamName").regex(pattern));
        List<BookEntity> bookList = mongoTemplate.find(bookquery, BookEntity.class,BOOK_COLLECTION_NAME);
        List<FilmEntity> filmList = mongoTemplate.find(filmquery, FilmEntity.class,FILM_COLLECTION_NAME);
        List<Team> teamList = mongoTemplate.find(teamquery, Team.class,TEAM_COLLECTION_NAME);
        HashMap<String,List<?>> retmap= new HashMap<String,List<?>>();
        retmap.put("book",bookList);
        retmap.put("film",filmList);
        retmap.put("team",teamList);
        return retmap;
    }
}
