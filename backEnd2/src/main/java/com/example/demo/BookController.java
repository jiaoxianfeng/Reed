package com.example.demo;

import com.example.table.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class BookController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @PostMapping(value = "/book/find")
    public BookEntity findById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        BookEntity book=mongoTemplate.findOne(query, BookEntity.class,"Book");
        return book;
    }
    @PostMapping(value = "/book/update")
    public String update(@RequestBody Map<String,Object> map) {
        mongoTemplate.save(map);
        return map.get("id").toString();
    }
    @PostMapping(value = "/book/add")
    public String addNewBook(@RequestBody BookEntity book) {
        int[] score = {0, 0, 0, 0, 0};
        book.setScore(score);
        mongoTemplate.save(book);
        return book.getId().toString();
    }
    @PostMapping(value = "/book/score")//获取评分
    public double getScoreById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        BookEntity book=mongoTemplate.findOne(query, BookEntity.class);
        int[] score=book.getScore();
        double num=score[0]*2.0+score[1]*4.0+score[2]*6.0+score[3]*8.0+score[4]*10.0/(score[0]+score[1]+score[2]+score[3]+score[4]);
        return num;
    }
    @PostMapping(value = "/book/grade")//给评分
    public void gradeById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        BookEntity book=mongoTemplate.findOne(query, BookEntity.class);
        int[] score=book.getScore();
        String grade=map.get("grade").toString();
        int Grade=Integer.parseInt(grade);
        score[Grade-1]++;
        book.setScore(score);
        mongoTemplate.save(book);
    }
}

