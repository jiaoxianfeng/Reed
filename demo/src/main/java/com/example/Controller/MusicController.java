package com.example.Controller;

import com.example.Database.MusicEntity;
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
public class MusicController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.Music}")
    private String MUSIC_COLLECTION_NAME;

    /**
     * 查找音乐
     * @param map
     * @return
     */
    @PostMapping(value = "/music/find")
    public MusicEntity findById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        MusicEntity music=mongoTemplate.findOne(query, MusicEntity.class,MUSIC_COLLECTION_NAME);
        return music;
    }

    /**
     * 更新音乐
     * @param music
     * @return
     */
    @PostMapping(value = "/music/update")
    public String update(@RequestBody MusicEntity music) {
        mongoTemplate.save(music);
        return music.getId().toString();
    }

    /**
     * 添加音乐
     * @param music
     * @return
     */
    @PostMapping(value = "/music/add")
    public String addNewMusic(@RequestBody MusicEntity music) {
        int[] score = {0, 0, 0, 0, 0};
        music.setScore(score);
        mongoTemplate.save(music);
        return music.getId().toString();
    }

    /**
     * 获取评分
     * @param map
     * @return
     */
    @PostMapping(value = "/music/score")
    public double getScoreById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        MusicEntity music=mongoTemplate.findOne(query, MusicEntity.class);
        int[] score=music.getScore();
        if (score[0]+score[1]+score[2]+score[3]+score[4] == 0)
            return 0.0;
        double num=(score[0]*2.0+score[1]*4.0+score[2]*6.0+score[3]*8.0+score[4]*10.0)/(score[0]+score[1]+score[2]+score[3]+score[4]);
        return num;
    }

    /**
     * 打分评分
     * @param map
     */
    @PostMapping(value = "/music/grade")
    public void gradeById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        MusicEntity music=mongoTemplate.findOne(query, MusicEntity.class);
        int[] score=music.getScore();
        String grade=map.get("grade").toString();
        int Grade=Integer.parseInt(grade);
        if (Grade < 1 || Grade > 5)
            return;
        score[Grade-1]++;
        music.setScore(score);
        mongoTemplate.save(music);
    }

}

