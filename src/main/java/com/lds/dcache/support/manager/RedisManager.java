package com.lds.dcache.support.manager;

import com.lds.dcache.support.CacheExConfig;
import com.lds.dcache.support.CacheExManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.Set;

public class RedisManager implements CacheExManager{

    @Autowired
    RedisTemplate redisTemplate;



    @Override
    @CacheExConfig(cacheNames = "sss")
    public Object get(String key) {

        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public Set<Object> getAll(String pattern) {
        return null;
    }

    @Override
    public void set(String key, Serializable value, int seconds) {

    }

    @Override
    public void set(String key, Serializable value) {

    }

    @Override
    public Boolean exists(String key) {
        return null;
    }

    @Override
    public void del(String key) {

    }

    @Override
    public void delAll(String pattern) {

    }

    @Override
    public String type(String key) {
        return null;
    }

    @Override
    public Boolean expire(String key, int seconds) {
        return null;
    }

    @Override
    public Boolean expireAt(String key, long unixTime) {
        return null;
    }

    @Override
    public Long ttl(String key) {
        return null;
    }

    @Override
    public Object getSet(String key, Serializable value) {
        return null;
    }

    @Override
    public boolean lock(String key) {
        return false;
    }

    @Override
    public void unlock(String key) {

    }

    @Override
    public void hset(String key, Serializable field, Serializable value) {

    }

    @Override
    public Object hget(String key, Serializable field) {
        return null;
    }

    @Override
    public void hdel(String key, Serializable field) {

    }

    @Override
    public boolean setnx(String key, long value) {
        return false;
    }

    @Override
    public void sadd(String key, Serializable value) {

    }

    @Override
    public Set<?> sall(String key) {
        return null;
    }

    @Override
    public boolean sdel(String key, Serializable value) {
        return false;
    }
}
