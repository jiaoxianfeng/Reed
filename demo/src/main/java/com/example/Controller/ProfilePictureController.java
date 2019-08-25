package com.example.Controller;

import com.example.Database.ProfilePicture;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;

@RestController
public class ProfilePictureController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.ProfilePicture}")
    private String PROFILE_PICTURE_COLLECTION_NAME;

    @PostMapping("/ProfilePicture/uploadImage")
    @ResponseBody
    public String uploadImage(@RequestParam(value = "image") MultipartFile file, @RequestParam(value = "account") String account) {
        if(file.isEmpty())
            return "Empty";
        String fileName = file.getOriginalFilename();
        System.err.println(account);
        String picId = "";
        try {
            ProfilePicture picture = new ProfilePicture();
            picture.setAccount(account);
            picture.setName(fileName);
            picture.setCreatedTime(new Date());
            picture.setContent(new Binary(file.getBytes()));
            picture.setContentType(file.getContentType());
            picture.setSize(file.getSize());
            mongoTemplate.save(picture);
            picId = picture.getId().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picId;
    }

    @GetMapping(value = "/ProfilePicture/imageId/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    @ResponseBody
    public byte[] FindPictureById(@PathVariable String id){
        byte[] data = null;
        ProfilePicture file = mongoTemplate.findById(id, ProfilePicture.class,PROFILE_PICTURE_COLLECTION_NAME);
        if(file != null){
            data = file.getContent().getData();
        }
        return data;
    }

    @GetMapping(value = "/ProfilePicture/UserAccount/{account}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    @ResponseBody
    public byte[] FindPictureByAccount(@PathVariable String account){
        byte[] data = null;
        Query query = new Query(Criteria.where("account").is(account));
        ProfilePicture file = mongoTemplate.findOne(query, ProfilePicture.class,PROFILE_PICTURE_COLLECTION_NAME);
        if(file != null){
            data = file.getContent().getData();
        }
        return data;
    }

}
