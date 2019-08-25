package com.example.Controller;

import com.example.Database.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class BookController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.Book}")
    private String BOOK_COLLECTION_NAME;

    /**
     * 查找图书
     * @param map map中存在一个以"id"为键的键值对,用于查询对应图书
     * @return book实体类
     */
    @PostMapping(value = "/book/find")
    public BookEntity findById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        BookEntity book=mongoTemplate.findOne(query, BookEntity.class,BOOK_COLLECTION_NAME);
        return book;
    }

    /**
     * 修改图书信息
     * @param book 保存了修改过的图书信息
     * @return book's ObjectId
     */
    @PostMapping(value = "/book/update")
    public String update(@RequestBody BookEntity book) {
        mongoTemplate.save(book);
        return book.getId().toString();
    }

    /**
     * 添加图书
     * @param book
     * BookEntity 中除了id和score不需要添加数据，剩下的都需要添加数据
     * 日期可以直接使用YYYY-MM-DD的格式
     * @return book's ObjectId
     */
    @PostMapping(value = "/book/add")
    public String addNewBook(@RequestBody BookEntity book) {
        int[] score = {0, 0, 0, 0, 0};
        book.setScore(score);
        mongoTemplate.save(book);
        return book.getId().toString();
    }

    /**
     * 获取图书评分
     * @param map map中存在一个以"id"为键的键值对,用于查询对应图书
     * @return book's grade
     */
    @PostMapping(value = "/book/score")
    public double getScoreById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        BookEntity book=mongoTemplate.findOne(query, BookEntity.class);
        int[] score=book.getScore();
        if (score[0]+score[1]+score[2]+score[3]+score[4] == 0)
            return 0.0;
        double num=score[0]*2.0+score[1]*4.0+score[2]*6.0+score[3]*8.0+score[4]*10.0/(score[0]+score[1]+score[2]+score[3]+score[4]);
        return num;
    }

    /**
     * 给图书评分
     * @param map map中需要存在一个以"id"为键的键值对和一个以"grade"为键的键值对
     */
    @PostMapping(value = "/book/grade")
    public void gradeById(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        BookEntity book=mongoTemplate.findOne(query, BookEntity.class);
        int[] score=book.getScore();
        String grade=map.get("grade").toString();
        int Grade=Integer.parseInt(grade);
        if (Grade < 1 || Grade > 5)
            return;
        score[Grade-1]++;
        book.setScore(score);
        mongoTemplate.save(book);
    }
}

