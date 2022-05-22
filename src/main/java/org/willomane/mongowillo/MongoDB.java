package org.willomane.mongowillo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDB {

    private final String URI;
    private MongoClient client;

    public MongoDB(String uri){
        URI = uri;
    }

    public MongoDB connect(){
        client = MongoClients.create(URI);
        return this;
    }

    public MongoDatabase getDatabase(String key){
        return getClient().getDatabase(key);
    }

    public MongoClient getClient() {
        return client;
    }
}
