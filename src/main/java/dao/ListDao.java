package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import util.MongoUtil;

import java.util.ArrayList;
import java.util.List;

public class ListDao {
    MongoUtil mongoUtil = new MongoUtil();
    MongoDatabase database = mongoUtil.getDB();
    MongoCollection<Document> collection = database.getCollection("list");

    public void insertList(List<Integer> list, List<Integer> list2, List<Integer> list3) throws InterruptedException {


        Document document = new Document("Initial Random ints", list);
        document.put("reversed", list2);
        document.put("reversed and append n[i]", list3);
        mongoUtil.getUserCollection().insertOne(document);
        MongoCursor<Document> cur = collection.find().skip((int) collection.countDocuments()-1).iterator();
        while (cur.hasNext()) {
            Document doc = cur.next();
            ArrayList<Object> values = new ArrayList<>(doc.values());
            System.out.println("returned a Large Object!");
            Thread.sleep(1500);
            System.out.println(values.get(3));
        }
    }
    public void delete() {
        BasicDBObject BSON = new BasicDBObject();
        collection.deleteMany(BSON);
    }
}
