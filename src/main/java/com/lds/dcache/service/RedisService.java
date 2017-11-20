package com.lds.dcache.service;

import com.lds.dcache.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    public void addString(String key,String value)throws Exception{
        stringRedisTemplate.opsForValue().set(key,value);
    }

    public void addObject(String key,Object param) throws  Exception{
        redisTemplate.opsForValue().set(key,param);
        User user = (User)(redisTemplate.opsForValue().get(key));

        System.out.print(user.toString());
    }

}
