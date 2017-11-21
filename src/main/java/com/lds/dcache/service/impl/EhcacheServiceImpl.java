package com.lds.dcache.service.impl;

import com.lds.dcache.service.EhcacheService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@CacheConfig(cacheNames = "user-cache")
public class EhcacheServiceImpl implements EhcacheService{

    //private static final String CACHE_NAME = "user-cache";

    @Override
    @Cacheable
    public String findUserById(long id) {
        System.out.print("没有走缓存");
        return "我是1000的结果";
    }

    @Override
    public List findAllUser() {
        return null;
    }

    @Override
    public void saveAndFlush(Object user) {

    }

    @Override
    public void deleteUserById(long id) {

    }
}
