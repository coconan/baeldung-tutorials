package com.baeldung;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;

public class LettuceExample {
    public static void main(String[] args) {
        RedisClient redisClient = RedisClient.create("redis://localhost:6379/0");
        StatefulRedisConnection<String, String> connection = redisClient.connect();

        System.out.println("Connected to Redis");

        connection.close();
        redisClient.shutdown();
    }
}
