package p1;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Damo2 {

    public static void main (String[] args) {
        //1. 连接到mongodb服务
//        MongoClient mongoClient = new MongoClient("localhost", 27017);

        //2. 连接数据库，你需要指定数据库名称，如果指定的数据库不存在，mongo会自动创建数据库
//        MongoDatabase db = mongoClient.getDatabase("hh");
//        System.out.println("MongoDB连接成功");


        //3. 获得集合users
//        MongoCollection<Document> collection = db.getCollection("users");//table
//
//      //  4. 创建Document对象
//         Document document = new Document("userName", "张大明");
//        document.append("sex", "男").append("age", 39).append("remark", "张小明他爹");
//
//       // 5. 插入一条数据
//        collection.insertOne(document);
//
//        System.out.println("插入一条数据成功");


//        //批量插入
//        List<Document> list = new ArrayList<Document>();
//       for(int i=1;i<=10;i++){
//           Document document=new Document( "age","424" );
//           list.add( document );
//       }
//        collection.insertMany(list);
//        System.out.println("批量插入成功");
    }
}
