package com.example.Controller;

import com.example.Database.Collection;
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
public class CollectionController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.Collection}")
    private String  COLLECTION_COLLECTION_NAME;


    @PostMapping(value = "/Collection/ChangeStatus")
    public String ChangeCollectionStatus(@RequestBody Map<String,Object> map) {
        String account = map.get("account").toString();
        String postingId = map.get("postingId").toString();
        if (IsAccountCollectPosting(account,postingId)) {
            RemoveCollection(account, postingId);
            return "success remove collection";
        }
        Collection collection = new Collection();
        collection.setAccount(account);
        collection.setPostingId(postingId);
        collection.setCollectionTime(GetCurrentTime());
        mongoTemplate.save(collection);
        return "success add collection";
    }

    @PostMapping(value = "/Collection/CountNum")
    public Long CountCollectionNum(@RequestBody Map<String, Object> map) {
        String postingId = map.get("postingId").toString();
        Query query = new Query(Criteria.where("postingId").is(postingId));
        return mongoTemplate.count(query,COLLECTION_COLLECTION_NAME);
    }

    public void RemoveCollection(String account, String postingId) {
        Query query = new Query(Criteria.where("account").is(account).and("postingId").is(postingId));
        mongoTemplate.remove(query,Collection.class,COLLECTION_COLLECTION_NAME);
    }

    public boolean IsAccountCollectPosting(String account, String postingId) {
        return FindCollectionByAccountAndPosting(account, postingId) != null;
    }

    public Collection FindCollectionByAccountAndPosting(String account, String postingId) {
        Query query = new Query(Criteria.where("account").is(account).and("postingId").is(postingId));
        return mongoTemplate.findOne(query,Collection.class,COLLECTION_COLLECTION_NAME);
    }
}
