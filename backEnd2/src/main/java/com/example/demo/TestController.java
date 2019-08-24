package com.example.demo;

import com.example.table.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;


@RestController
public class TestController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @PostMapping(value = "/find")
    public BookEntity find(@RequestBody String id) {
        Query query = new Query().addCriteria(Criteria.where("name").is("czz"));
        BookEntity book=mongoTemplate.findOne(query, BookEntity.class);
        return book;
    }
    @PostMapping(value = "/add")
    public void addNewBook(@RequestBody BookEntity book) {
        mongoTemplate.save(book);
    }
}

