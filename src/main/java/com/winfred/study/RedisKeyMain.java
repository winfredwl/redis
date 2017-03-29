package com.winfred.study;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * Redis Java Keys 实例
 *
 * @author Winfred.Wang
 * @since 2017/03/29
 */
public class RedisKeyMain {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");

        // 获取数据并输出
        List<String> list = new ArrayList<String>();
        list.addAll(jedis.keys("*"));
        for (String aList : list) {
            System.out.println("List of stored keys:: " + aList);
        }
    }
}
