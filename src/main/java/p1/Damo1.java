package p1;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Damo1 {

    public static void main (String[] args) {
        //1. 连接到mongodb服务
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        //2. 连接数据库，你需要指定数据库名称，如果指定的数据库不存在，mongo会自动创建数据库
        MongoDatabase db = mongoClient.getDatabase("hh");
        System.out.println("MongoDB连接成功");

        //3. 权限认证：如果你的 Mongo需要验证用户名及密码，本实例中Mongo数据库无需用户名密码验证。
        // boolean auth = db.authenticate(myUserName, myPassword);
    }
}
