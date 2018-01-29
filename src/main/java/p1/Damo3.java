package p1;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.types.ObjectId;

public class Damo3 {

    public static void main (String[] args) {


    //1. 连接到mongodb服务
    MongoClient mongoClient = new MongoClient("localhost", 27017);

    //2. 连接数据库，你需要指定数据库名称，如果指定的数据库不存在，mongo会自动创建数据库
    MongoDatabase db = mongoClient.getDatabase("hh");
        System.out.println("MongoDB连接成功");

    //3. 获得集合users
    MongoCollection<Document> collection = db.getCollection("users");//table

    ObjectId objectId = new ObjectId("5a5485054b55fb2eb41a05b1" );
    Document find = new Document( "_id",objectId );
        collection.deleteOne( find );

        System.out.println("删除成功");



    }
}
