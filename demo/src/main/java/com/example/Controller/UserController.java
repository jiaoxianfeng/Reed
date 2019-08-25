package com.example.Controller;

import com.example.StaticFunc.AesEncryptUtils;
import com.example.Database.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static com.example.StaticFunc.Static.GetCurrentTime;

@RestController
public class UserController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.User}")
    private String USER_COLLECTION_NAME;

    @RequestMapping(value = "/User/FindAll", method = RequestMethod.GET)
    public String FindAllUser() throws Exception {
        List<User> users = mongoTemplate.findAll(User.class);
        return AesEncryptUtils.encrypt(users.toString());
    }

    @PostMapping(value = "/User/Add")
    public String AddUser(@RequestBody User user) {
        if (!IsAccountExist(user.getAccount())) {
            user.setJoinTime(GetCurrentTime());
            mongoTemplate.save(user);
        }
        else
            return "Account Has Existed";
        return "successful";
    }

    @PostMapping(value = "/User/Login")
    public Object Login(@RequestBody User user) {
        if (!IsAccountExist(user.getAccount()))
            return 0;
        else {
            User temp = QueryUserByAccount(user.getAccount());
            if (temp.getPassword().equals(user.getPassword()))
                return temp;
            else
                return 1;
        }
    }

    @PostMapping(value = "/User/ModifyPassword")
    public String ModifyUserPassword(@RequestBody User user) {
        String account = user.getAccount();
        String password = user.getPassword();
        if (password == null)
            return "data is not supplied";
        return ModifyUserMulti(user);
    }

    @PostMapping(value = "/User/ModifyUserName")
    public String ModifyUserUserName(@RequestBody User user) {
        String account = user.getAccount();
        String username = user.getUsername();
        if (username == null)
            return "data is not supplied";
        return ModifyUserMulti(user);
    }

    @PostMapping(value = "/User/ModifyIntroduction")
    public String ModifyUserIntroduction(@RequestBody User user) {
        String account = user.getAccount();
        String introduction = user.getIntroduction();
        if (introduction == null)
            return "data is not supplied";
        return ModifyUserMulti(user);
    }

    @PostMapping(value = "/yUse/ModifrGender")
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
        User user = QueryUserByAccount(Account);
        if (user == null)
            return false;
        else
            return true;
    }

    public User QueryUserByAccount(String Account) {
        Query query = new Query(Criteria.where("account").is(Account));
        return mongoTemplate.findOne(query,User.class,USER_COLLECTION_NAME);
    }

}
