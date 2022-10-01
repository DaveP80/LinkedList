package util;

import com.mongodb.client.*;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoUtil {

    private static MongoClient mClient;
    // Singleton for MongoClient
    // Creates a single connection pool internally
    private MongoClient getMongoClient() {
        if (mClient == null) {
            mClient = MongoClients.create("mongodb://localhost/");
        }
        return mClient;
    }

    // Utility method to get database instance
    public MongoDatabase getDB() {
        return getMongoClient().getDatabase("linkedlist");
    }
    public MongoCollection<Document> getUserCollection() {
        return getDB().getCollection("list");
    }
}
