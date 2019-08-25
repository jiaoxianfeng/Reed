package com.example.demo;

import com.example.table.MusicEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class MusicController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @PostMapping(value = "/music/find")
    public MusicEntity findById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        MusicEntity music=mongoTemplate.findOne(query, MusicEntity.class,"Music");
        return music;
    }
    @PostMapping(value = "/music/update")
    public String update(@RequestBody Map<String,Object> map) {
        mongoTemplate.save(map);
        return map.get("id").toString();
    }
    @PostMapping(value = "/music/add")
    public String addNewMusic(@RequestBody MusicEntity music) {
        int[] score = {0, 0, 0, 0, 0};
        music.setScore(score);
        mongoTemplate.save(music);
        return music.getId().toString();
    }
    @PostMapping(value = "/music/score")//获取评分
    public double getScoreById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        MusicEntity music=mongoTemplate.findOne(query, MusicEntity.class);
        int[] score=music.getScore();
        double num=(score[0]*2.0+score[1]*4.0+score[2]*6.0+score[3]*8.0+score[4]*10.0)/(score[0]+score[1]+score[2]+score[3]+score[4]);
        return num;
    }
    @PostMapping(value = "/music/grade")//给评分
    public void gradeById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        MusicEntity music=mongoTemplate.findOne(query, MusicEntity.class);
        int[] score=music.getScore();
        String grade=map.get("grade").toString();
        int Grade=Integer.parseInt(grade);
        score[Grade-1]++;
        music.setScore(score);
        mongoTemplate.save(music);
    }

}

