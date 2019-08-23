package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "test")
public class Website {
    @Id
    @Field("_id")
    private String id;
    @Field("name")
    private String name;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {return this.name;}
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.id + " " + this.name;
    }
}
