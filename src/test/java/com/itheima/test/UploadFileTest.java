package com.itheima.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Set;

public class UploadFileTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){
        //redis,清除所有菜品的缓存数据
        Set keys = redisTemplate.keys("dish_*");
        redisTemplate.delete(keys);
    }
}
