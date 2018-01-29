package p1;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Arrays;

public class Damo5 {

    public static void main (String[] args) {
    //1. 连接到mongodb服务
    MongoClient mongoClient = new MongoClient("localhost", 27017);

    //2. 连接数据库，你需要指定数据库名称，如果指定的数据库不存在，mongo会自动创建数据库
    MongoDatabase db = mongoClient.getDatabase("hh");
        System.out.println("MongoDB连接成功");

    //3. 获得集合users
    MongoCollection<Document> collection = db.getCollection("users");//table

    Document find=new Document("_id", new ObjectId( "5a54a66a5f73422c7ba7212b" ) );
        Document doc = new Document();
        doc.append( "age","100" );
        doc.append( "userName","张大明" );
        doc.append( "sex","女" );
        doc.append( "remark", "xcxxxxxxxx" );
        doc.append( "userPwd", "12333" );
        doc.append( "category", Arrays.asList( "aaa","dd" ) );
        UpdateResult one = collection.replaceOne( find, doc);
        System.out.println(one);

    }
}
