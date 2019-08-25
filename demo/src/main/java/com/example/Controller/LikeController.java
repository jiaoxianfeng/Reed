package com.example.Controller;

import com.example.Database.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.example.StaticFunc.Static.GetCurrentTime;

@RestController
public class LikeController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.Like}")
    private String LIKE_COLLECTION_NAME;

    @PostMapping(value = "/Like/ChangeStatus")
    public String ChangeLikeStatus(@RequestBody Map<String,Object> map) {
        String account = map.get("account").toString();
        String postingId = map.get("postingId").toString();
        if (IsAccountLikePosting(account,postingId)) {
            RemoveLike(account, postingId);
            return "success remove like";
        }
        Like like = new Like();
        like.setAccount(account);
        like.setPostingId(postingId);
        like.setLikeTime(GetCurrentTime());
        mongoTemplate.save(like);
        return "success add like";
    }

    @PostMapping(value = "/Like/CountNum")
    public Long CountLikeNum(@RequestBody Map<String, Object> map) {
        String postingId = map.get("postingId").toString();
        Query query = new Query(Criteria.where("postingId").is(postingId));
        return mongoTemplate.count(query,LIKE_COLLECTION_NAME);
    }


    public void RemoveLike(String account, String postingId) {
        Query query = new Query(Criteria.where("account").is(account).and("postingId").is(postingId));
        mongoTemplate.remove(query,Like.class,LIKE_COLLECTION_NAME);
    }

    public boolean IsAccountLikePosting(String account, String postingId) {
        return FindLikeByAccountAndPosting(account, postingId) != null;
    }

    public Like FindLikeByAccountAndPosting(String account,String postingId) {
        Query query = new Query(Criteria.where("account").is(account).and("postingId").is(postingId));
        return mongoTemplate.findOne(query,Like.class);
    }
}
