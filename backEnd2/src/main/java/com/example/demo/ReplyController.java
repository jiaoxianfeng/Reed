package com.example.demo;

import com.example.table.ReplyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class ReplyController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @PostMapping(value = "/reply/bookByReplyer")
    public ReplyEntity findBookReplyByReplyerId(@RequestBody Map<String,Object> map) {
        String id = map.get("replyerid").toString();
        Query query = new Query().addCriteria(Criteria.where("replyerId").is(id).and("type").is(1));
        ReplyEntity reply=mongoTemplate.findOne(query, ReplyEntity.class,"Reply");
        return reply;
    }
    @PostMapping(value = "/reply/movieByReplyer")
    public ReplyEntity findMovieReplyByReplyerId(@RequestBody Map<String,Object> map) {
        String id = map.get("replyerid").toString();
        Query query = new Query().addCriteria(Criteria.where("replyerId").is(id).and("type").is(2));
        ReplyEntity reply=mongoTemplate.findOne(query, ReplyEntity.class,"Reply");
        return reply;
    }
    @PostMapping(value = "/reply/musicByReplyer")
    public ReplyEntity findMusicReplyByReplyerId(@RequestBody Map<String,Object> map) {
        String id = map.get("replyerid").toString();
        Query query = new Query().addCriteria(Criteria.where("replyerId").is(id).and("type").is(3));
        ReplyEntity reply=mongoTemplate.findOne(query, ReplyEntity.class,"Reply");
        return reply;
    }
    @PostMapping(value = "/reply/PostByReplyer")
    public ReplyEntity findPostReplyByReplyerId(@RequestBody Map<String,Object> map) {
        String id = map.get("replyerid").toString();
        Query query = new Query().addCriteria(Criteria.where("replyerId").is(id).and("type").is(4));
        ReplyEntity reply=mongoTemplate.findOne(query, ReplyEntity.class,"Reply");
        return reply;
    }
    //以上是个人主页内容的评论
    @PostMapping(value ="/reply/pagenate")
    public String pagenate(@RequestBody MapMap<String,Object> map)
    {

    }
    @PostMapping(value = "/reply/update")
    public String update(@RequestBody ReplyEntity reply) {
        mongoTemplate.save(reply);
        return reply.getId().toString();
    }
    @PostMapping(value = "/reply/add")
    public String addNewReply(@RequestBody ReplyEntity reply) {
        mongoTemplate.save(reply);
        return reply.getId().toString();
    }

}

