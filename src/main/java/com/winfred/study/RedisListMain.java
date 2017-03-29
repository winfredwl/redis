package com.winfred.study;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Redis Java List(列表) 实例
 *
 * @author Winfred.Wang
 * @since 2017/03/29
 */
public class RedisListMain {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server successfully");
        //存储数据到列表中
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("tutorial-list", 0, -1);
        for (String aList : list) {
            System.out.println("Stored string in redis:: " + aList);
        }
    }
}
