package com.example.demo;

import com.example.table.FilmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class FilmController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @PostMapping(value = "/film/find")
    public FilmEntity findById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        FilmEntity film=mongoTemplate.findOne(query, FilmEntity.class);
        return film;
    }
    @PostMapping(value = "/film/update")
    public String update(@RequestBody Map<String,Object> map) {
        mongoTemplate.save(map);
        return map.get("id").toString();
    }
    @PostMapping(value = "/film/add")
    public String addNewFilm(@RequestBody FilmEntity film) {
        int[] score = {0, 0, 0, 0, 0};
        film.setScore(score);
        mongoTemplate.save(film);
        return film.getId().toString();
    }
    @PostMapping(value = "/film/score")//获取评分
    public double getScoreById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        FilmEntity film=mongoTemplate.findOne(query, FilmEntity.class);
        int[] score=film.getScore();
        double num=score[0]*2.0+score[1]*4.0+score[2]*6.0+score[3]*8.0+score[4]*10.0/(score[0]+score[1]+score[2]+score[3]+score[4]);
        return num;
    }
    @PostMapping(value = "/film/grade")//给评分
    public void gradeById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        FilmEntity film=mongoTemplate.findOne(query, FilmEntity.class);
        int[] score=film.getScore();
        String grade=map.get("grade").toString();
        int Grade=Integer.parseInt(grade);
        score[Grade-1]++;
        film.setScore(score);
        mongoTemplate.save(film);
    }
}

