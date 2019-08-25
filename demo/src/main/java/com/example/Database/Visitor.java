package com.example.Database;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Visitor")
public class Visitor {
    @Id
    private ObjectId id;

    @Override
    public String toString() {
        return this.id.toString();
    }

}
