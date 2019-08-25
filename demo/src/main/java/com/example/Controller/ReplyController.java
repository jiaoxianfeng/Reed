package com.example.Controller;

import com.example.Database.ReplyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class ReplyController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.Reply}")
    private String REPLY_COLLECTION_NAME;

    /**
     * 根据用户ID和类型ID查找评论
     * @param map map中需要存在一个以"id"为键的键值对和一个以"type"为键的键值对
     * @return
     */
    @PostMapping(value = "/reply/find")
    public List<ReplyEntity> findReplyByReplyerIdAndType(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        int type = Integer.parseInt(map.get("type").toString());
        Query query = new Query(Criteria.where("replyerId").is(id).and("type").is(type));
        List<ReplyEntity> replyList = mongoTemplate.find(query, ReplyEntity.class,REPLY_COLLECTION_NAME);
        return replyList;
    }

    //以上是个人主页内容的评论
    @PostMapping(value ="/reply/pagenate")
    public String pagenate(@RequestBody Map<String,Object> map) {
        return "";
    }
    @PostMapping(value = "/reply/update")
    public String update(@RequestBody ReplyEntity reply) {
        mongoTemplate.save(reply);
        return reply.getId().toString();
    }

    /**
     * 添加评论
     * @param reply
     * @return Reply's ObjectId
     */
    @PostMapping(value = "/reply/add")
    public String addNewReply(@RequestBody ReplyEntity reply) {
        mongoTemplate.save(reply);
        return reply.getId().toString();
    }

}

