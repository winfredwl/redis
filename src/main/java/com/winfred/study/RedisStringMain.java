package com.winfred.study;

import redis.clients.jedis.Jedis;

/**
 * Redis Java String(字符串) 实例
 *
 * @author Winfred.Wang
 * @since 2017/03/29
 */
public class RedisStringMain {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
//        Jedis jedis = new Jedis("121.43.147.84");
//        Jedis jedis = new Jedis("121.43.147.84", 6379);
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server successfully");
        //设置 redis 字符串数据
        jedis.set("testkey", "redis服务测试上传数据");
        // 获取存储的数据并输出
        System.out.println("从redis获取的数据: " + jedis.get("testkey"));
    }
}
