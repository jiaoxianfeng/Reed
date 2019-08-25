package com.example.Controller;

import com.example.Database.Posting;
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

import static com.example.StaticFunc.Static.GetCurrentTime;

@RestController
public class PostingController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.Posting}")
    private String POSTING_COLLECTION_NAME;

    @PostMapping(value = "/Posting/Add")
    public String AddPosting(@RequestBody Posting posting) {
        posting.setPostTime(GetCurrentTime());
        mongoTemplate.save(posting);
        return posting.getId().toString();
    }

    @PostMapping(value = "/Posting/SearchHistory")
    public List<Posting> SearchPostingHistory(@RequestBody Map<String,Object> map) {
        String account = map.get("account").toString();
        Query query = new Query(Criteria.where("account").is(account));
        return mongoTemplate.find(query,Posting.class,POSTING_COLLECTION_NAME);
    }

    public Posting FindPostingById(String id) {
        return mongoTemplate.findById(id,Posting.class);
    }
}






