package com.atguigu.hdfs;

import javax.security.auth.login.Configuration;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.Path;

/*
客户端代码常用套路
1.获取一个客户端对象
2.执行相关的操作命令
3.关闭资源
 */
public class HdfsClient {


    public void testmkdir() throws URISyntaxException {

        URI uri = new URI("hdfs://hadoop001:50070");

        Configuration configuration = new Configuration();

        String user = "hadoop";

        FileSystem fs = FileSystem.get(uri, configuration, user);

        fs.mkdirs(new Path("/xiyou/huaguoshan"));

        fs.close();
    }
}
