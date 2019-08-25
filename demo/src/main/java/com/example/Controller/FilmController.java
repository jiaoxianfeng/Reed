package com.example.Controller;

import com.example.Database.FilmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${com.example.mongodb.collection.Film}")
    private String FILM_COLLECTION_NAME;

    /**
     * 查找图书
     * @param map 同book
     * @return
     */
    @PostMapping(value = "/film/find")
    public FilmEntity findById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        FilmEntity film=mongoTemplate.findOne(query, FilmEntity.class,FILM_COLLECTION_NAME);
        return film;
    }

    /**
     * 更新图书
     * @param film
     * @return
     */
    @PostMapping(value = "/film/update")
    public String update(@RequestBody FilmEntity film) {
        mongoTemplate.save(film);
        return film.getId().toString();
    }

    /**
     * 添加书籍
     * @param film
     * @return
     */
    @PostMapping(value = "/film/add")
    public String addNewFilm(@RequestBody FilmEntity film) {
        int[] score = {0, 0, 0, 0, 0};
        film.setScore(score);
        mongoTemplate.save(film);
        return film.getId().toString();
    }

    /**
     * 计算评分
     * @param map
     * @return
     */
    @PostMapping(value = "/film/score")
    public double getScoreById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        FilmEntity film=mongoTemplate.findOne(query, FilmEntity.class);
        int[] score=film.getScore();
        if (score[0]+score[1]+score[2]+score[3]+score[4] == 0)
            return 0.0;
        double num=score[0]*2.0+score[1]*4.0+score[2]*6.0+score[3]*8.0+score[4]*10.0/(score[0]+score[1]+score[2]+score[3]+score[4]);
        return num;
    }

    /**
     * 打分评价
     * @param map
     */
    @PostMapping(value = "/film/grade")//给评分
    public void gradeById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        FilmEntity film=mongoTemplate.findOne(query, FilmEntity.class);
        int[] score=film.getScore();
        String grade=map.get("grade").toString();
        int Grade=Integer.parseInt(grade);
        if (Grade < 1 || Grade > 5)
            return;
        score[Grade-1]++;
        film.setScore(score);
        mongoTemplate.save(film);
    }
}

