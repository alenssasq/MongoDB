package p1;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

public class Damo4 {

    public static void main (String[] args) {
    //1. 连接到mongodb服务
    MongoClient mongoClient = new MongoClient("localhost", 27017);

    //2. 连接数据库，你需要指定数据库名称，如果指定的数据库不存在，mongo会自动创建数据库
    MongoDatabase db = mongoClient.getDatabase("hh");
        System.out.println("MongoDB连接成功");

    //3. 获得集合users
    MongoCollection<Document> collection = db.getCollection("users");//table

    Document find=new Document(  );
//        find.append( "age", new Document( "$gt", "33" ) );
//        find.append( "age", new Document( "$lt", "40" ) );
//        find.append( "userName", new Document( "$regex", ".大" ) );
        FindIterable<Document> findIterable=collection.find(find);
        MongoCursor<Document> iterator=findIterable.iterator();
        while(iterator.hasNext()){
            Document d=iterator.next();
            System.out.println(d);
        }

    }
}
