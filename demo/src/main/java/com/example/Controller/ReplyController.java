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

    /**
     * 查找书、影、音、帖下的回复
     * @param map map中需要存在一个以"id"为键的键值对,这个id是要查找回复的书籍、影视、音乐、帖子的ID
     * @return
     */

    @PostMapping(value ="/reply/list")
    public List<ReplyEntity> List(@RequestBody Map<String,Object> map) {
        String id = map.get("id").toString();
        Query query = new Query(Criteria.where("placeId").is(id));
        List<ReplyEntity> replyList = mongoTemplate.find(query, ReplyEntity.class,REPLY_COLLECTION_NAME);
        return replyList;
    }

    /**
     * 更新（暂时不用）
     * @param reply
     * @return
     */
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

