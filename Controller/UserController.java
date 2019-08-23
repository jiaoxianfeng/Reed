package com.example.Controller;

import com.example.AesEncrypt.AesEncryptUtils;
import com.example.Dataset.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.QueryTimeoutException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.User}")
    private String USER_COLLECTION_NAME;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String find() throws Exception {
        List<User> users = mongoTemplate.findAll(User.class);
        return AesEncryptUtils.encrypt(users.toString());
    }

    @PostMapping(value = "/AddUser")
    public String AddUser(@RequestBody User user) {
        if (!IsAccountExist(user.getAccount())) {
            user.setJoinTime(GetCurrentTime());
            mongoTemplate.save(user);
        }
        else
            return "Account Has Existed";
        return "successful";
    }

    @PostMapping(value = "/ModifyUserPassword")
    public String ModifyUserPassword(@RequestBody User user) {
        String account = user.getAccount();
        String password = user.getPassword();
        if (password == null)
            return "data is not supplied";
        return ModifyUserMulti(user);
    }

    @PostMapping(value = "/ModifyUserUserName")
    public String ModifyUserUserName(@RequestBody User user) {
        String account = user.getAccount();
        String username = user.getUsername();
        if (username == null)
            return "data is not supplied";
        return ModifyUserMulti(user);
    }

    @PostMapping(value = "/ModifyUserIntroduction")
    public String ModifyUserIntroduction(@RequestBody User user) {
        String account = user.getAccount();
        String introduction = user.getIntroduction();
        if (introduction == null)
            return "data is not supplied";
        return ModifyUserMulti(user);
    }

    @PostMapping(value = "/ModifyUserGender")
    public String ModifyUserGender(@RequestBody User user) {
        String account = user.getAccount();
        String gender = user.getGender();
        if (gender == null)
            return "Data Is Not Supplied";
        return ModifyUserMulti(user);
    }

    public String ModifyUserMulti(User user) {
        String account = user.getAccount();
        if (account == null)
            return "Account Is Not Supplied";
        if (!IsAccountExist(account))
            return "Account Is Not Existed";
        Query query = new Query(Criteria.where("account").is(account));
        String password = user.getPassword();
        if (password != null) {
            Update update = new Update().set("password",password);
            mongoTemplate.updateFirst(query,update,USER_COLLECTION_NAME);
        }
        String username = user.getUsername();
        if(username != null) {
            Update update = new Update().set("username",username);
            mongoTemplate.updateFirst(query,update,USER_COLLECTION_NAME);
        }
        String introduction = user.getIntroduction();
        if(introduction != null) {
            Update update = new Update().set("introduction",introduction);
            mongoTemplate.updateFirst(query,update,USER_COLLECTION_NAME);
        }
        String gender = user.getGender();
        if(gender != null) {
            Update update = new Update().set("gender",gender);
            mongoTemplate.updateFirst(query,update,USER_COLLECTION_NAME);
        }
        return "successful";
    }

    public boolean IsAccountExist(String Account) {
        Map map = QueryUserByAccount(Account);
        if (map == null)
            return false;
        else
            return true;
    }

    public Map QueryUserByAccount(String Account) {
        Query query = new Query(Criteria.where("account").is(Account));
        return mongoTemplate.findOne(query,Map.class,USER_COLLECTION_NAME);
    }

    public static Date GetCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        Date now = new Date();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR_OF_DAY,8);
        return calendar.getTime();
    }
}
