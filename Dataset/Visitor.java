package com.example.Dataset;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Visitor")
public class Visitor {
    @Id
    private String Id;

    public String getId() { return this.Id; }
    public void setId(String id) { this.Id = id; }

    @Override
    public String toString() {
        return this.Id;
    }

}
